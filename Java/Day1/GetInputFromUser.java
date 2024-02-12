package Day1;
import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args) {
        int a;
        float b;
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        s = in.nextLine();
        System.out.println("You entered a string " + s);

        System.out.println("Enter a Integer");
        a = in.nextInt();
        System.out.println("You entered a Integer " + a);

        System.out.println("Enter a float");
        b = in.nextFloat();
        System.out.println("You entered a float " + b);

        in.close();
    }
}
