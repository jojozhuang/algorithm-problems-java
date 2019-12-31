package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution883;

public class Solution883Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("uncommonFromSentences");
        Solution883 instance = new Solution883();

        int[][] grid1 = new int[][] {{2}};
        assertEquals(5, instance.projectionArea(grid1));
        
        int[][] grid2 = new int[][] {{1,2},{3,4}};
        assertEquals(17, instance.projectionArea(grid2));
        
        int[][] grid3 = new int[][] {{1,0},{0,2}};
        assertEquals(8, instance.projectionArea(grid3));
        
        int[][] grid4 = new int[][] {{1,1,1},{1,0,1},{1,1,1}};
        assertEquals(14, instance.projectionArea(grid4));
        
        int[][] grid5 = new int[][] {{2,2,2},{2,1,2},{2,2,2}};
        assertEquals(21, instance.projectionArea(grid5));
    }
}
