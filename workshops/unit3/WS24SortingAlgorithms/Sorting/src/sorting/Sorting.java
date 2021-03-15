/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author braya
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] integersToSort = {9, 7, 1, 6, 2, 3};
        System.out.println("Unsorted integers");
        printArray(integersToSort);
        sortByBubbleSort(integersToSort);
        System.out.println("");
        printArray(integersToSort);
    }

    public static void sortByBubbleSort(int integers[]) {
        int n = integers.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (integers[j] > integers[j + 1]) {
                    //swap
                    temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;

                }
                System.out.print("sorting --> ");
                printArray(integers);

            }
            System.out.println("");

        }

    }

    public static void printArray(int[] integers) {
        int n = integers.length;
        for (int i = 0; i < n; i++) {
            System.out.print(integers[i] + " , ");
        }
        System.out.println("");
    }

}
