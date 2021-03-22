package matrixcalculator;

import java.util.Scanner;
import ec.edu.espe.matrix.BasicMatrix;
import static ec.edu.espe.matrix.BasicMatrix.addTwoMatrices;
import static ec.edu.espe.matrix.BasicMatrix.multiplyTwoMatrices;
import static ec.edu.espe.matrix.BasicMatrix.prettyPrintMatrix;
import static ec.edu.espe.matrix.BasicMatrix.readMatrixElements;
import static ec.edu.espe.matrix.BasicMatrix.transposeMatrixA;

/**
 *
 * @author braya
 */
public class MatrixCalculator {

    public static void main(String[] args) {
        System.out.println("----- AUTOR: BRAYAN LÓPEZ -----");
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
}
