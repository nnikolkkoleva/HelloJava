
package bg.unwe;

import java.util.Scanner;




public class DistanceCalculator3 {

    
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double Speed, Duration, Distance;
    
    
        System.out.print("Speed (in km/h): ");
        Speed = s.nextDouble();
        
        if (Speed<=0){
            System.out.println("Invalid speed");
            return;
        }
        else if (Speed>100){
        System.out.println("You're driving too fast");
    }
        System.out.print("Diration (in hours): ");
        Duration = s.nextDouble();
        
        if (Duration<=0){
            System.out.println("Invalid duration");
            return;
            
        }
        else if (Duration>10){
            System.out.println("You need some rest!");
        }
        
        Distance = (Speed*Duration);
        
        System.out.printf("Distance: %.2f km\n",Distance);
    
    }
    
}
