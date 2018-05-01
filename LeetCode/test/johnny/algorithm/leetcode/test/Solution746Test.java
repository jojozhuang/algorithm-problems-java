package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution746;

public class Solution746Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minCostClimbingStairs");
        Solution746 instance = new Solution746();

        assertEquals(15, instance.minCostClimbingStairs(new int[] {10, 15, 20}));
        assertEquals(6, instance.minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
