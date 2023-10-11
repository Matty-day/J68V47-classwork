package week6;
import java.util.*;

public class L6E3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswers = 0;
        int score = 0;
        int lives = 3;
        int count; // Declare count outside of the for loop

        do {
            for (count = 1; count <= 10 && lives > 0; count++) {
                int num1 = random.nextInt(10);
                int num2 = random.nextInt(10);
                int correctAnswer = num1 * num2;

                System.out.print("Question " + count + ": What is " + num1 + " x " + num2 + "? ");
                int userAnswer = scanner.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + correctAnswer);
                    lives--;
                }
            }
        } while (count <= 10 && lives > 0);

        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of 10 questions.");
        scanner.close();
    }
}

