package week11;
import java.io.*;
import java.util.Scanner;
public class L11E3 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new FileReader("output.txt"));
            double num = -1.0;
            num = in.nextDouble();

            String text = in.nextLine();
            text = in.nextLine();

            System.out.println(text);
            System.out.println(num);
        } catch(IOException e){
             System.out.println("Error occurred reading from file:" + e.toString());
        }
    }
}
