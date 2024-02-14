package Day4;

public class ReplaceString {
    public static void main(String[] args) {
        String s1 = "My name is Anmol. My name is Karma. My name is BadKarma.";
        String replaceString = s1.replaceAll("My name is", "I am"); // replace all occurrences of 'is' to 'was'.
        System.out.println(replaceString);
    }
}
