package hw12taxes;

/**
 *
 * @author braya
 */
import java.util.Scanner;

public class HW12Taxes {

    public static void main(String[] args) {
        
        float multiplication = 0.0F;
        float subtotal;
        float VAT = 1.12F;
        int option1;
        int option2;
        int option;
        System.out.println("█░░░█ █▀▀ █░░ ▄▀▀ ▄▀▀▄ ██▄██ █▀▀\n"
                + "█▄█▄█ █▀▀ █░░ █░░ █░░█ █░▀░█ █▀▀\n"
                + "▀▀░▀▀ ▀▀▀ ▀▀▀ ░▀▀ ░▀▀░ ▀     ▀ ▀▀▀");
        System.out.println("===============================================\n");
        
        Scanner input = new Scanner(System.in);
        
    Scanner scanner = new Scanner(System.in);
    System.out.println("1: Value Added Tax (VAT)" );
    System.out.println("2: Income Tax" );
    System.out.println("3: Currency outflow Tax");
    
    System.out.println("enter your option: ");
            option = input.nextInt();
            
    subtotal = scanner.nextFloat();
    float total = 0;
    if (subtotal > 0){
        total = (subtotal * VAT);
    }
        System.out.println( "The total value of: " + subtotal + " +"
                + " VAT " + "is equal to: " + total);
   

        
   float fraccionbas = 0.0F;
  float impuesto = 0.0F;
   float fracexd = 0.0F;
        if (fraccionbas % 0 == 11290 && impuesto % 0 == 0) {
            float impuestorenta;
            float exceso = 11290;
            float baseimpo = scanner.nextFloat();
            
            impuestorenta = impuesto + ((baseimpo - fraccionbas) * fracexd);
            System.out.println("El impuesot a la renta es: " + impuestorenta);
           
    
        }
    
  
    }
    
}
