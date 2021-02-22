/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayquiz22.pkg02.pkg2021;

/**
 *
 * @author braya
 */
import java.util.Scanner;

public class ArrayQuiz22022021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String animalsName;

        int[] animals;
        String[] animalsNames = {"Bear", "Dolphin", "Lion", "Crocodile", "Frog", "Eagle"};
        double [] weightByAnimals = {300.55F, 150.20F, 190.15F, 500.17F, 0.019F, 6.3F};

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el nombre del animal: ");
        animalsName = input.nextLine();

        n = input.nextInt();

        animals = new int[n];

         for (int i = 0; i < n; i++) {
            System.out.print("Enter the name " + (i + 1) + " -> ");
            animals [i] = input.nextInt();
       
        }
    }

}
