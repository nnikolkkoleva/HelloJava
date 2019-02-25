
package bg.unwe;

import java.util.Scanner;


public class CoffeeMachine {

    
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    double Amount;
        System.out.print("Amount: ");
        Amount=s.nextDouble();
        
        String menu; 
        System.out.print("1.short espresso\t0.50\n2. long espresso\t0.60\n3. cappuccino\t0.85\n4. coffee with milk\t0.90\n5. caffeine-free\t0.60\n");
        
        System.out.print("Your choice: ");
        int choice =s.nextInt();
        
        if(choice<1 || choice>5){
            System.out.println("Please select from the menu: ");
            return;
           
           }
        switch((int)choice){
            case 1:
                if (Amount<0.50){
                    System.out.println("Not enough money");
                    break;
                }
                else if (Amount==0.50){
                    System.out.println("Preparing your drink...");
                    break;
            }
                else  {
                    System.out.println("Preparing you drink...");
                    double change = (Amount-0.50);
                    System.out.printf("Change: %.2f\n",change);
                    break;
                }
                
            case 2:
            
                if (Amount<0.60){
                    System.out.println("Not enough money");
                    break;
                }
                else if (Amount==0.60){
                    System.out.println("Preparing your drink...");
                    break;
            }
                else  {
                    System.out.println("Preparing you drink...");
                    double change = (Amount-0.60);
                    System.out.printf("Change: %.2f\n",change);
                    break;
                }
                
            case 3:
                if (Amount<0.85){
                    System.out.println("Not enough money");
                    break;
                }
                else if (Amount==0.85){
                    System.out.println("Preparing your drink...");
                    break;
            }
                else  {
                    System.out.println("Preparing you drink...");
                    double change = (Amount-0.85);
                    System.out.printf("Change: %.2f\n",change);
                    break;
                }
                
            case 4:
                if (Amount<0.90){
                    System.out.println("Not enough money");
                    break;
                }
                else if (Amount==0.90){
                    System.out.println("Preparing your drink...");
                    break;
            }
                else  {
                    System.out.println("Preparing you drink...");
                    double change = (Amount-0.90);
                    System.out.printf("Change: %.2f\n",change);
                    break;
                }
            case 5:
                if (Amount<0.60){
                    System.out.println("Not enough money");
                    break;
                }
                else if (Amount==0.60){
                    System.out.println("Preparing your drink...");
                    break;
            }
                else  {
                    System.out.println("Preparing you drink...");
                    double change = (Amount-0.60);
                    System.out.printf("Change: %.2f\n",change);
                    break;
                    
                }
        }
    }
    
    
    
    
}
