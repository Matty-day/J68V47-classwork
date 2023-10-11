package week7;

import java.util.*;

public class L7E1 {
    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            showMenu();
            option = getOption(scanner);

            if (option == 1) {
                option1();
            } else if (option == 2) {
                option2();
            } else if (option == 3) {
                option3();
            } else if (option == 4) {
                System.out.println("Bye!");
            } else {
                System.out.println("This isn't a valid option. Try a number between 1 and 4.");
            }
        } while (option != 4);

        scanner.close();
    }

    static void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Exit");
    }

    static int getOption(Scanner scanner) {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    static void option1() {
        System.out.println("You selected Option 1.");
        // Implement the action for Option 1 here.
    }

    static void option2() {
        System.out.println("You selected Option 2.");
        // Implement the action for Option 2 here.
    }

    static void option3() {
        System.out.println("You selected Option 3.");
        // Implement the action for Option 3 here.
    }
}











