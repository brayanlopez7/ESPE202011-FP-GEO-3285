/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw13arrays;

/**
 *
 * @author braya
 */
public class HW13Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String products[] = {"Balls", "Rackets", "T-shirts", "Boxing gloves"};
        double prices[] = {35.5, 89.60, 45.99, 25.70};
        System.out.println("Product list and it's prices \n");
        for (int u = 0; u < products.length; u++) {
            System.out.println(products[u] + " " + prices[u]);
        }
    }
}
