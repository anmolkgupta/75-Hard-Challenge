package Day6;

import java.io.*;

public class Notepad {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();

        try {
            rs.exec("notepad");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
