package Day4;

public class StringEndWith {
    public static void main(String[] args) {
        String s1 = "Learning JavaProgramming";
        System.out.println(s1.endsWith("g")); // true
        System.out.println(s1.endsWith("Programming")); // true
        System.out.println(s1.endsWith("programming")); // false
        System.out.println(s1.endsWith("ming")); // true
    }
}
