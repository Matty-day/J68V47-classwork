package snake;

import javax.swing.*;

// Main class to run the Snake game
public class game {
    public static void main(String[] args) throws Exception {
        // Setting up the dimensions for the game board
        int boardWidth = 600;
        int boardHeight = boardWidth;

        // Creating the window for the game
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating and initializing the snake game
        snakegame snakeGame = new snakegame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus(); // Focus on the game for keyboard input
    }
}
