package hw04menus;

import java.util.Scanner;

public class HW04Menus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ===================");
            System.out.println("   Margin of gain  ");
            System.out.println(" ===================");
            System.out.println("1. -> Gross margin");
            System.out.println("2. -> Net margin");
            System.out.println("3. -> Exit");

            System.out.println("enter your option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    float sales;
                    float cost;
                    float percentage1;
                    System.out.println("enter the sales -> ");
                    cost = input.nextFloat();
                    System.out.println("enter the cost -> ");
                    sales = input.nextFloat();
                    percentage1 = (((sales - cost) / sales) * 100);
                    System.out.println(" the percentage is: "
                            + String.format("%.2f", percentage1) + "%");
                    break;

                case 2:
                    float netprofit;
                    float netsales;
                    float percentage2;
                    System.out.println("enter the net sales -> ");
                    netprofit = input.nextFloat();
                    System.out.println("enter the net cost -> ");
                    netsales = input.nextFloat();
                    percentage2 = ((netprofit / netsales) * 100);

                    System.out.println(" the percentage is: "
                            + String.format("%.2f", percentage2) + "%");
                    break;

                case 3:
                    System.out.println("Thank you. Come back soon" + " :)");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }

        } while (option != 3);

    }

}
