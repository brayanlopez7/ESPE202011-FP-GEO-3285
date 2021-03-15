/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21functions;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("AUTOR: BRAYAN LÓPEZ");
        Scanner input = new Scanner(System.in);

        float horsePower = 0;
        float torque = 0;
        float revolutionsPerMin = 0;
        float milesPerGal = 0;
        float mileage1 = 0;
        float mileage2 = 0;
        float gallons = 0;

        System.out.println("Calculate HorsePower");
        
        System.out.println("Please enter the torque: ");
        torque = input.nextFloat();
        System.out.println("Please enter the RPM: ");
        revolutionsPerMin = input.nextFloat();
        horsePower = calculateHorsePower(torque, revolutionsPerMin);
        System.out.println("The HOrsePower is:" + horsePower);
        
    
        
        System.out.println("\nCalculate Miles Per Gallon");
        System.out.println("Please enter the initial millage: ");
        torque = input.nextFloat();
        System.out.println("Please enter the final millage: ");
        revolutionsPerMin = input.nextFloat();
        System.out.println("Please enter the gallons of the vehicle");
        gallons = input.nextFloat();
        milesPerGal = calculateMilesPerGallon(mileage1, mileage2, gallons);
        System.out.println("The Miles Per Gallon is : " + milesPerGal);

        
    }

    private static float calculateHorsePower(float torque, float revolutionsPerMin) {

        float horsePower;
        horsePower = ((torque * revolutionsPerMin) / 2525);
        return horsePower;
    }

    private static float calculateMilesPerGallon(float mileage1, float mileage2, float gallons) {

        float milesPerGal;
        milesPerGal = ((mileage2 - mileage1) / gallons);
        return milesPerGal;

    }
    

}


