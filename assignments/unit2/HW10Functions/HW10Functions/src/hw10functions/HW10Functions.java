package hw10functions;

import java.util.Scanner;

public class HW10Functions {

    public static void main(String[] args) {

        int divd = 0;
        int divr = 0;
        float quotient = 0;
        int work = 1;
        int rest = 0;
        int multiplicand = 4;
        int multiplier = 1;
        int product = 0;
        int stop = 12;

        System.out.println("█░░░█ █▀▀ █░░ ▄▀▀ ▄▀▀▄ ██▄██ █▀▀\n"
                + "█▄█▄█ █▀▀ █░░ █░░ █░░█ █░▀░█ █▀▀\n"
                + "▀▀░▀▀ ▀▀▀ ▀▀▀ ░▀▀ ░▀▀░ ▀     ▀ ▀▀▀");
        System.out.println("===============================================\n");

        quotient = divideTwoNumbers(divd, divr);

        System.out.println("===============================");
        System.out.println(" THE DIVISIONS IS:" + quotient);
        System.out.println("===============================");

        rest = f(3);
        System.out.println("=====================================");
        System.out.println(" THE SQUARE IS EQUAL TO: " + rest);
        System.out.println("=====================================");

        work = g(-1);
        System.out.println("=====================================");
        System.out.println(" THE SQUARE IS EQUAL TO: " + work);
        System.out.println("=====================================");

        product = multiplicationTable(multiplicand, product);
        System.out.println("=====================================");
        for (int mutiplier = 1; multiplier <= stop; multiplier++) {
            product = multiplicand * multiplier;
            System.out.println("7 *" + multiplicand + " = " + product);
        }
        System.out.println("=====================================");
        
    }

    public static float divideTwoNumbers(int dividend, int divisor) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("FOR THE DIVISON");
        System.out.println("-------------------------------------");

        System.out.println("  PLEASE ENTER THE DIVIDEND HERE: ");
        dividend = scanner.nextInt();

        System.out.println("  PLEASE ENTER THE DIVISOR HERE: ");
        divisor = scanner.nextInt();

        float quotient = 0.0F;

        quotient = (float) dividend / (float) divisor;

        return quotient;

    }

    public static int f(int work) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n FOR f(x)");
        System.out.println("-------------------------------------");
        System.out.println("  PLEASE ENTER THE NUMBER: ");
        work = scanner.nextInt();

        int rest = 0;

        rest = work * work;

        return rest;
    }

    public static int g(int work) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n FOR g(x)");
        System.out.println("-------------------------------------");
        System.out.println("  PLEASE ENTER THE NUMBER: ");
        work = scanner.nextInt();

        int rest = 0;

        rest = work * work + 2 * work + 1;

        return rest;
    }

    public static int multiplicationTable(int multiplicand,
            int product) {
        System.out.println("\n FOR THE MULTPiLICATION TABLE  4");
        System.out.println("-------------------------------------");

        int multiplier = 4;
        int stop = 12;

        return product;
    }

}
