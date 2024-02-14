package Day4;

import java.util.Scanner;

public class TransposeAMatrix {
    public static void main(String[] args) {
        int i, j;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows amd columns of matrix");

        int a = in.nextInt();
        int b = in.nextInt();

        int matrix[][] = new int[a][b];

        System.out.println("Enter the elements of matrix");

        for (i = 0; i < a; i++)
            for (j = 0; j < b; j++)
                matrix[i][j] = in.nextInt();

        int transpose[][] = new int[b][a];

        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++)
                transpose[j][i] = matrix[i][j];
        }
        System.out.println("Transpose of entered matrix:-");

        for (i = 0; i < b; i++) {
            for (j = 0; j < a; j++)
                System.out.println(transpose[i][j] + "\t");

            System.out.println("\n");
        }
    }
}
