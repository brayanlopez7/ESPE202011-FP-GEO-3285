/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author braya
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //variables 
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int multiplying;
        int multiplier;
        int product;
        
        int dividend1;
        int divisor1;
        int quotient1;
        
        int dividend2;
        int divisor2;
        int quotient2;
        
 
        addend1 = 5;
        addend2 = 18;
        
        minuend = -23;
        subtrahend = -6;       
        
        multiplying = 7;
        multiplier = 18;
                     
        dividend1 = 67;
        divisor1 = 8;
        
         dividend2 = 448;
        divisor2 = 34;
        
        //opereration
        sum = addend1 + addend2;
        
        
        System.out.println(" The Adition of " + addend1 + " + " + addend2 +
        " is equal to --> " + sum);
        
        ++sum;
        System.out.println(" sum is equal to --> " + sum);
        
                
        sum++;
        System.out.println(" sum is equal to --> " + sum);
        System.out.println(" adding one to sum " + (sum++));
        System.out.println(" ading one to sum " + ((++sum)));
        
        
        System.out.println(" The Subtraction of " + minuend + " - " + subtrahend +
        " is equal to " + (minuend - subtrahend));
        
        System.out.println(" The Multiplication of " + multiplying + " * " + multiplier +
        " is equal to --> " + (multiplying * multiplier));
       
        System.out.println(" The Division of " + dividend1 + " / " + divisor1 +
        " is equal to --> " + (dividend1 / divisor1));
        
        System.out.println(" The Remainder of " + dividend2 + " & " + divisor2 +
        " is equal to --> " + (dividend2 % divisor2));
        
    }
    
}
