package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution713Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSubarrayProductLessThanK");
        Solution713 instance = new Solution713();

        assertEquals(8, instance.numSubarrayProductLessThanK(new int[] {10, 5, 2, 6}, 100));
        assertEquals(0, instance.numSubarrayProductLessThanK(new int[] {1,1,1}, 1));
    }
}
