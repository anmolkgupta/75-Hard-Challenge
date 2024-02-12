package Day1;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int marksObtained, passingMarks;

        passingMarks = 40;

        Scanner in = new Scanner(System.in);
        System.out.println("Input marks scored");

        marksObtained = in.nextInt();

        if (marksObtained >= passingMarks) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        in.close();
    }
}
