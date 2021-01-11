package fp02_controlstatement;

import java.util.Scanner;

public class FP02_controlStatement {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("      Please enter an integer -- ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("      The number enteres is even-- " + num);
        } else {
            System.out.println("     The number enteres is odd-- " + num);
        }
    }
    
}
