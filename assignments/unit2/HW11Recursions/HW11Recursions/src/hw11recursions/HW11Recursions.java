package hw11recursions;

import java.util.Scanner;

public class HW11Recursions {

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
            option = (int) input.nextFloat();

            switch (option) {
                case 1:
                    
                    System.out.println("Enter the calculated speed (m^3/hr)-->");
                    float flow = 0;
                    float speed = input.nextFloat();
                    System.out.println("Enter the calculated time (min)--> ");
                    float time = input.nextFloat();
                    calculateFlowRate(flow, speed, time);
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
                    float pi;
                    pi = (float) 3.1415926535897932;
                    calculateRotationalDisplacement(width, length, pi, depth);
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

    private static void calculateFlowRate(float flow, float speed, float time) {

        flow = speed / time;
        System.out.println(" The Flow is whit speed -> " + speed + " and "
                + " time -> " + time + " is ->" + flow);
    }

    private static void calculateRotationalDisplacement(float width, float length, float pi, float depth) {
        float volume;
        volume = (((pi) * (width * depth * length)) / (6));
        System.out.println("The rotational displacement is --> " + volume);
    }
}
