package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution209;

public class Solution209Test extends JunitBase {

    @Test
    public void testMinSubArrayLen() {
        System.out.println("minSubArrayLen");
        Solution209 instance = new Solution209();

        assertEquals(0, instance.minSubArrayLen(0, null));
        assertEquals(1, instance.minSubArrayLen(1, new int[]{1}));
        assertEquals(0, instance.minSubArrayLen(2, new int[]{1}));
        assertEquals(1, instance.minSubArrayLen(2, new int[]{2,3}));
        assertEquals(2, instance.minSubArrayLen(5, new int[]{2,3}));
        assertEquals(0, instance.minSubArrayLen(6, new int[]{2,3}));
        assertEquals(2, instance.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        assertEquals(1, instance.minSubArrayLen(3, new int[]{2,3,1,2,4,3}));
        assertEquals(2, instance.minSubArrayLen(5, new int[]{2,3,1,2,4,3}));
        assertEquals(3, instance.minSubArrayLen(9, new int[]{2,3,1,2,4,3}));
        assertEquals(4, instance.minSubArrayLen(10, new int[]{2,3,1,2,4,3}));
        assertEquals(6, instance.minSubArrayLen(15, new int[]{2,3,1,2,4,3}));
        assertEquals(0, instance.minSubArrayLen(16, new int[]{2,3,1,2,4,3}));
    }
}
