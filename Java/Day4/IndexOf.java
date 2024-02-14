package Day4;

public class IndexOf {
    public static void main(String[] args) {
        String s1 = "this is index of example";

        int index1 = s1.indexOf("is"); // index of 'is' substring
        int index2 = s1.indexOf("index"); // index of 'index' substring
        System.out.println(index1 + " " + index2);

        int index3 = s1.indexOf("is", 4); // index of 'is' substring after 4th index
        System.out.println(index3);

        int index4 = s1.indexOf('s'); // index of s character value
        System.out.println(index4);
    }
}