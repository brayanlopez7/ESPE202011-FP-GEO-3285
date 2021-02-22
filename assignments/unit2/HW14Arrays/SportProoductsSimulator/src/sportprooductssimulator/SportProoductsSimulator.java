/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportprooductssimulator;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class SportProoductsSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] sportProductsByStore;
        String[] products = {"Football shoes: ", "Teams T-shirts: ", "Boxing gloves: ",
            "Swimming glasses: ", "Tennis racket: ", "Running shorts: ", "Rugby ball: ",
            "Surf table: ", "Climbing ropes: ", "golf sticks: ", "bikes: ", "Basketball wristbands: "};
        double[] pricesByProduct = {199.90, 99.90, 69.90, 20.90, 27.93, 229.90, 19.90,
            +279.99, 150.49, 249.99, 639.95, 15.90};

        System.out.println("==============================");
        System.out.println("Product list with it's prices");
        System.out.println("==============================");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + pricesByProduct[i]);
        }

        
        
        int[] videogamesByStore;
        String[] consoleByCostumer = {"Xbox One ", "Playstation 4 ", "Xbox Series X|S ",
            "Playstation 5 ", "Nintendo Switch "};
        String[] gamesByConsole = {"Gear 5 ", "Days Gone ", "Hellblade II ",
            "God of War Ragnarok ", "Super Smash Bros "};

        System.out.println("\n" + "==================================");
        System.out.println("Console Name and Game by Console");
        System.out.println("==================================");

        for (String console : consoleByCostumer) {
            System.out.println("Console Name -> " + console);
        }

        for (int j = 0; j < gamesByConsole.length; j++) {
            System.out.println("Name of Game by Console " + (j + 1) + " -> " + gamesByConsole[j]);
        }
        
        
        

        int[] heightOfEcuadorianMountains;
        String[] mountains = {"Cotopaxi", "Chimborazo", "El Altar", "Antisana",
            "Sangay", "Tungurahua", "Carihuairazo", "Cayambe"};

        System.out.println("\n" + "===========================================");
        System.out.println("Moutain Name and Height by Mountain");
        System.out.println("===========================================");

        int[] height = {5897, 6268, 5319, 5704, 5300, 5023, 5018, 5790};

        for (String moutain : mountains) {
            System.out.println("Mountain name -> " + moutain);   
        }
        
        for (int i = 0; i < height.length; i++) {
            System.out.println("height by mountains " + (i + 1) + " -> " + height[i] + " m.s.n.m ");       
        }

    }

}
