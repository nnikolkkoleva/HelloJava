
package bg.unwe;

import java.util.Scanner;

public class Filter {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int nums;
        System.out.printf("How many numbers? ");
        nums=s.nextInt();
        System.out.printf("Please enter %d numbers: \n",nums);
        double numbers[] = new double[nums];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=s.nextDouble();
        }
        System.out.print("Operation (>, < or =): ");
        String var;
        var=s.next();
        double than;
        System.out.print("Than: ");
        than=s.nextDouble();
        switch(var){
            case "<":
                for(int i=0;i<numbers.length;i++)
                    if(numbers[i]<than){
                        System.out.printf("%.1f\n",numbers[i]);
                    }
                break;
            case ">":
                for(int i=0;i<numbers.length;i++)
                    if(numbers[i]>than){
                        System.out.printf("%.1f\n",numbers[i]);
                    }
                break;    
            case "=":
                for(int i=0;i<numbers.length;i++)
                    if(numbers[i]==than){
                        System.out.printf("%.1f\n",numbers[i]);
                    }
                break;    
            default:
                break;
        }
    }
    
}
