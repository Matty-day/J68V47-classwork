import java.util.*;
public class quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the capital of Spain? ");
        String n1 = input.nextLine();

        if(!n1.toLowerCase().equals("madrid")) {
            System.out.println("Sorry, the correct answer is Madrid");
        }

        System.out.print("What is the capital of the UK? ");
        String n2 = input.nextLine();

        if(!n2.toLowerCase().equals("london")) {
            System.out.println("Sorry, the correct answer is London");
        }

        System.out.print("What is the capital of Italy? ");
        String n3 = input.nextLine();

        if(n3.toLowerCase() != "milan") {
            System.out.println("Sorry, the correct answer is rome");
        }

    }
}
