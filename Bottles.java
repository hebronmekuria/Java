/**
 * Bottles of Pop example to practice debugging and tracing code.
 * 
 * @author Hebron Mekuria
 * @version March 25 2021
 */
public class Bottles {
    
    /**
     * Prints the words for the given verse.
     * 
     * @param verse the verse to display
     */
    public static void sing(int verse) {
      for (int i=verse; i>0; i--){
        if (i>2){
        System.out.print(i);
        System.out.println(" bottles of pop on the wall");
        System.out.print(i);
        System.out.println(" bottles of pop");
        System.out.println("If one of those bottles should happen to fall");
        System.out.print(i-1);
        System.out.println(" bottles of pop on the wall");
        System.out.println();
      }
        else if (i==2){
        System.out.print(i);
        System.out.println(" bottles of pop on the wall");
        System.out.print(i);
        System.out.println(" bottles of pop");
        System.out.println("If one of those bottles should happen to fall");
        System.out.print(i-1);
        System.out.println(" bottle of pop on the wall");
        System.out.println(); 
        }
        else if (i==1){
        System.out.print(i);
        System.out.println(" bottle of pop on the wall");
        System.out.print(i);
        System.out.println(" bottle of pop");
        System.out.println("If that one bottle should happen to fall");
        
        System.out.println("No more bottles of pop on the wall");
        System.out.println();  
        }
      }
      
      
    }
    
    /**
     * Sing each verse of the entire song (using a loop).
     * 
     * @param first the first verse of the song
     */
    public static void iterative(int first) {
        while (first > 0) {
            sing(first);
            first = first - 1;
        }
    }
    
    /**
     * Sing each verse of the entire song (using recursion).
     * 
     * @param first the first verse of the song
     */
    public static void recursive(int first) {
        if (first <= 0) {
            return; // base case
        }
        sing(first);
        recursive(first - 1);
    }
    
    /**
     * Calls the sing method for each verse.
     * 
     * @args command line arguments (optional starting verse)
     */
    public static void main(String[] args) {
        int start;
        sing(5);
        // read the optional command line argument
        if (args.length > 0) {
            start = Integer.parseInt(args[0]);
        } else {
            start = 10;  // default value
        }
        
        // sing the song
    }
    
}
