package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution279;

public class Solution279Test extends JunitBase {

    @Test
    public void testNumSquares() {
        System.out.println("numSquares");
        Solution279 instance = new Solution279();

        assertEquals(0, instance.numSquares(0));
        assertEquals(1, instance.numSquares(4));
        assertEquals(3, instance.numSquares(12));
        assertEquals(2, instance.numSquares(13));
    }
}
