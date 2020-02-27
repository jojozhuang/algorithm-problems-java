package johnny.lintcode.algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class PrintNumbersbyRecursionTest extends JunitBase {

    /**
     * Test of numbersByRecursion method, of class PrintNumbersbyRecursion.
     */
    @Test
    public void testNumbersByRecursion() {
        System.out.println("numbersByRecursion");
        int n = 0;
        PrintNumbersbyRecursion instance = new PrintNumbersbyRecursion();
        List<Integer> expResult =  new ArrayList<>();
        List<Integer> result = instance.numbersByRecursion(n);
        assertEquals(expResult, result);
        
         List<Integer> expResult2 =  new ArrayList<>();
         for (int i = 1; i < 10; i++) {
             expResult2.add(i);
         }
        assertEquals(expResult2, instance.numbersByRecursion(1));
        List<Integer> expResult3 =  new ArrayList<>();
         for (int i = 1; i < 100; i++) {
             expResult3.add(i);
         }
        assertEquals(expResult3, instance.numbersByRecursion(2));
    }
}
