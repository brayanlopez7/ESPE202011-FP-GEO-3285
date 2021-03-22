/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18sorting;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class HW18Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numArray[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int searchTerm = 0;
        System.out.println("============================");
        System.out.println("FOUND AND NOT FOUDN TERMS");
        System.out.println("============================");
        System.out.println("Search in this numbers");
        System.out.println("\n11, 22, 33, 44, 55, 66, 77, 88, 99");
        Scanner input = new Scanner(System.in);
        System.out.println(" \nEnter yout term -->");
        searchTerm = input.nextInt();

        if (binarySearch(numArray, 0, numArray.length - 1, searchTerm) == 1) {
            System.out.println("Your term was not Found");
        } else {
            System.out.println("Your term was found");
        }
    }

    public static int binarySearch(int numArray[], int left, int right, int searchTerm) {
        if (right > left) {
            int mid = (int) (left + ((right - left) / 2));
            if (numArray[mid] == searchTerm) {
                return mid;
            }
            if (numArray[mid] > searchTerm) {
                return binarySearch(numArray, left, mid - 1, searchTerm);
            }
            return binarySearch(numArray, mid + 1, right, searchTerm);
        }
        return -1;
    }

}
