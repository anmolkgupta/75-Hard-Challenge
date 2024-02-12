package Day1;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int x;

        System.out.println("Enter integer");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();

        if (x % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        in.close();
    }
}
