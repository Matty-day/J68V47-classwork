package week4;

import java.util.*;

public class ifstatments {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter Your First Name:");
            String n1 = input.nextLine();


            System.out.print("Enter Your last Name:");
            String n2 = input.nextLine();

            System.out.print("Enter the total value of your order:");
            float n3 = input.nextFloat();

            System.out.print("Enter the amount you wish to deposit:");
            float num3 = input.nextFloat();

        System.out.println("== RECEIPT ==");
        System.out.println("Coustomer: " + n1.substring(0,1)+""+n2);
        System.out.println("Order Total "+n3);
        System.out.println("Deposite Paid "+num3);
        System.out.println("Reminder "+ (n3-num3));
        if(num3>100){
            System.out.println("you get a free toaster!!!!");


        System.out.println("have a nice day");
        }
    }
}
