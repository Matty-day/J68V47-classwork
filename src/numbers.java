import java.util.*;

public class numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number 1");
        int num = input.nextInt();

        System.out.print("enter number 2");
        double price = input.nextDouble();

        System.out.format("total = ",(price*num)+(price/num)+(num-price));
    }
}
