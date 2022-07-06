import java.util.Scanner;

/**
 *
 *
 * @author Hebron Mekuria 
 * @version February 10 2021
 */




public class Fahrenheit {
  public static void main(String[] args) {
    System.out.print("Please enter the first fahrenheit value ");
    Scanner F1;
    F1=new Scanner(System.in);
    double F=(F1.nextInt());
    double C= (F-32)*5.0/9.0;
    System.out.printf("This temperature in celsius is: %.2f\n", C);
    double K=C+273;
    System.out.printf("This temperature in kelvin is: %.2f\n", K);
    
    System.out.print("Please enter the second fahrenheit value ");
    Scanner F3;
    F3=new Scanner(System.in);
    double F2=(F3.nextInt());
    
    double C2= (F2-32)*5.0/9.0;
    System.out.printf("This temperature in celsius is: %.2f\n", C2);
    double K2= C2+273;
    System.out.printf("This temperature in kelvin is: %.2f\n", K2);
    
    double difference=((F2-F)/F)*100;
    System.out.printf("The two temperatures are different by %.1f\n", difference,"percent");
    
    
  }
}