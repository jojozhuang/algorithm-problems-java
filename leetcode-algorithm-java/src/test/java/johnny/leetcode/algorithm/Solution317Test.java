package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution317;

public class Solution317Test extends JunitBase {

    @Test
    public void testShortestDistance() {
        System.out.println("shortestDistance");
        Solution317 instance = new Solution317();

        assertEquals(-1, instance.shortestDistance(null));

        int[][] grid2 = new int[][] {
            {1,0,2,0,1},
            {0,0,0,0,0},
            {0,0,1,0,0}
        };
        assertEquals(7, instance.shortestDistance(grid2));
        
        int[][] grid3 = new int[][] {
            {0,2,1},
            {1,0,2},
            {0,1,0}
        };
        assertEquals(-1, instance.shortestDistance(grid3));
    }
}
