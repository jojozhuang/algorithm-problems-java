package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution200;

public class Solution200Test extends JunitBase {

    @Test
    public void testNumIslands() {
        System.out.println("numIslands");
        Solution200 instance = new Solution200();

        assertEquals(0, instance.numIslands(null));

        char[][] grid2 = new char[][] {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'},
        };
        assertEquals(1, instance.numIslands(grid2));

        char[][] grid3 = new char[][] {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'},
        };
        assertEquals(3, instance.numIslands(grid3));
    }
}
