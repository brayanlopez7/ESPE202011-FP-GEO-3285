package hw10functions;

import java.util.Scanner;

public class HW10Functions {

    public static void main(String[] args) {

        int dividend = 0;
        int divisor = 0;
        float quotient = 0;
        int number1 = 1;
        int number2 = 0;
        int multiplicand = 4;
        int multiplier = 1;
        int product = 0;
        int stop = 12;

        System.out.println("█░░░█ █▀▀ █░░ ▄▀▀ ▄▀▀▄ ██▄██ █▀▀\n"
                + "█▄█▄█ █▀▀ █░░ █░░ █░░█ █░▀░█ █▀▀\n"
                + "▀▀░▀▀ ▀▀▀ ▀▀▀ ░▀▀ ░▀▀░ ▀     ▀ ▀▀▀");
        System.out.println("===============================================\n");

        quotient = divideTwoNumbers(dividend, divisor);

        System.out.println("===============================");
        System.out.println(" THE DIVISIONS IS:" + quotient);
        System.out.println("===============================");

        number2 = computeSquare(3);
        System.out.println("=====================================");
        System.out.println(" THE SQUARE IS EQUAL TO: " + number2);
        System.out.println("=====================================");

        number1 = computeParabola(-1);
        System.out.println("=====================================");
        System.out.println(" THE SQUARE IS EQUAL TO: " + number1);
        System.out.println("=====================================");

        product = showTheMultiplicationTable(multiplicand, product);
        System.out.println("=====================================");
        for (int mutiplier = 1; multiplier <= stop; multiplier++) {
            product = multiplicand * multiplier;
            System.out.println("7 *" + multiplicand + " = " + product);
        }
        System.out.println("=====================================");

        System.out.println("▄▀▀ ▄▀▀▄ ▄▀▀▄ █▀▄ . █▀▄ █░█ █▀▀\n"
                + "█░█ █░░█ █░░█ █░█ . █▀▄ ▀█▀ █▀▀\n"
                + "░▀▀ ░▀▀░ ░▀▀░ ▀▀░ . ▀▀░ ░▀░ ▀▀▀");
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

    public static int computeSquare(int number1) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n FOR f(x)");
        System.out.println("-------------------------------------");
        System.out.println("  PLEASE ENTER THE NUMBER: ");
        number1 = scanner.nextInt();

        int number2 = 0;

        number2 = number1 * number1;

        return number2;
    }

    public static int computeParabola(int number1) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n FOR g(x)");
        System.out.println("-------------------------------------");
        System.out.println("  PLEASE ENTER THE NUMBER: ");
        number1 = scanner.nextInt();

        int number2 = 0;

        number2 = number1 * number1 + 2 * number2 + 1;

        return number2;
    }

    public static int showTheMultiplicationTable(int multiplicand,
            int product) {
        System.out.println("\n FOR THE MULTPiLICATION TABLE  4");
        System.out.println("-------------------------------------");

        int multiplier = 4;
        int stop = 12;

        return product;
    }

}
