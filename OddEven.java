/**
 * 
 * Final Project
 * 
 * This code asks for an input from the user, checks if it is an even or odd number, and prints out a graphic with stars that reads "Even" or "odd"
 * 
 * @author Nardos Melka & Hebron Mekuria
 * @version March 11 2021
 * 
 * 
 **/


import java.util.Scanner; // get Scanner from java library
//The idea/main algorithm for the letters "V", "n" came from https://www.javainterviewpoint.com/alphabet-pattern-program/


public class OddEven
{
    public static void main( String args[] ) // start of execution
    {
        Scanner input = new Scanner( System.in );  // create scanner  
        int rows=8;
 
        System.out.println( "Enter number:" ); // prompt user to enter the integer
        int number = input.nextInt(); // read the integer
 
        if (number % 2 == 0) // if remainder when divided by 2 is 0
        {
            System.out.println (number + " is even");
                  
                  
                 //E
      System.out.println("**************");
        for (int i=0; i<4; i++){
          System.out.println("*");
        }
        System.out.println("**************");
        for (int i=0; i<4; i++){
          System.out.println("*");
        }
       System.out.println("**************");
        
       
       
       System.out.println("");
               
//V
               for(int i=rows-1;i>=0 ;i--)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows) 
                    System.out.print("*");
            }
           System.out.println();
        }
               System.out.println("");

        //E
        System.out.println("**************");
        for (int i=0; i<4; i++){
          System.out.println("*");
        }
        System.out.println("**************");
        for (int i=0; i<4; i++){
          System.out.println("*");
        }
       System.out.println("**************");
        
       System.out.println(" ");
       //N
       for(int i=0;i<= rows;i++)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows)    
                    System.out.print("*");
            }
           System.out.println();
       }  
        }

        
        
        
//o
        if (number % 2 == 1)// if remainder when divided by 2 is 1
        {
            System.out.println (number + " is odd");

                        
        for(int i=0;i<= rows;i++)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows)    
                    System.out.print("*");
            }
           System.out.println();
           
        }
        
        
    
                       for(int i=rows-1;i>=0 ;i--)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows) 
                    System.out.print("*");
            }
           System.out.println();
        }
               System.out.println("");
         
 
      //d       
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<=i; j++) { System.out.print("*"+ " "); } System.out.println(""); } for (int i=rows-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
          System.out.print("");
        //second d    
                         
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<=i; j++) { System.out.print("*"+ " "); } System.out.println(""); } for (int i=rows-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
           
    } 
}
}


