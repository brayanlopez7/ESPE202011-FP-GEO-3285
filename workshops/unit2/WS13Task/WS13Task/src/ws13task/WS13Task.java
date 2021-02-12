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
        int option;

        do {
            printTheMenu();
            option = input.nextInt();

            switch (option) {

                case 1:
                    calculateTheCircleArea(input);
                    break;

                case 2:
                    calculateTheDiamondArea(input);       
                    break;
                
                case 3:
                    calculateTheTriangleArea(input);             
                    break; 
                    
                case 4:
                    calculateTheSpeed(input);         
                    break; 
                    
                case 5:
                    calculateTheForce(input);
                    break;
                    
                case 6:
                    calculateThePendulusPeriod(input);
                    break;           
                    
                case 7:
                        
                    doExitToTheMenu();
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }

        } while (option != 8);

    }

    private static void printTheMenu() {
        System.out.println(" ===================");
        System.out.println("       Areas ");
        System.out.println(" ===================");
        System.out.println("1. -> Circule Area");
        System.out.println("2. -> Diamond Area");
        System.out.println("3. -> Triangle Area");
        System.out.println("4. -> Speed Formula and Calculate");
        System.out.println("5. -> Force Formula and Calculate");
        System.out.println("6. -> Period of a simple pendulus Formula and Calculate");
        System.out.println("7. -> Exit");
        
        System.out.println("enter your option --> ");
    }

    private static void doExitToTheMenu() {
        System.out.println("Thank you. Come back soon" + " :)");
        System.exit(0);
    }

    private static void calculateThePendulusPeriod(Scanner input) {
        float period;
        System.out.println("Please enter the length: " );
        double length = input.nextDouble();
        period = (float) (2 * Math.PI * Math.sqrt(length / 9.81));
        System.out.println("The formula of period is: " + " 2"+ "π " +" * "
                + "√" +"("+length +" /" + "9.81) "+ " and that is equal to: "
                + String.format("%.2f", period));
    }

    private static void calculateTheForce(Scanner input) {
        float force;
        System.out.println("Please Enter The Mass: " );
        float mass = input.nextFloat();
        System.out.println("Please Enter The Aceleration: " );
        float aceleration = input.nextFloat();
        force = mass * aceleration;
        System.out.println(" The formula of Force is " + mass + " * " +
                aceleration + " and that is equal to: " + force);
    }

    private static void calculateTheSpeed(Scanner input) {
        float speed;
        System.out.println("Please ENter The Distance: " );
        float distance = input.nextFloat();
        System.out.println("Please Enter The Time: " );
        float time = input.nextFloat();
        speed = (distance / time);
        System.out.println(" The formula of speed is " + distance + " / " +
                time + " and that is equal to: " + speed );
    }

    private static void calculateTheTriangleArea(Scanner input) {
        double trglarea;
        System.out.println("Please Enter The Base ");
        float base = input.nextFloat();
        System.out.println("Pleae Enter The Height ");
        float height = input.nextFloat();
        trglarea = (base * height)/2;
        System.out.println("The area of triangle is " +
                base + " * " + " height " + "/ 2 " + "and is equal to:" + trglarea);
    }

    private static void calculateTheDiamondArea(Scanner input) {
        double diamdarea;
        System.out.println("Please Enter The Mayor Base ");
        float mayorbase = input.nextFloat();
        System.out.println("Pleae Enter The Minor Base ");
        float minorbase = input.nextFloat();
        diamdarea = mayorbase * minorbase;
        System.out.println(" the area of a diamond is "
                + mayorbase + " * " + minorbase + " and that is equal to: " + diamdarea);
    }

    private static void calculateTheCircleArea(Scanner input) {
        double crclearea;
        System.out.println("Pleae Enter The Radio ");
        float radio = input.nextFloat();
        radio = (float) Math.pow(radio, 2);
        crclearea = Math.PI * radio;
        System.out.println("The area of a circle is " + " π * r^2 "
                + " and is equal to: " + String.format("%.2f", crclearea));
    }

}
