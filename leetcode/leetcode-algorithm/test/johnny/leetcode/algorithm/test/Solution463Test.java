package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution463;

public class Solution463Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("islandPerimeter");
        Solution463 instance = new Solution463();

        int[][] grid1 = new int[][] {
            {0,1,0,0},
            {1,1,1,0},
            {0,1,0,0},
            {1,1,0,0}
        };
        assertEquals(16, instance.islandPerimeter(grid1));
    }
}
