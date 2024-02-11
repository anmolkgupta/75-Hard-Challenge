import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        int p, q, r;
        System.out.println("Enter p and q");
        Scanner in = new Scanner(System.in);

        p = in.nextInt();
        q = in.nextInt();

        r = p + q;
        System.out.println("Sum of entered numbers: " + r);
        in.close();
    }
}
