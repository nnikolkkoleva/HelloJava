/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

public class Unique {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nums;
        System.out.printf("How many numbers? ");
        nums=s.nextInt();
        int numbers[] = new int[nums];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=s.nextInt();
        }
        
        for(int i=0; i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                 if(j!=i && numbers[j]==numbers[i]){
                  System.out.println("Duplicate found!"); 
                  numbers[j]=0;
                 }
            }
        }
        System.out.println("Final result:");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
         }
    }
    
}
