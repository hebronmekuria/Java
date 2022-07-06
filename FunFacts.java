import java.lang.Math; //I got this from the website "geeks for geeks"

public class FunFacts{
  public static void main(String[] args){
    int number=34;
    double squared=Math.pow(number, 2); //from geeks for geeks
    double cubed=Math.pow(number, 3);
    
    System.out.println(number+ " squared is "+squared);
    System.out.println(number+" cubed is "+cubed);
    System.out.println("One tenth of "+ number+ " is "+ (number/10));
    System.out.println(number+" plus 123 is "+ (123+number));
    System.out.println(number+" minus 456 is "+ (number-456));
  }
}