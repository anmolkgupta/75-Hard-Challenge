package Day5;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        
        int a, b, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Input two integers");

        a = in.nextInt();
        b = in.nextInt();

        try {
            result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero.");
        }
        in.close();
    }
}
