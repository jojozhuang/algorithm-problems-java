package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
