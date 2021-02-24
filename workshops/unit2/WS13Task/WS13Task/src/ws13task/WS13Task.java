package ws13task;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        double crclearea = 0;
        float radio = 0.0F;
        double diamdarea = 0;
        float mayorbase = 0.0F;
        float minorbase = 0.0F;
        double trglarea = 0;
        float base = 0.0F;
        float height = 0.0F;
        float speed = 0.0F;
        float distance = 0.0F;
        float time = 0.0F;
        float force = 0.0F;
        float mass = 0.0F;
        float aceleration = 0.0F;
        float period = 0.0F;
        double length = 0;

        int option;

        do {
            System.out.println(" ========================================");
            System.out.println("      Areas And Physic Calucalations");
            System.out.println(" ========================================");
            System.out.println("1. -> Circule Area");
            System.out.println("2. -> Diamond Area");
            System.out.println("3. -> Triangle Area");
            System.out.println("4. -> Speed Calculate");
            System.out.println("5. -> Force Calculate");
            System.out.println("6. -> Period Of A Simple Pendulus Calculate");
            System.out.println("7. -> Exit");

            System.out.println("Enter your option: ");

            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Pleae Enter The Radio ");
                    radio = input.nextFloat();
                    crclearea = calculateCircleArea(radio);
                    System.out.println("The area of a circle is " + " π * r^2 "
                            + " and is equal to: " + String.format("%.2f", crclearea));
                    break;

                case 2:
                    System.out.println("Please Enter The Mayor Base ");
                    mayorbase = input.nextFloat();
                    System.out.println("Pleae Enter The Minor Base ");
                    minorbase = input.nextFloat();
                    diamdarea = calculateDiamondArea(mayorbase, minorbase);
                    System.out.println(" the area of a diamond is "
                            + mayorbase + " * " + minorbase + " and that is equal to: " + diamdarea);
                    break;

                case 3:
                    
                    System.out.println("Please Enter The Base ");
                    base = input.nextFloat();
                    System.out.println("Pleae Enter The Height ");
                    height = input.nextFloat();
                    trglarea = calculateTriangleArea(base, height);
                    System.out.println("The area of triangle is "
                            + base + " * " + " height " + "/ 2 " + "and is equal to:" + trglarea);
                    break;

                case 4:
                    
                    System.out.println("Please Enter The Distance: ");
                    distance = input.nextFloat();
                    System.out.println("Please Enter The Time: ");
                    time = input.nextFloat();
                    
                    speed = (distance / time);
                    System.out.println(" The formula of speed is " + distance + " / "
                            + time + " and that is equal to: " + speed);
                    break;

                case 5:
                    force = 0;
                    System.out.println("Please Enter The Mass: ");
                    mass = input.nextFloat();
                    System.out.println("Please Enter The Aceleration: ");
                    aceleration = input.nextFloat();
                    force = mass * aceleration;
                    System.out.println(" The formula of Force is " + mass + " * "
                            + aceleration + " and that is equal to: " + force);
                    break;

                case 6:
                    period = 0.0f;
                    System.out.println("Please enter the length: ");
                    length = input.nextDouble();
                    period = (float) (2 * Math.PI * Math.sqrt(length / 9.81));
                    System.out.println("The formula of period is: " + " 2" + "π " + " * "
                            + "√" + "(" + length + " /" + "9.81) " + " and that is equal to: "
                            + String.format("%.2f", period));

                    break;

                case 7:
                    System.out.println("Thank you. Come back soon" + " :)");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }

        } while (option != 7);

    }

    private static double calculateTriangleArea(float base, float height) {
        double trglarea;
        trglarea = 0.0F;
        trglarea = (base * height) / 2;
        return trglarea;
    }

    private static double calculateDiamondArea(float mayorbase, float minorbase) {
        double diamdarea;
        diamdarea = 0.0F;
        diamdarea = mayorbase * minorbase;
        return diamdarea;
    }

    private static double calculateCircleArea(float radio) {
        double crclearea;
        crclearea = 0;
        radio = (float) Math.pow(radio, 2);
        crclearea = Math.PI * radio;
        return crclearea;
    }
}