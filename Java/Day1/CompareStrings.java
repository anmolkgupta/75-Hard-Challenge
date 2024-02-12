package Day1;
import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        String s1, s2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First String");
        s1 = in.nextLine();

        System.out.println("Enter Second String");
        s2 = in.nextLine();

        if (s1.compareTo(s2) > 0)
            System.out.println("S1 greater than S2");
        else if (s1.compareTo(s2) < 0)
            System.out.println("S1 less than S2");
        else
            System.out.println("Both are equal");
        in.close();
    }
}
