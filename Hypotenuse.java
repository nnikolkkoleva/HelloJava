package bg.unwe.hypotenuse;

/**
 *Calculate the hypotenuse of the triangle.
 * @author Acer
 */
public class Hypotenuse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a, b, c; 
       a=3;
       b=4;
       c=Math.sqrt(a*a+b*b);
       System.out.println("The length of the hypotenuse is"+c);
    }
    
}
