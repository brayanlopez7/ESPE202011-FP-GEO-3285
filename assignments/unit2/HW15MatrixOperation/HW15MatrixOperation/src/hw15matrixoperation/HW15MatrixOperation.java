/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15matrixoperation;

/**
 *
 * @author braya
 */
import java.util.Scanner;

public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a[][];
        int b[][];
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

        a = new int[m][n];
        b = new int[m][n];

        System.out.println("\n====================================");
        System.out.println("Enter the elements of the matrix A");
        System.out.println("====================================");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a(" + (i + 1) + (j + 1) + ") -> ");
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("\n====================================");
        System.out.println("Enter the elements of the matrix B");
        System.out.println("====================================");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("b(" + (i + 1) + (j + 1) + ") -> ");
                b[i][j] = input.nextInt();         
            }
        }

        int c[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("\n=============================================");
        System.out.println("The adittion of Matrix A + B is equals to -> ");
        System.out.println("=============================================");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + "\t");
            }

        }

        
    }

}