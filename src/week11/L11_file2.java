package week11;
import java.io.*;
import java.util.Scanner;
import java.io.FileReader;
import java.util.*;
public class L11_file2 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("output.txt"));
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
