import java.util.Scanner;
/**
 * 
 *
 * @author Hebron Mekuria 
 * @version February 10 2021
 */


public class Celsius {
  public static void main(String[] args) {
    System.out.print("Please enter the temperature in degrees celsius ");
    Scanner celsius1;
    celsius1=new Scanner(System.in);
    double celsius=(celsius1.nextInt());
    double farenheit=celsius*9.0/5.0 +32;
   System.out.printf("The temperature in farenheit is: %.1f\n", farenheit);
                        
    
  }
}
    