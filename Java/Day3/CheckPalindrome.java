package Day3;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        String org, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter string to check palindrome");
        org = in.nextLine();

        int length = org.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + org.charAt(i);

        if (org.equals(reverse))
            System.out.println("String " + org + " is palindrome.");
        else
            System.out.println("String " + org + " is not palindrome.");

        in.close();
    }
}
