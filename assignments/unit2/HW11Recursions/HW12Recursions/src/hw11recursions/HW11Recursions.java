package hw11recursions;

import java.util.Scanner;

public class HW11Recursions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option = 0;

        do {
            printFlowAndRotatonalMenu();
            option = (int) input.nextFloat();

            switch (option) {
                case 1:
                    calculateFlowRate(input);
                    break;

                case 2:
                    calculateRotationalDisplacement(input);
                    break;

                case 0:
                    printExitMenu();
                    break;
                default:
                    printErrorMenu();
                    break;

            }
        } while (option != 0);
    }

    private static void printErrorMenu() {
        System.out.println("invalid option\n\n");
    }

    private static void printExitMenu() {
        System.out.println(" See you later ");
        System.exit(0);
    }

    private static void calculateRotationalDisplacement(Scanner input) {
        System.out.println("Enter the width of the break surface (Wr or Ar)-->");
        float width = input.nextFloat();
        
        System.out.println("Enter the length of the break surface (Lr)--> ");
        float length = input.nextFloat();
        
        System.out.println("Enter the depth of the break surface by "
                + "perpendicularity to the original topography "
                + "of the terrain(Dr or Pr)--> ");
        float depth = input.nextFloat();
        
        float pi;
        pi = (float) 3.1415926535897932;
        
        float volume = (((pi) * (width * depth * length)) / (6));
        
        System.out.println("The rotational displacement is --> " + volume);
    }

    private static void calculateFlowRate(Scanner input) {
        System.out.println("Enter the calculated speed (m^3/hr)-->");
        
        float flow;
        float speed = input.nextFloat();
        
        System.out.println("Enter the calculated time (min)--> ");
        
        float time = input.nextFloat();
        flow = speed / time;
        System.out.println(" The Flow is whit speed -> " + speed + " and "
                + " time -> " + time + " is ->" + flow);
    }

    private static void printFlowAndRotatonalMenu() {
        System.out.println("Hello, choose an option");
        System.out.println("1.-Calculate the flow rate by speed and time");
        System.out.println("2.-Calculate the rotational displacement of a "
                + "landslide using : Width of the break surface, length of"
                + " the break surface and depth of the break surface by "
                + "perpendicularity to the original topography "
                + "of the terrain.");
        System.out.println("0.- Exit");
        
        System.out.println("Enter your menu option-->");
    }
}