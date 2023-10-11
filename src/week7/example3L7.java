package week7;
import java.util.*;

public class example3L7 {

    public static void printMessage(String message) {
        System.out.println(message);
    }
        public static String getMessage(){
        Scanner input = new Scanner(System.in);
        return input.nextLine(); // ask the user to enter a string and return it to
    }						      // the calling code
    public static void main(String[] args) {
        String message = getMessage();  // call the getMessage subroutine
        printMessage(message); // display contents of the message variable returned
    }

}
