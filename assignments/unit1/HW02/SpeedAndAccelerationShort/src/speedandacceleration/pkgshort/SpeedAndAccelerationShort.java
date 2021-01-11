package speedandacceleration.pkgshort;

public class SpeedAndAccelerationShort {

    public static void main(String[] args) {
        
    short speed1;
    short speed2;
    short distance;
    short acceleration1;
    short time;
    short acceleration2;
    
    
    speed1 = 200;
    acceleration1 = 2;
    distance = 2400;
    time = 2;
    
    
        speed2 = (short) (distance / time);
        
        System.out.println(" The speed of the particle is the operation of " 
        + distance + " / " + time + " is equal to: " 
        + (distance / time));
        
     
        
        acceleration2 = (short) ((speed2 - speed1) / time);
        
        System.out.println(" The second acceleration of the particle is the operation of " 
        +(( speed2 + " - " + speed1)+ "/" + time) + " is equal to: " 
        + ((speed2 - speed1)/time));
    }
    
}
