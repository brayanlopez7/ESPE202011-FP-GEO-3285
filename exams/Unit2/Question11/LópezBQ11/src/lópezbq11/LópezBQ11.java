/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lópezbq11;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class LópezBQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] a = new int[]{12, 23, 34, 98, 87, 65, 0};
        int[] numbers;
        Scanner input = new Scanner(System.in);
        int n = 5;
        float[] num2 = new float[3];
        float average = 0;

        System.out.println("Please enter the 5 numbers that you need record ->");

        calculateNumbers(n, input);
        System.out.println("\n");
        System.out.println("Enter the 3 numbers -> ");

        calculateAverage(num2);
        System.out.println("average: " + average);

    }

    private static void calculateAverage(float[] num2) {
        for (int i = 0; i < 3; i++) {

            float sum = 0;
            int m = num2.length;

            for (int j = 0; j < m; i++) {
                sum += num2[i];
            }

        }
    }

    private static void calculateNumbers(int n, Scanner input) {
        int[] numbers;
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number integer # " + (i + 1) + " -> ");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Integer # " + (i + 1) + " -> " + numbers[i]);
        }
    }
}
