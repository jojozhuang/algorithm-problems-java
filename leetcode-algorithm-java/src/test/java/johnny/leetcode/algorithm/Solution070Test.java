package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution070;

public class Solution070Test extends JunitBase {

    @Test
    public void testClimbStairs() {
        System.out.println("climbStairs");
        Solution070 instance = new Solution070();

        assertEquals(0, instance.climbStairs(0));
        assertEquals(1, instance.climbStairs(1));
        assertEquals(2, instance.climbStairs(2));
        assertEquals(3, instance.climbStairs(3));
        assertEquals(5, instance.climbStairs(4));
        assertEquals(8, instance.climbStairs(5));
    }
}
