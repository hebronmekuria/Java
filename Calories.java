public class Calories{
  public static void main(String[] args){
    int years=20;
    int feet=6;
    int inches=8;
    int pounds=120;
    int ounces=2;
    
    double weightinKG= (120+2/16)/2.2;
    double heightinCM= (6*30.48)+(8/12*30.48);
   
    
    double maleBMR=10*weightinKG+6.25*heightinCM-5*years+5;
    double femaleBMR=10*weightinKG+6.25*heightinCM-5*years-161;
    
    System.out.println("Male BMR is "+maleBMR+" calories/day.");
    System.out.println("Female BMR is "+femaleBMR+" calories/day.");
    
  }
  
}