/**
 * @author Hebron Mekuria
 * @version February 24 2021
 * 
 * */

import java.util.Scanner;


public class EMUCard{
  
  
  public static double calculateInterest(double priorBalance, double addtlCharges){
   
    
   if (priorBalance<=0){
     double interest = 0;
   }
   else{
     double interest = 0.02*(priorBalance+addtlCharges); 
   }
   
 return interest;
    
  }
  
  public static double calculateMinPayment(double balance){
    if (balance<0){
      double minimumPayment=0;
    }
    if (balance>=0 && balance<=49.99){
      double minimumPayment=balance;
    }
    if (balance>=50 && balance<=300){
      double minimumPayment=50;
    }
        if (balance>300){
          double minimumPayment=0.2*balance;
        }
     return minimumPayment;
  }
  
  
  public static void main(String[] args){
   
   System.out.print("Please enter prior Balance");
   Scanner priorBalance0 = new Scanner(System.in); 
   double priorBalance1 = priorBalance0.nextDouble();
   
   System.out.print("Please enter additional charges.");
   Scanner addCharges0= new Scanner(System.in);
   double addtlCharges1 = addCharges0.nextDouble();
   
   double interest1=calculateInterest(priorBalance1, addtlCharges1);
   double balance2= priorBalance1+addtlCharges1+interest1;
   double minPayment1=calculateMinPayment(balance2);
   
   System.out.println("");
   System.out.println("EmuCard International Statement);
   System.out.println("===============================");
   System.out.print("Previous balance: $");
   System.out.println(priorBalance1);
   System.out.print("Additional charges: $");
   System.out.println(addtlCharges1);
   System.out.print("Interest: $");
   System.out.println(interest1);
   System.out.println("");
   System.out.print("New balance: $");
   System.out.println(balance2);
   System.out.print("Minimum payment: $");
   System.out.println(minPayment1);
   

 
  }
}