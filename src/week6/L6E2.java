package week6;
import java.util.*;
public class L6E2 {
    public static void main(String[] args) {
    int choice;


          do {
              Scanner input = new Scanner(System.in);
              System.out.print("1.Say hello"+
                              "\n 2.Tell me the time"+
                              "\n 3.Tell Me a joke"+
                              "\n 4.Quit");
              System.out.print("Enter your choice");
              choice = input.nextInt();



          } while(choice < 4 );

    }
}
