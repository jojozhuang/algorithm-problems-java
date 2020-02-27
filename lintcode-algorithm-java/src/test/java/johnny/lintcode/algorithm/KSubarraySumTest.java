package johnny.lintcode.algorithm;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class KSubarraySumTest extends JunitBase {

    /**
     * Test of subarraySum2 method, of class KSubarraySum.
     */
    @Test
    public void testSubarraySum2() {
        System.out.println("subarraySum2");
        int[] nums = null;
        int k = 0;
        KSubarraySum instance = new KSubarraySum();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.subarraySum2(nums, k);
        assertEquals(expResult, result);
        
        ArrayList<Integer> expResult2 = new ArrayList<>();
        expResult2.add(0);
        expResult2.add(2);
        assertEquals(expResult2, instance.subarraySum2(new int[] { 1, 2, 3}, 6));

        ArrayList<Integer> expResult3 = new ArrayList<>();
        expResult3.add(0);
        expResult3.add(1);
        assertEquals(expResult3, instance.subarraySum2(new int[] { 1, 2, 3}, 3));

        ArrayList<Integer> expResult4 = new ArrayList<>();
        expResult4.add(2);
        expResult4.add(4);
        assertEquals(expResult4, instance.subarraySum2(new int[] { 1, 4, 20, 3, 10, 5}, 33));
        
        ArrayList<Integer> expResult5 = new ArrayList<>();
        expResult5.add(2);
        expResult5.add(5);
        assertEquals(expResult5, instance.subarraySum2(new int[] { 1, 6, 20, 3, 10, 5}, 38));
    }
}
