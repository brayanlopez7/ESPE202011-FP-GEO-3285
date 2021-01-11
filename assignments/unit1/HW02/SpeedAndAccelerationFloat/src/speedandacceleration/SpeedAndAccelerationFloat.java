package speedandacceleration;

public class SpeedAndAccelerationFloat {
    public static void main(String[] args) {
        
    
    float speed1;
    float speed2;
    float distance;
    float acceleration1;
    float time;
    float acceleration2;
    
    
    speed1 = 23.666f;
    acceleration1 = 13.78f;
    distance = 48596.7f;
    time = 15.39f;
    
    
        speed2 = (speed1 + (acceleration1 * time));
        
        System.out.println(" The final speed of the particle is the operation of " 
        + speed1 + " + " + ((acceleration1) + "*" + (time)) + " is equal to: " 
        + ((speed1 + (acceleration1 * time))));
        
     
        
        acceleration2 = ((speed2 - speed1)/time);
        
        System.out.println(" The second acceleration of the particle is the operation of " 
        +(( speed2 + " - " + speed1)+ "/" + time) + " is equal to: " 
        + ((speed2 - speed1)/time));
        
    }
    
}
