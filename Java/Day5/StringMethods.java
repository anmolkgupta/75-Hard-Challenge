package Day5;

/**
 * StringMethods  find length , concatenate and replace string
 */
public class StringMethods {

    public static void main(String[] args) {
        int n;
        String s ="Java Programming", t = "", u = "";

        System.out.println(s);

        // find length of string

        n = s.length();
        System.out.println("Number of characters = " + n);

        // replace characters in string

        t = s.replace("Java", "Python");
        System.out.println(s);
        System.out.println(t);

        // concatenate string with another string

        u = s.concat("is fun");
        System.out.println(s);
        System.out.println(u);
    }
}