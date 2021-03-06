package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution523Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("checkSubarraySum");
        Solution523 instance = new Solution523();

        assertEquals(true, instance.checkSubarraySum(new int[] {0, 0, 41}, 6));
        assertEquals(true, instance.checkSubarraySum(new int[] {23, 2, 6, 4}, 6));
        assertEquals(true, instance.checkSubarraySum(new int[] {23, 2, 6, 4, 7}, 6));
        assertEquals(true, instance.checkSubarraySum(new int[] {23, 2, 4, 6, 7}, 6));
        assertEquals(true, instance.checkSubarraySum(new int[] {23, 0, 0}, 6));
        assertEquals(false, instance.checkSubarraySum(new int[] {1, 2, 12}, 6));
        assertEquals(false, instance.checkSubarraySum(new int[] {1, 0}, 2));
        assertEquals(true, instance.checkSubarraySum(new int[] {5, 0, 0 }, 0));
        assertEquals(false, instance.checkSubarraySum(new int[] {2, 4, 6}, 9));
        assertEquals(true, instance.checkSubarraySum(new int[] {0, 0, 0, 42}, 6));
        assertEquals(true, instance.checkSubarraySum(new int[] {0, 42}, 6));
        assertEquals(true, instance.checkSubarraySum(new int[] {0, 0, 0, 42}, 0));
        assertEquals(true, instance.checkSubarraySum(new int[] {23, 2, 4, 6, 7}, -6));
        assertEquals(false, instance.checkSubarraySum(new int[] {23, 2, 4, 6, 7}, 0));
        assertEquals(false, instance.checkSubarraySum(new int[] {0,1,0}, 0));
        assertEquals(true, instance.checkSubarraySum(new int[] {1,1}, 2));
        assertEquals(false, instance.checkSubarraySum(new int[] {5,2,4}, 5));
    }
}
