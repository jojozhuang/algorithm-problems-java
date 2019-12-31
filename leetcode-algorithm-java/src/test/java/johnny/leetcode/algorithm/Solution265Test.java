package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution265;

public class Solution265Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minCostII");
        Solution265 instance = new Solution265();

        int[][] costs1 = new int[][] {
            {1,3},
            {4,2},
            {3,1},
        };
        assertEquals(6, instance.minCostII(costs1));
    }
}
