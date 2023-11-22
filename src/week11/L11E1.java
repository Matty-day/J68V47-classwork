package week11;
import java.io.*;
import java.util.Scanner;
public class L11E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        Integer n3 = input.nextInt();


        try (PrintWriter out = new PrintWriter(new FileWriter("L11.txt"))) {
            for (int count = 1; count <= 12; count++) {
                out.format("%d x %d = %d %n ", n3, count, (n3 * count));
            }
            out.close();
        } catch (IOException e) {
            System.out.println("error occurred writing to file:" + e.toString());
        } finally {
        }
    }
}
