package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution453Test extends JunitBase {

    @Test
    public void testMinMoves() {
        System.out.println("minMoves");
        Solution453 instance = new Solution453();

        assertEquals(0, instance.minMoves(new int[]{}));
        assertEquals(0, instance.minMoves(new int[]{1}));
        assertEquals(0, instance.minMoves(new int[]{1,1}));
        assertEquals(1, instance.minMoves(new int[]{1,2}));
        assertEquals(2, instance.minMoves(new int[]{-1,1}));
        assertEquals(Integer.MAX_VALUE - 1, instance.minMoves(new int[]{1, Integer.MAX_VALUE}));
        assertEquals(-1 - Integer.MIN_VALUE, instance.minMoves(new int[]{Integer.MIN_VALUE, -1}));
        assertEquals(3, instance.minMoves(new int[]{1,2,3}));
    }
}
