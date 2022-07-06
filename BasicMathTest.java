import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author Hebron Mekuria
 * @version February 17 2021
 */

public class BasicMathTest {

 /**
 * Tests the Basic Math.add method
 * 
 */

    @Test
    public void testAdd() {
        int expect;
        int actual;

        expect = 15;
        actual = BasicMath.add(7, 8);
        assertEquals(expect, actual);
        
        expect = 0;
        actual = BasicMath.add(0, 0);
        assertEquals(expect, actual);
        
        expect = -2;
        actual = BasicMath.add(-5, 3);
        assertEquals(expect, actual);
    }
 
 /**
 * Tests the Basic Math.subtract method
 * 
 */

    @Test
    public void testSubtract() {
        int expect;
        int actual;

        expect = 2;
        actual = BasicMath.subtract(3, 1);
        assertEquals(expect, actual);
        
        expect = 5;
        actual = BasicMath.subtract(8, 3);
        assertEquals(expect, actual);
        
        expect = 10;
        actual = BasicMath.subtract(23, 13);
        assertEquals(expect, actual);
    }
 
 /**
 * Tests the Basic Math.multiply method
 * 
 */
    
    @Test
    public void testMultiply(){
      double expect;
      double actual;
      final double DELTA = 0.000001;
      
      expect = 6;
      actual = BasicMath.multiply(2, 3);
      assertEquals(expect, actual, DELTA);
      
      expect = 45;
      actual = BasicMath.multiply(9,5);
      assertEquals(expect, actual, DELTA);
      
      expect = 63;
      actual = BasicMath.multiply(9,6);
      assertEquals(expect, actual, DELTA);
    }
 
 /**
 * Tests the Basic Math.divide method
 * 
 */
    
     @Test
    public void testDivide(){
      double expect;
      double actual;
      final double DELTA = 0.000001;
      
      expect = 6;
      actual = BasicMath.divide(36,6);
      assertEquals(expect, actual, DELTA);
      
      expect = 4.1;
      actual = BasicMath.divide(12.3, 3.0);
      assertEquals(expect, actual, DELTA);
      
      expect = 9;
      actual = BasicMath.divide(108, 12);
      assertEquals(expect, actual, DELTA);
     }
     @Test
     public void testTypeX(){
       double expect;
       double actual;
       final double DELTA = 0.000001;
       
       assertEquals(0.0, BasicMath.calculateTax(1.99, 'X'), DELTA);
     }
     
     @Test
     public void testTypeM(){
       double expect;
       double actual;
       final double DELTA = 0.000001;
       
       assertEquals(1.99*0.11, BasicMath.calculateTax(1.99, 'M'), DELTA);
     }
     
     @Test
     public void testTypeF(){
       double expect;
       double actual;
       final double DELTA = 0.000001;
       
       assertEquals(0.02*1.99, BasicMath.calculateTax(1.99, 'F'), DELTA);
     }
     
     @Test
     public void testOther(){
       double expect;
       double actual;
       final double DELTA = 0.000001;
       
       assertEquals(0.05*1.99, BasicMath.calculateTax(1.99, '@'), DELTA);
     }

 }
     
     

