package Day1;
import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        int n, c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.println("Input an Integer");
        n = in.nextInt();

        for(c = 1; c <= n; c++) 
        {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        System.out.println(n + "! = " + fact);
        in.close();
    }
}