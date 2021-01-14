package numberofthelist;

public class NumberOfTheList {

    public static void main(String[] args) {
        int i;
        i = 1;

        System.out.println("=======================================");
        System.out.println("This is while loop from 1 to 25");
        System.out.println("=======================================");

        while (i < 26) {
            System.out.println(" i: " + i);
            i++;
        }

        System.out.println("======================================");
        System.out.println("Multiplication Tables : 25");
        System.out.println("======================================");
        
        int top = 12;
        int product = 0;
        int table = 25;
        for (int j = 1; j <= top; j++) {
            product = table + j;
            System.out.println("25 *" + j + " = " + product);
        }

        System.out.println("======================================");
        System.out.println("Calculation of the temperature of water from "
                + "0°C to 20°C to Kelvin");
        System.out.println("======================================");
        
        int celsius = 20;
        float sum = 0;
        float kelvin = 273.15f;
        for (int m = 0; m <= celsius; m++) {
            sum = m + kelvin;
            System.out.println(m + " °C + " + kelvin + " = " + sum + " K ");
        }

    }

}