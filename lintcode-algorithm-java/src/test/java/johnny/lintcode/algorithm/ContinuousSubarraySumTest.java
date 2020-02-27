package johnny.lintcode.algorithm;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class ContinuousSubarraySumTest extends JunitBase {

    /**
     * Test of continuousSubarraySum method, of class ContinuousSubarraySum.
     */
    @Test
    public void testContinuousSubarraySum() {
        System.out.println("continuousSubarraySum");
        int[] A = null;
        ContinuousSubarraySum instance = new ContinuousSubarraySum();
        ArrayList<Integer> expResult = new ArrayList<>();
        ArrayList<Integer> result = instance.continuousSubarraySum(A);
        assertEquals(expResult, result);
        
        ArrayList<Integer> expResult2 = new ArrayList<>();
        expResult2.add(1);
        expResult2.add(4);
        assertEquals(expResult2, instance.continuousSubarraySum(new int[]{-3,1,3,-3,4}));
        ArrayList<Integer> expResult3 = new ArrayList<>();
        expResult3.add(0);
        expResult3.add(0);
        assertEquals(expResult3, instance.continuousSubarraySum(new int[]{1,-1}));
        ArrayList<Integer> expResult4 = new ArrayList<>();
        expResult4.add(4);
        expResult4.add(7);
        assertEquals(expResult4, instance.continuousSubarraySum(new int[]{-1,-2,-3,-100,1,2,3,100}));
    }
}
