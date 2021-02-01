package hw08factorialnumber;

import java.util.Scanner;

public class HW08FactorialNumber {

    public static void main(String[] args) {

        int num = 1;
        long factorial = 1;
        int stop = 15;

        do {

            System.out.println(" Enter the factorial that you want: ");

            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            if (num >= stop) {
            }
            for (int i = num; i > 0; i--) {
                factorial = factorial * i;

            }
            System.out.println(" The " + num + "! " + "is " + factorial);

        } while (num <= 0);
    }
}
