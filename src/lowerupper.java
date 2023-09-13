import java.util.*;


public class lowerupper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first name? " );
        String name = input.nextLine();

        System.out.print("enter your last name? " );
        String n2 = input.nextLine();

        System.out.print("enter the year you where born YYYY? ");
        String year = input.nextLine();

        System.out.println("UserName:"+n2.substring(0,1).toUpperCase()+name);
        System.out.println("password:"+name.substring(0,1).toLowerCase()+n2.toUpperCase()+year);

    }
}
