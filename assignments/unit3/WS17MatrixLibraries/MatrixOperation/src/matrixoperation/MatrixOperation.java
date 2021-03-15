/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixoperation;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float a[][];
        float b[][];
        float c[][];
        float d[][];
        float t[][];
        int m = 0;
        int n = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Enter the dimension of the matrix");
        System.out.println("===================================");
        System.out.print("m -> ");
        m = input.nextInt();
        System.out.print("n -> ");
        n = input.nextInt();

        a = new float[m][n];
        b = new float[m][n];
        c = new float[m][n];
        d = new float[m][n];

        t = new float[n][m];

        System.out.println("\n====================================");
        System.out.println("Enter the elements of the matrix A");
        System.out.println("====================================");

        a = readMatrixElements(m, n, "A", input);

        System.out.println("\n====================================");
        System.out.println("Enter the elements of the matrix B");
        System.out.println("====================================");

        b = readMatrixElements(m, n, "B", input);

        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }

        System.out.println(" Matrix A ");
        prettyPrintMatrix(m, n, a);

        System.out.println("");

        System.out.println(" Matrix B ");
        prettyPrintMatrix(m, n, b);

        System.out.println("\n=============================================");
        System.out.println("THE ADITTION OF MATRIX A + B IS EQUIAL TO -> ");
        System.out.println("=============================================");

        c = addTwoMatrices(m, n, a, b);
        prettyPrintMatrix(m, n, c);

        System.out.println("\n================================================");
        System.out.println("THE MULTIPLICATION OF MATRIX A * B IS EQUIAL TO -> ");
        System.out.println("================================================");

        d = multiplyTwoMatrices(m, n, a, b);
        prettyPrintMatrix(m, n, d);

        System.out.println("\n=============================================");
        System.out.println("THE TRANSPOSITION OF MATRIX A IS EQUIAL TO -> ");
        System.out.println("=============================================");

        transposeMatrixA(n, m, t, a);
        prettyPrintMatrix(m, n, t);
        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }

    }

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("--Row Numbers" + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "] -> ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static float[][] addTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static float[][] multiplyTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] d;
        d = new float[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = a[i][j] * b[i][j];
            }
        }
        return d;
    }

    public static float transposeMatrixA(int n, int m, float[][] t, float[][] a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = a[j][i];
            }
        }
        return 0;
    }

   public static void prettyPrintMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("┌ \t");
                    } else if (i == m - 1) {
                        System.out.print("└\t");

                    } else {
                        System.out.print("│\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print(" \t┐");
                    } else if (i == m - 1) {
                        System.out.print(" \t┘");

                    } else {
                        System.out.print("  \t│");
                    }
                }
            }
        }
        System.out.println("");
    }

    public static void printMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("/ \t");
                    } else if (i == m - 1) {
                        System.out.print("\\\t");

                    } else {
                        System.out.print("|\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print(" \t\\");
                    } else if (i == m - 1) {
                        System.out.print(" \t/");

                    } else {
                        System.out.print("  \t|");
                    }
                }
            }
        }
        System.out.println("");
    }

}
