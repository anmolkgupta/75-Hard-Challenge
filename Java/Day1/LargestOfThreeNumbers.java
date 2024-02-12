package Day1;
import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int m, n, o;
        System.out.println("Enter three Integers");
        Scanner in = new Scanner(System.in);

        m = in.nextInt();
        n = in.nextInt();
        o = in.nextInt();

        if (m > n && m > o)
            System.out.println("First number is largest " + m);
        else if (n > m && n > o)
            System.out.println("Second number is largest " + n);
        else if (o > m && o > n)
            System.out.println("Third number is largest " + o);
        else
            System.out.println("Entered number are not distinct");
        in.close();
    }
}
