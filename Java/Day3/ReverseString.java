package Day3;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String org, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter string to reverse");
        org = in.nextLine();

        int length = org.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + org.charAt(i);
        
        System.out.println("Reverse of " +org+ " is: "+reverse);

        in.close();
    }
}
