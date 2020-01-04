package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution694Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numDistinctIslands");
        Solution694 instance = new Solution694();

        int[][] grid1 = new int[][] {
            {1,1,0,0,0},
            {1,1,0,0,0},
            {0,0,0,1,1},
            {0,0,0,1,1}
        };
        assertEquals(1, instance.numDistinctIslands(grid1));

        int[][] grid2 = new int[][] {
            {1,1,0,1,1},
            {1,0,0,0,0},
            {0,0,0,0,1},
            {1,1,0,1,1}
        };
        assertEquals(3, instance.numDistinctIslands(grid2));
        
        int[][] grid3 = new int[][] {
            {1,1,0},
            {0,1,1},
            {0,0,0},
            {1,1,1},
            {0,1,0}
        };
        assertEquals(2, instance.numDistinctIslands(grid3));
    }
}
