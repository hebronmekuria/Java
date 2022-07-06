public class Baking{
  public static void main(String[] args){
    
    int breadWeight=30;
    double servingSize=3;
    int guests=7;
    double loaves= guests* 3.90625/25;
    double salt=loaves*1.5;//teaspoons
    double yeast=loaves*1.5;//teaspoons
    double sugar=loaves*1.5;//teaspoons
    double flour=loaves*2.5;//cups
    double sourDoughStarter=loaves*2;//cups
    double lukeWarmWater= 0.5*loaves;//cups
    
    System.out.println("For "+guests+" people, you will need "+loaves+" loaves of bread:");
 
    System.out.println(""); 
    System.out.println("  "+yeast+" teaspoons instant yeast.");
    System.out.println("  "+ salt+" teaspoons salt.");
    System.out.println("  "+sugar+" teaspoons sugar.");
    System.out.println("  "+flour+" cups all-purpose flour.");
    System.out.println("  "+sourDoughStarter+" cups sourdough starter.");
    System.out.println("  "+lukeWarmWater+" cups lukewarm water");
    
    

  }
}