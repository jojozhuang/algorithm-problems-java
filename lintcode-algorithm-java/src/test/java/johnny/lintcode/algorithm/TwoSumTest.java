package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Johnny
 */
public class TwoSumTest extends JunitBase {

    /**
     * Test of twoSum method, of class TwoSum.
     */
    @Test
    public void testTwoSum() {
        System.out.println("twoSum");
        int[] numbers = null;
        int target = 0;
        TwoSum instance = new TwoSum();
        int[] expResult = new int[] {0, 0};
        int[] result = instance.twoSum(numbers, target);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(expResult, instance.twoSum2(new int[] { 0 }, 3));
        assertArrayEquals(expResult, instance.twoSum2(new int[] { 0, 2 }, 3));
        assertArrayEquals(new int[] {1, 2}, instance.twoSum2(new int[] { 4, 5 }, 9));
        assertArrayEquals(new int[] {1, 2}, instance.twoSum2(new int[] { 2, 7 , 11, 15 }, 9));
        assertArrayEquals(new int[] {1, 4}, instance.twoSum2(new int[] { 2, 7 , 11, 15 }, 17));
        assertArrayEquals(new int[] {2, 3}, instance.twoSum2(new int[] { 1, 0, -1 }, -1));
    }
}
