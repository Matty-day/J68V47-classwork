package snake;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

// The snakegame class extends JPanel and implements ActionListener and KeyListener for game functionality
public class snakegame extends JPanel implements ActionListener, KeyListener {

    // Constructor for initializing the game with board width and height
    snakegame(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);
        addKeyListener(this);
        setFocusable(true);

        // Initialize game elements
        snakeHead = new Tile(1, 1);
        snakeBody = new ArrayList<Tile>();
        food = new Tile(5, 5);
        random = new Random();
        placeFood();
        velocityx = 0;
        velocityy = 0;
        gameloop = new Timer(100, this);
        gameloop.start();
        loadHighScore(); // Load the high score from a file
    }

    // Method to reset the game to its initial state
    public void resetGame() {
        snakeHead = new Tile(1, 1);
        snakeBody.clear();
        placeFood();
        gameOver = false;
        velocityx = 0;
        velocityy = 0;
        gameloop.start();
    }

    // Inner class representing a tile on the game board
    private class Tile {
        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // Game properties
    int boardWidth;
    int boardHeight;
    int tilesize = 60;
    Tile snakeHead;
    ArrayList<Tile> snakeBody;
    Tile food;
    Random random;
    Timer gameloop;
    int velocityx;
    int velocityy;
    boolean gameOver = false;
    int highScore = 0;

    // Paint component method for drawing game elements
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    // Method to draw the game elements
    public void draw(Graphics g) {
        // Draw the grid lines
        for (int i = 0; i < boardWidth / tilesize; i++) {
            g.drawLine(i * tilesize, 0, i * tilesize, boardHeight);
            g.drawLine(0, i * tilesize, boardWidth, i * tilesize);
        }

        // Draw the food
        g.setColor(Color.red);
        g.fillRect(food.x * tilesize, food.y * tilesize, tilesize, tilesize);

        // Draw the snake head
        g.setColor(Color.green);
        g.fillRect(snakeHead.x * tilesize, snakeHead.y * tilesize, tilesize, tilesize);

        // Draw the snake body
        for (Tile snakePart : snakeBody) {
            g.fillRect(snakePart.x * tilesize, snakePart.y * tilesize, tilesize, tilesize);
        }

        // Draw the score and high score
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        if (gameOver) {
            g.setColor(Color.red);
            g.drawString("Game Over. Score: " + snakeBody.size(), tilesize - 16, tilesize);
        } else {
            g.setColor(Color.white);
            g.drawString("Score: " + snakeBody.size(), tilesize - 16, tilesize);
            g.drawString("High Score: " + highScore, 10, 20);
        }
    }

    // Method to place food at a random location
    public void placeFood() {
        food.x = random.nextInt(boardWidth / tilesize);
        food.y = random.nextInt(boardHeight / tilesize);
    }
    // Method to check for collision between two tiles
    public boolean collision(Tile tile1, Tile tile2) {
        return tile1.x == tile2.x && tile1.y == tile2.y;
    }
    // Method to handle the movement of the snake
    public void move() {
        if (collision(snakeHead, food)) {
            snakeBody.add(new Tile(food.x, food.y));
            placeFood();
        }

        for (int i = snakeBody.size() - 1; i >= 0; i--) {
            Tile snakePart = snakeBody.get(i);
            if (i == 0) {
                snakePart.x = snakeHead.x;
                snakePart.y = snakeHead.y;
            } else {
                Tile prevSnakePart = snakeBody.get(i - 1);
                snakePart.x = prevSnakePart.x;
                snakePart.y = prevSnakePart.y;
            }
        }
        snakeHead.x += velocityx;
        snakeHead.y += velocityy;

        for (int i = 0; i < snakeBody.size(); i++) {
            Tile snakePart = snakeBody.get(i);
            if (collision(snakeHead, snakePart)) {
                gameOver = true;
            }
        }
        if (snakeHead.x < 0 || snakeHead.x >= boardWidth / tilesize ||
                snakeHead.y < 0 || snakeHead.y >= boardHeight / tilesize) {
            gameOver = true;
        }

        if (gameOver) {
            if (snakeBody.size() > highScore) {
                highScore = snakeBody.size();
            }

        }

    }

    // Key pressed method for handling keyboard input
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && velocityy != 1) {
            velocityx = 0;
            velocityy = -1;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && velocityy != -1) {
            velocityx = 0;
            velocityy = 1;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && velocityx != -1) {
            velocityx = 1;
            velocityy = 0;

        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && velocityx != 1) {
            velocityx = -1;
            velocityy = 0;
        }
    }
    // Method required by KeyListener but not used
    @Override
    public void keyReleased(KeyEvent e) {

    }
    // Load high score from a file
    private void loadHighScore() {
        try {
            File file = new File("highscore.txt");
            // Check if the file exists and read the high score
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
                String line = reader.readLine();
                // Parse the high score from the file
                if (line != null && !line.isEmpty()) {
                    highScore = Integer.parseInt(line);
                }

                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Action performed method for handling game loop
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            move();
            repaint();
        } else {
            System.out.println("Game Over! Score: " + snakeBody.size());
            System.out.println("Starting new game...");
            resetGame();
        }
// Update and save high score if it's beaten
        if (snakeBody.size() > highScore) {
            highScore = snakeBody.size();
            saveHighScore();
        }
    }

    // Save high score to a file
    private void saveHighScore() {
        try {
            File file = new File("highscore.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(Integer.toString(highScore));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


// Method required by KeyListener but not used
    @Override
    public void keyTyped(KeyEvent e) {

    }
}