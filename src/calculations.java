import java.util.*;

public class calculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("loan amount £");
        float num1 = input.nextFloat();

        System.out.print("intrest rate (APR %):");
        float num3 = input.nextFloat()/100/12;

        System.out.print("number of years;");
        float num2 = input.nextFloat()*12;

        double m = num1 * (num3/(1-Math.pow((1+num3),-num2)));
        System.out.println("monthly payments for this loan = " + m );
    }
}
