package lópezbrayanq11;

import java.util.Scanner;

public class LópezBrayanQ11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" =========================");
            System.out.println("   Multiplication Tables  ");
            System.out.println(" =========================");
            System.out.println("1. -> Multiplication by 1");
            System.out.println("2. -> Multiplication by 2");
            System.out.println("3. -> Multiplication by 3");
            System.out.println("4. -> Multiplication by 4");
            System.out.println("5. -> Multiplication by 5");
            System.out.println("6. -> Multiplication by 6");
            System.out.println("7. -> Multiplication by 7");
            System.out.println("8. -> Multiplication by 8");
            System.out.println("9. -> Multiplication by 9");
            System.out.println("10. -> Multiplication by 10");
            System.out.println("11. -> Multiplication by 11");
            System.out.println("12. -> Multiplication by 12");
            System.out.println("13. -> Exit");

            System.out.println(" enter the table that you want study ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int multiplying1;
                    final int multiplier1 = 1;
                    int product1;
                    System.out.println("enter multiplying -> ");
                    multiplying1 = input.nextInt();
                    product1 = multiplying1 * multiplier1;
                    System.out.println("The multiplcation is: " + multiplying1
                            + " * " + multiplier1 + " = " + product1);
                    break;

                case 2:
                    int multiplying2;
                    final int multiplier2 = 2;
                    int product2;
                    System.out.println("enter multiplying -> ");
                    multiplying2 = input.nextInt();
                    product2 = multiplying2 * multiplier2;
                    System.out.println("The multiplcation is: " + multiplying2
                            + " * " + multiplier2 + " = " + product2);
                    break;

                case 3:
                    int multiplying3;
                    final int multiplier3 = 3;
                    int product3;
                    System.out.println("enter multiplying -> ");
                    multiplying3 = input.nextInt();
                    product3 = multiplying3 * multiplier3;
                    System.out.println("The multiplcation is: " + multiplying3
                            + " * " + multiplier3 + " = " + product3);
                    break;

                case 4:
                    int multiplying4;
                    final int multiplier4 = 4;
                    int product4;
                    System.out.println("enter multiplying -> ");
                    multiplying4 = input.nextInt();
                    product4 = multiplying4 * multiplier4;
                    System.out.println("The multiplcation is: " + multiplying4
                            + " * " + multiplier4 + " = " + product4);
                    break;

                case 5:
                    int multiplying5;
                    final int multiplier5 = 5;
                    int product5;
                    System.out.println("enter multiplying -> ");
                    multiplying5 = input.nextInt();
                    product5 = multiplying5 * multiplier5;
                    System.out.println("The multiplcation is: " + multiplying5
                            + " * " + multiplier5 + " = " + product5);
                    break;

                case 6:
                    int multiplying6;
                    final int multiplier6 = 6;
                    int product6;
                    System.out.println("enter multiplying -> ");
                    multiplying6 = input.nextInt();
                    product6 = multiplying6 * multiplier6;
                    System.out.println("The multiplcation is: " + multiplying6
                            + " * " + multiplier6 + " = " + product6);
                    break;

                case 7:
                    int multiplying7;
                    final int multiplier7 = 7;
                    int product7;
                    System.out.println("enter multiplying -> ");
                    multiplying7 = input.nextInt();
                    product7 = multiplying7 * multiplier7;
                    System.out.println("The multiplcation is: " + multiplying7
                            + " * " + multiplier7 + " = " + product7);
                    break;

                case 8:
                    int multiplying8;
                    final int multiplier8 = 8;
                    int product8;
                    System.out.println("enter multiplying -> ");
                    multiplying8 = input.nextInt();
                    product8 = multiplying8 * multiplier8;
                    System.out.println("The multiplcation is: " + multiplying8
                            + " * " + multiplier8 + " = " + product8);
                    break;

                case 9:
                    int multiplying9;
                    final int multiplier9 = 9;
                    int product9;
                    System.out.println("enter multiplying -> ");
                    multiplying9 = input.nextInt();
                    product9 = multiplying9 * multiplier9;
                    System.out.println("The multiplcation is: " + multiplying9
                            + " * " + multiplier9 + " = " + product9);
                    break;

                case 10:
                    int multiplying10;
                    final int multiplier10 = 10;
                    int product10;
                    System.out.println("enter multiplying -> ");
                    multiplying10 = input.nextInt();
                    product10 = multiplying10 * multiplier10;
                    System.out.println("The multiplcation is: " + multiplying10
                            + " * " + multiplier10 + " = " + product10);
                    break;

                case 11:
                    int multiplying11;
                    final int multiplier11 = 11;
                    int product11;
                    System.out.println("enter multiplying -> ");
                    multiplying11 = input.nextInt();
                    product11 = multiplying11 * multiplier11;
                    System.out.println("The multiplcation is: " + multiplying11
                            + " * " + multiplier11 + " = " + product11);
                    break;

                case 12:
                    int multiplying12;
                    final int multiplier12 = 12;
                    int product12;
                    System.out.println("enter multiplying -> ");
                    multiplying12 = input.nextInt();
                    product12 = multiplying12 * multiplier12;
                    System.out.println("The multiplcation is: " + multiplying12
                            + " * " + multiplier12 + " = " + product12);
                    break;

                case 13:
                    System.out.println("Good Bye");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }

        } while (option != 13);

    }

}
