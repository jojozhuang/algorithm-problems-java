package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution276;

public class Solution276Test extends JunitBase {

    @Test
    public void testNumWays() {
        System.out.println("numWays");
        Solution276 instance = new Solution276();

        assertEquals(0, instance.numWays(0, 0));
        assertEquals(2, instance.numWays(1, 2));
        assertEquals(9, instance.numWays(2, 3));
        assertEquals(24, instance.numWays(3, 3));
    }
}
