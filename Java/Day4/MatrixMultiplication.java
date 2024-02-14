package Day4;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int i, j, sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of rows and columns of first matrix");

        int m = in.nextInt();
        int n = in.nextInt();

        int first[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix");

        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                first[i][j] = in.nextInt();

        System.out.println("Enter number of rows and columns of second matrix");

        int p = in.nextInt();
        int q = in.nextInt();

        if (n != p) {
            System.out.println("Matrix with different rows or columns");
        } else {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][q];

            System.out.println("Enter the elements of second matrix");

            for (i = 0; i < p; i++)
                for (j = 0; j < q; j++)
                    second[i][j] = in.nextInt();

            for (i = 0; i < m; i++) {
                for (j = 0; j < q; j++) {
                    for (int k = 0; k < p; k++) {
                        sum = sum + first[i][k] * second[k][j];
                    }
                    multiply[i][j] = sum;
                    sum = 0;
                }
            }
            System.out.println("Product of matrices:-");

            for (i = 0; i < m; i++) {
                for (j = 0; j < q; j++)
                    System.out.println(multiply[i][j] + "\t");

                System.out.println("\n");
            }

        }
        in.close();
    }
}