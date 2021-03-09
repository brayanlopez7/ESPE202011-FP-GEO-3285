/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursions;

import java.util.Scanner;

public class recursions2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option = 0;

        do {
           System.out.println("Hello, choose an option");
            System.out.println("1.-Calculate the flow rate by speed and time");
            System.out.println("2.-Calculate the rotational displacement of a "
                    + "landslide using : Width of the break surface, length of"
                    + " the break surface and depth of the break surface by "
                    + "perpendicularity to the original topography "
                    + "of the terrain.");
            System.out.println("0.- Exit");
            
            System.out.println("Enter your menu option-->");
            option = (int) input.nextFloat();// TODO code application logic here

            switch (option) {

                case 1:
                    System.out.println("Enter the calculated speed (m^3/hr)-->");

                    float flow;
                    float speed = input.nextFloat();

                    System.out.println("Enter the calculated time (min)--> ");

                    float time = input.nextFloat();
                    flow = speed / time;
                    System.out.println(" The Flow is whit speed -> " + speed + " and "
                            + " time -> " + time + " is ->" + flow);
                    break;

                case 2:

                    System.out.println("Enter the width of the break surface (Wr or Ar)-->");
                    float width = input.nextFloat();

                    System.out.println("Enter the length of the break surface (Lr)--> ");
                    float length = input.nextFloat();

                    System.out.println("Enter the depth of the break surface by "
                            + "perpendicularity to the original topography "
                            + "of the terrain(Dr or Pr)--> ");
                    float depth = input.nextFloat();

                    float volume = (float) (((Math.PI) * (width * depth * length)) / (6));

                    System.out.println("The rotational displacement is --> " + volume);

                    break;

                case 3:

                    System.out.println("Enter the average intensity of rainwater");
                    float averageIntensity = input.nextFloat();

                    System.out.println("Enter the total area of the zone in (ha)");
                    float areaSurface = input.nextFloat();

                    System.out.println("Enter the adimentional runoff coeficient");
                    float runoffCoef = input.nextFloat();

                    float runoff = (averageIntensity * areaSurface * runoffCoef);

                    System.out.println("The runoff of rainwater is --> " + runoff);

                    break;
                    
                case 4:

                    System.out.println("Enter the hours --> ");

                    float hours = input.nextFloat();
                    float minutes1;

                    minutes1 = hours * 60;

                    System.out.println("The " + hours + "in minutes is --> " + minutes1);

                    break;

                case 5:

                    System.out.println("Enter the hours)--> ");

                    float seconds = input.nextFloat();
                    float minutes2;

                    minutes2 = seconds / 60;

                    System.out.println("The " + seconds + "in minutes is --> " + minutes2);

                    break; 
                    
                case 6:

                    System.out.println("Enter the kilometers -->");

                    float kilometers = input.nextFloat();
                    float meters;

                    meters = (float) (kilometers * (1e+9));

                    System.out.println("The " + kilometers + "in meters^3 is --> " + meters);

                    break;

                case 0:
                    System.out.println(" See you later ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option\n\n");
                    break;

            }

        } while (option != 0);
    }

}
