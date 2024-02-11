import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int a, b, temp;
        System.out.println("Enter a and b");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        System.out.println("Before Swapping \na : " + a + " \nb : " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping \na : " + a + " \nb : " + b);

        in.close();
    }

}
