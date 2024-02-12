package Day2;
import java.util.Scanner;

public class BreakContinueWhileLoop {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Input an Integer");
            n = in.nextInt();

            if (n != 0) {
                System.out.println("You entered " + n);
                continue;
            } else {
                System.out.println("Out of loop");
                break;
            }
        }
        in.close();
    }
}
