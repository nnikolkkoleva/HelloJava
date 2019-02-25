
package bg.unwe;


import java.util.Scanner;


public class SaladMaker {

    
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  
    System.out.print("How many tomato slices do you want?");
    int TomatoSlices =s.nextInt();
    
    System.out.print("How many cucumber slices do you want?");
    int CucumberSlices=s.nextInt();
    
    System.out.print("How much olive oil do you want? (in ml)");
    double OliveOil=s.nextDouble();
    
    System.out.print("Hou much salt do you want? (in g)");
    double Salt=s.nextDouble();
    
    double weight = ((30*TomatoSlices)+(14*CucumberSlices)+(1.2*OliveOil));
  
    System.out.printf("The salad contains %d tomato slices, %d cucumber slices, %.1fml olive oil and %.1fmg salt.The weight is %.2f\n",TomatoSlices, CucumberSlices, OliveOil, Salt, weight);
    
    System.out.print("What's the target weight of the salad?");
    double WeightOfSalad =s.nextDouble();
    
    double ToTotalWeight = (WeightOfSalad-weight);
    
    double Tomato = (ToTotalWeight/30);
    double Cucumber =(ToTotalWeight/14);
    
    System.out.printf("You should put %f slices of tomato or %f slices of cucumber in the salad to reach the target weight of %.2f g.\n ", Tomato, Cucumber, WeightOfSalad);
    
    
    
    
    
    
    
            
    
    
            
    
    }
    
}
