package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution827Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("uniqueLetterString");
        Solution827 instance = new Solution827();

        int[][] grid1 = {{1, 0}, {0, 1}};
        assertEquals(3, instance.largestIsland(grid1));

        int[][] grid2 = {{1, 1}, {1, 0}};
        assertEquals(4, instance.largestIsland(grid2));

        int[][] grid3 = {{1, 1}, {1, 1}};
        assertEquals(4, instance.largestIsland(grid3));
    }
}
