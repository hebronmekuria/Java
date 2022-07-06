import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    double[] arrayed=new double[25];
   
    for (int i=0; i<25;i++){
    
  System.out.print("Please enter number"+i);  
  Scanner buy0 =new Scanner(System.in);
  double buy= buy0.nextDouble();
  
  arrayed[i]=buy;
    }
    System.out.print(arrayed[0]);
    double standard=Stats.standardDeviation(arrayed);
    System.out.println(standard);
    System.out.print("The standard deviation is"+standard);
  }
}