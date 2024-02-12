package Day2;
import java.util.Scanner;

public class BreakWhileLoop {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Input an integer");
            n = in.nextInt();

            if (n == 0) {
                System.out.println("Out of loop");
                break;
            }
            System.out.println("You entered " + n);
        }
        in.close();
    }
}
