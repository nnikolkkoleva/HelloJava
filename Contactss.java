
package contactss;

import java.util.Scanner;


public class Contactss {

    
    public static void main(String[] args) {
    Scanner s =new Scanner (System.in);
    
   int contacts;
   
        System.out.println("How many contacts do you have?");
        contacts=s.nextInt();
        
        int [] contact = new int[contacts];
        
        for (int i = 0; i < contacts; i++) {
           
            System.out.printf("Enter contact %d:\n",i+1);
            
            
            System.out.println("Name: ");
            String name =s.next();
            
            System.out.println("Phone: ");
             String phone=s.next();
             
             for (int j = 10; j!=phone.length(); j++) {
                System.out.printf("Enter contact %d:\n",i+1);
                System.out.println("Name: ");
            name =s.next();
            
            System.out.println("Phone: ");
              phone=s.next();
            }
            
             System.out.println("Search by name: ");
        String names=s.next();
        if(name.equalsIgnoreCase(names)){
            System.out.println("Found: ");
        } 
    }
        
          
        }
    }


