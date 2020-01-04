package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution560Test extends JunitBase {

    @Test
    public void testSubarraySum() {
        System.out.println("subarraySum");
        Solution560 instance = new Solution560();

        assertEquals(0, instance.subarraySum(null, 0));
        assertEquals(1, instance.subarraySum(new int[]{1,2}, 3));
        assertEquals(1, instance.subarraySum(new int[]{1,2}, 2));
        assertEquals(0, instance.subarraySum(new int[]{1,2}, 4));
        assertEquals(3, instance.subarraySum(new int[]{1,1,1}, 1));
        assertEquals(2, instance.subarraySum(new int[]{1,1,1}, 2));
        assertEquals(1, instance.subarraySum(new int[]{1,1,1}, 3));
        assertEquals(4, instance.subarraySum(new int[]{1,2,1,2,1}, 3));
    }
}
