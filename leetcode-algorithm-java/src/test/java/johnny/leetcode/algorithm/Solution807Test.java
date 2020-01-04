package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution807Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxIncreaseKeepingSkyline");
        Solution807 instance = new Solution807();

        int[][] grid1 = new int[][] {{3, 0, 8, 4},{2, 4, 5, 7},{9, 2, 6, 3},{0, 3, 1, 0}};
        assertEquals(35, instance.maxIncreaseKeepingSkyline(grid1));
    }
}
