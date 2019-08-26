package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution750;

public class Solution750Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countCornerRectangles");
        Solution750 instance = new Solution750();

        int[][] grid1 = new int[][]{
            {1, 0, 0, 1, 0},
            {0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0},
            {1, 0, 1, 0, 1}
        };
        assertEquals(1, instance.countCornerRectangles(grid1));

        int[][] grid2 = new int[][]{
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        assertEquals(9, instance.countCornerRectangles(grid2));

        int[][] grid3 = new int[][]{
            {1, 1, 1, 1}
        };
        assertEquals(0, instance.countCornerRectangles(grid3));
    }
}
