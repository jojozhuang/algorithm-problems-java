package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution296;

public class Solution296Test extends JunitBase {

    @Test
    public void testMinTotalDistance() {
        System.out.println("minTotalDistance");
        Solution296 instance = new Solution296();

        assertEquals(0, instance.minTotalDistance(null));

        int[][] grid2 = new int[][] {
            {1,0,0,0,1},
            {0,0,0,0,0},
            {0,0,1,0,0}
        };
        assertEquals(6, instance.minTotalDistance(grid2));
    }
}
