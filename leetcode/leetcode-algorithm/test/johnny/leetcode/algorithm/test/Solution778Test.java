package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution778;

public class Solution778Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("swimInWater");
        Solution778 instance = new Solution778();

        int[][] grid1 = new int[][] {{0,2},{1,3}};
        assertEquals(3, instance.swimInWater(grid1));

        int[][] grid2 = new int[][] {{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}};
        assertEquals(16, instance.swimInWater(grid2));
    }
}
