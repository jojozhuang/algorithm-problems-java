package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution980Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("uniquePathsIII");
        Solution980 instance = new Solution980();
        
        int[][] grid1 = new int[][] {
            {1,0,0,0},{0,0,0,0},{0,0,2,-1}
        };
        assertEquals(2, instance.uniquePathsIII(grid1));
        
        int[][] grid2 = new int[][] {
            {1,0,0,0},{0,0,0,0},{0,0,0,2}
        };
        assertEquals(4, instance.uniquePathsIII(grid2));

        int[][] grid3 = new int[][] {
            {0,1},{2,0}
        };
        assertEquals(0, instance.uniquePathsIII(grid3));
    }
}
