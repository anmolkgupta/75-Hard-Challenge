import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        int marksObtained, passingMarks;
        char grade;

        passingMarks = 40;

        Scanner in = new Scanner(System.in);

        System.out.println("Marks Obtained");
        marksObtained = in.nextInt();

        if (marksObtained >= passingMarks) {
            if (marksObtained > 90)
                grade = 'A';
            else if (marksObtained > 75)
                grade = 'B';
            else if (marksObtained > 60)
                grade = 'C';
            else
                grade = 'D';
            System.out.println("Passed!! Grade : " + grade);
        } else {
            grade = 'F';
            System.out.println("Failed :( Grade: " + grade);

            in.close();
        }
    }
}
