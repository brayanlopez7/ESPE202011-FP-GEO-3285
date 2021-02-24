/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizsolution;

/**
 *
 * @author braya
 */
import java.util.Scanner;

public class QuizSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nameAnimals = 0;
        String[] animals;
        float[] weight;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount of animals that you want to record ->");
        nameAnimals = scanner.nextInt();

        animals = new String[nameAnimals];
        weight = new float[nameAnimals];

        for (int i = 1; i < nameAnimals; i++) {
            scanner.nextLine();
            System.out.print("Please enter the name of animals # " + i + " -> ");
            animals[i] = scanner.nextLine();
            System.out.print("Please enter " + animals[i] + " weight -> ");
            weight[i] = scanner.nextFloat();
        }

        System.out.println("animals   ->  \t    weight");

        for (int i = 0; i < nameAnimals; i++) {
            System.out.println(animals[i] + " -> \t " + weight[i] + " kg ");
        }

    }

}
