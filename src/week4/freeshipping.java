package week4;

import java.util.*;

public class freeshipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter total purchase amount £");
        float num1 = input.nextFloat();

        if (num1<50){
            System.out.println("Shipping cost is = £10.00");
            System.out.println("your final total is = £" + (num1+10));
        } else{
            System.out.println("Shipping cost is free");
            System.out.println("your final total is = £" + (num1));
    }
}
}
