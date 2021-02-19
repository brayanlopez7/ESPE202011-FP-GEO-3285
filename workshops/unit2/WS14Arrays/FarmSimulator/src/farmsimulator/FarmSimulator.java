/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author braya
 */
import java.util.Scanner;

public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] milkByCowshed;
        String[] cows = {"Sol", "Sandy", "Alicia"};
        float[] litersByCowshed = { 9.3F, 8.2F, 5.9F, 12.4F, 10.3F, 11.5F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of cowshed -> ");
        n = input.nextInt();

        milkByCowshed = new int[n];
        //cows = new String[20];
        //weightsByCoop = new float[n];

//        milkByCowshed[0] = 7;
//        milkByCowshed[1] = 9;
//        milkByCowshed[2] = 3;
//        milkByCowshed[3] = 9;
//        milkByCowshed[4] = 8;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of milk liters of the cowshed " + (i + 1) + " -> ");
            milkByCowshed[i] = input.nextInt();
        }

        for (int milk : milkByCowshed) {
            System.out.println("milk liters of cowhsed are " + milk);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("milk liters of the cowshed " + (i + 1) + " -> " + milkByCowshed[i]);
        }

        for (String cow : cows) {
            System.out.println("cow name -> " + cow);
        }
        
        for (int i = 0; i < litersByCowshed.length ; i++) {
            System.out.println("liter of cowshed " + (i + 1) + " -> " + litersByCowshed[i]);
        }

    }

}