package ws05iterations;

public class WS05Iterations {

    public static void main(String[] args) {
        
        int i;
        i = 0;
        
        System.out.println("==== This is a while loop from 1 to 10 ====");
        
        while( i < 10) {
            System.out.println("i ->" + i);
            //i = i+1; anorher option
            i++;
            //i = i + 1; another option
        }
        
        System.out.println("first 5 even numbers");
        i = 2;
        while ( i < 10 ) {
            System.out.println(i + " -> is even");
            i += 2;
        }
        
        System.out.println("First 5 odd numbers");
        
        int stop;
        stop = 20;
        for(int j=1; j<stop; j+=2) {
            System.out.println("odd number ->" + j);
        }
        
        System.out.println("Multiplication Tables : 7");
        int top = 12;
        int product = 0;
        int table = 7;
        for (int j =1; j <= top; j++) {
            product = table * j;
            System.out.println("7 *" + j + " = " + product);
        }
      
    }
}
    

