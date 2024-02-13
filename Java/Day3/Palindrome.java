package Day3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s; 
        Scanner in = new Scanner(System.in);

        System.out.println("Input a string");
        s = in.nextLine();

        int length = s.length();
        int i, begin, middle, end;
        begin = 0;
        end = length - 1;
        middle = (begin + end) / 2;

        for (i = begin; i <= middle; i++) {
            if (s.charAt(begin) == s.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }
        if (i == middle + 1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        in.close();
    }
}
