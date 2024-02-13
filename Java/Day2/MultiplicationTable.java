package Day2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter integer to print table");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        System.out.println("Multiplication table of " + n + " is :-");

        for (int c = 1; c <= 10; c++) {
            System.out.println(n + "*" + c + " = " + (n * c));
        }
        sc.close();
    }
}