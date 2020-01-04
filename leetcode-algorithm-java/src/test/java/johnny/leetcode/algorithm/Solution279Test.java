package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
