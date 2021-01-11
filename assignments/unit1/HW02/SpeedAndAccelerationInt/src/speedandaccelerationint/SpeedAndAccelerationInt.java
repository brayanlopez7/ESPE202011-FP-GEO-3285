package speedandaccelerationint;

public class SpeedAndAccelerationInt {
    
    public static void main(String[] args) {
        
    int speed1;
    int speed2;
    int distance;
    int acceleration1;
    int time;
    int acceleration2;
    
    
    speed1 = 800;
    acceleration1 = -3;
    distance = 50305;
    time = 4;
    
    
        speed2 = (distance / time);
        
        System.out.println(" The speed of the particle is the operation of " 
        + distance + " / " + time + " is equal to: " 
        + (distance / time));
        
     
        
        acceleration2 = ((speed2 - speed1) / time);
        
        System.out.println(" The second acceleration of the particle is the operation of " 
        +(( speed2 + " - " + speed1)+ "/" + time) + " is equal to: " 
        + ((speed2 - speed1)/time));
    }
    
}
