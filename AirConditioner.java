
package bg.unwe;

import java.util.Scanner;


public class AirConditioner {

    
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int External, Internal,Desired;
    
        System.out.println("External temp: ");
        External=s.nextInt();
        
        System.out.println("Internal temp: ");
        Internal=s.nextInt();
        
        System.out.println("Desired temp: ");
        Desired=s.nextInt();
        
        
       
        if (Desired<Internal && External>Internal){
            System.out.println("MAX COLD MODE");
        }
        
        else if (Desired<Internal && External<=Internal){
            System.out.println("ENERGY SAVING COLD MODE");
        }  
        else if(Desired>Internal && External<Internal){
            System.out.println("MAX WARM MODE");         
                    }
         else if (Desired>Internal && External>=Internal){
            System.out.println("ENERGY SAVING WARM MODE");
        }
         else if (Desired==Internal){
            System.out.println("PAUSED");
        }
        }
    }
    

