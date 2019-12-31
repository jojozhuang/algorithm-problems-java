package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution803;

public class Solution803Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("hitBricks");
        Solution803 instance = new Solution803();

        int[][] grid1 = new int[][] {{1,0,0,0},{1,1,1,0}};
        int[][] hits1 = new int[][] {{1,0}};
        int[] expect1 = new int[] {2};
        assertArrayEquals(expect1, instance.hitBricks(grid1, hits1));

        int[][] grid2 = new int[][] {{1,0,0,0},{1,1,0,0}};
        int[][] hits2 = new int[][] {{1,1},{1,0}};
        int[] expect2 = new int[] {0,0};
        assertArrayEquals(expect2, instance.hitBricks(grid2, hits2));
    }
}
