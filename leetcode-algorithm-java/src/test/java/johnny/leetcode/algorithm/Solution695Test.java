package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution695;

public class Solution695Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxAreaOfIsland");
        Solution695 instance = new Solution695();

        int[][] grid1 = new int[][] {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        assertEquals(6, instance.maxAreaOfIsland(grid1));

        int[][] grid2 = new int[][] {
            {0,0,0,0,0,0,0,0},
        };
        assertEquals(0, instance.maxAreaOfIsland(grid2));
    }
}
