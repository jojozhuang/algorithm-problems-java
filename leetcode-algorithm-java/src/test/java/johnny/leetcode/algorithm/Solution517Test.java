package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution517Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMinMoves");
        Solution517 instance = new Solution517();

        assertEquals(3, instance.findMinMoves(new int[] {1,0,5}));
        assertEquals(2, instance.findMinMoves(new int[] {0,3,0}));
        assertEquals(-1, instance.findMinMoves(new int[] {0,2,0}));
    }
}
