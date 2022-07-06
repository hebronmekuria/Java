import java.util.Scanner;
/**
 * This program is supposed to take an input of seconds and convert it into hours, minutes and seconds.
 *
 * @author Hebron Mekuria 
 * @version February 8 2021
 */


public class Seconds {
  public static void main(String[] args) {
    
    
    int seconds;
    int minutes;
    int hours;
    Scanner input;
    
      System.out.print("Enter the number of seconds: ");
      input = new Scanner(System.in);
      int input1=(input.nextInt()); //this is from stackoverflow website
      
      
      hours= input1/3600;
      minutes=(input1%3600)/60;
      seconds=(input1%3600)%60;
      System.out.println(" ");
      System.out.print(input1);
      System.out.print(" seconds = ");
      System.out.print(hours);
      System.out.print(" hours, ");
      System.out.print(minutes);
      System.out.print(" minutes, and ");
      System.out.print(seconds);
      System.out.println(" seconds");
      System.out.println(" ");
      
      
      
      
      
      
      
       
  }
}