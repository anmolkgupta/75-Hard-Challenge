package Day1;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, fact = 1;
        System.out.println("Enter an Integer");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        if (n < 0)
            System.out.println("Enter a Non-negative Value");
        else {
            for (int c = 1; c <= n; c++)
                fact = fact * c;
            System.out.println(n  + "! = " + fact);
        }
        sc.close();
    }
}
