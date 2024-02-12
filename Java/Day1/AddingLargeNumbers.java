package Day1;
import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {
    public static void main(String[] args) {
        String s1, s2;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first large number");
        s1 = in.nextLine();

        System.out.println("Enter second large number");
        s2 = in.nextLine();

        BigInteger first = new BigInteger(s1);
        BigInteger second = new BigInteger(s2);
        BigInteger sum;

        sum = first.add(second);

        System.out.println("Result: " + sum);
        in.close();
    }

}
