package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution256Test extends JunitBase {

    @Test
    public void testMinCost() {
        System.out.println("minCost");
        Solution256 instance = new Solution256();

        assertEquals(0, instance.minCost(null));
        int[][] costs2 = new int[][]{{1,2,3}};
        assertEquals(1, instance.minCost(costs2));
        int[][] costs3 = new int[][]{{1,2,3},{3,1,2}};
        assertEquals(2, instance.minCost(costs3));
    }
}
