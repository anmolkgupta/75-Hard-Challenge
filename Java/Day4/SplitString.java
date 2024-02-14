package Day4;

public class SplitString {
    public static void main(String[] args) {
        String s1 = "using of java split string method by anmolkgupta";
        String[] words = s1.split("\\s");

        for (String w : words) {
            System.out.println(w);
        }
    }
}
