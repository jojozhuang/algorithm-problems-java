package johnny.lintcode.algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class CombinationsTest extends JunitBase {

    /**
     * Test of combine method, of class Combinations.
     */
    @Test
    public void testCombine() {
        System.out.println("combine");
        int n = 0;
        int k = 0;
        Combinations instance = new Combinations();
        List<List<Integer>> expResult = new ArrayList<>();
        List<List<Integer>> result = instance.combine(n, k);
        assertEquals(expResult, result);
        
        List<Integer> list41 = new ArrayList<>();
        list41.add(1);
        list41.add(2);       
        List<List<Integer>> expResult4 = new ArrayList<>();
        expResult4.add(list41);
        assertEquals(expResult4,  instance.combine(2, 2));
    }
}
