package week11;
import java.io.*;
import java.util.Scanner;
public class L11E2 {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("L11.txt"));
            String line = " ";
            while (line != null) {
                System.out.println(line);
                line = in.readLine();

            }
        } catch (IOException e) {
            System.out.println("error occurred reading file:" + e.toString());
        }
    }
}



