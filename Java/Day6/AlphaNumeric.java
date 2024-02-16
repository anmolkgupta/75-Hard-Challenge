package Day6;

import java.util.Scanner;

public class AlphaNumeric {
    public static void main(String[] args) {
        String s;

        System.out.println("Enter alphanumeric value"); // I/P (1) ABC65D19HY09 (2) 012ABDH52
        Scanner in = new Scanner(System.in);
        s = in.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isAlphabetic(s.charAt(i))) {
                System.out.print(i); // print place value of number
            }
        }
        in.close();
    }
}