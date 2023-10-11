package week7;
import java.util.*;

public class L7E2 {
    public static int calculatesum (int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fisrt number ");
        Integer number1 = input.nextInt();

        System.out.print("Enter the fisrt number ");
        Integer number2 = input.nextInt();

        System.out.format("The sum of %d and %d is %d", number1, number2, calculatesum(number1, number2));

    }
}
