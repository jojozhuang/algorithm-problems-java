package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution485Test extends JunitBase {

    @Test
    public void testFindMaxConsecutiveOnes() {
        System.out.println("findMaxConsecutiveOnes");
        Solution485 instance = new Solution485();

        assertEquals(0, instance.findMaxConsecutiveOnes(new int[]{}));
        assertEquals(1, instance.findMaxConsecutiveOnes(new int[]{1}));
        assertEquals(0, instance.findMaxConsecutiveOnes(new int[]{0}));
        assertEquals(1, instance.findMaxConsecutiveOnes(new int[]{0,0,1}));
        assertEquals(1, instance.findMaxConsecutiveOnes(new int[]{1,0,0}));
        assertEquals(2, instance.findMaxConsecutiveOnes(new int[]{0,0,1,1}));
        assertEquals(3, instance.findMaxConsecutiveOnes(new int[]{1,1,1,0,0,0}));
        assertEquals(3, instance.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        assertEquals(3, instance.findMaxConsecutiveOnes(new int[]{1,1,1,0,1}));
    }
}
