import java.util.*;

public class nameandhobby {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what is your first name");
        String name = input.nextLine();

        System.out.println("what is your hobby");
        String lastname = input.nextLine();

        System.out.println("why do you enjoy that hobby ");
        String why = input.nextLine();

        System.out.println("hello my name is "+name+" and my hobby is "+ lastname+" i really enjoy "+lastname+" because "+why);
    }
}
