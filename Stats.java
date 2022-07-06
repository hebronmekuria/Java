import java.lang.Math; //from geeks for geeks
public class Stats{
  public static double standardDeviation(double[] arrayz){
    
    int sum=0;
    for (int i=0; i<arrayz.length; i++){
      sum+=arrayz[i];
    }
    System.out.println(sum);
    double mean= sum/arrayz.length;
    System.out.println(mean);
    double summation=0;
    for (int i=0; i<arrayz.length; i++){
     summation+=Math.pow((arrayz[i]-mean), 2);
    }
    double variance= summation/arrayz.length;
    double standardDeviation=Math.sqrt(variance);
   return standardDeviation;
  }
}