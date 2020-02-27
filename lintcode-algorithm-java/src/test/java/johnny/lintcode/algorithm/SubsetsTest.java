package johnny.lintcode.algorithm;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class SubsetsTest extends JunitBase {

    /**
     * Test of subsets method, of class Subsets.
     */
    @Test
    public void testSubsets() {
        System.out.println("subsets");
        int[] S = null;
        Subsets instance = new Subsets();
        ArrayList<ArrayList<Integer>> expResult = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = instance.subsets(S);
        assertEquals(expResult, result);
        
        ArrayList<ArrayList<Integer>> expResult4 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> item4 = new ArrayList<Integer>();
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(1);
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(1);
        item4.add(2);
        expResult4.add(item4);        
        item4 = new ArrayList<Integer>();
        item4.add(2);
        expResult4.add(item4);
        assertEquals(expResult4, instance.subsets(new int[]{1,2}));
    }
}
