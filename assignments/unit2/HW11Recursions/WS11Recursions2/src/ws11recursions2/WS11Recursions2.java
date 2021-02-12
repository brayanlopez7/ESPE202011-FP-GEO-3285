package ws11recursions2;

import java.util.Scanner;

public class WS11Recursions2 {

    public static void main(String[] args) {
        
        int fact;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your number ");
        fact = scanner.nextInt();
        printFactorial(fact);
    }

    public static int printFactorial(int num) {
        Scanner scanner = new Scanner(System.in);

        int result = num;

        for (int i = 1; i < num; i++) {
            result *= i;
        }
        System.out.println(" The factorial of " + num + " is " + result);

        return result;
    }

}
