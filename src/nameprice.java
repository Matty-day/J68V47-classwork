import java.util.*;
public class nameprice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name of item 1");
        String n1 = input.nextLine();

        System.out.print("enter price 1");
        float num1 = input.nextFloat();

        Scanner input2 = new Scanner(System.in);
        System.out.print("enter the name of item 2");
        String n2 = input2.nextLine();

        System.out.print("enter price 2");
        float num2 = input2.nextFloat();

        Scanner input3 = new Scanner(System.in);
        System.out.print("enter the name of item 3");
        String n3 = input3.nextLine();

        System.out.print("enter price 3");
        float num3 = input3.nextFloat();

        System.out.println("Item 1........"+n1+" £"+num1 );
        System.out.println("Item 2........"+n2+" £"+num2);
        System.out.println("Item 3........"+n3+" £"+ num3 );
        System.out.println("SUBTOTAL £"+(num1+num2+num3));
    }
}
