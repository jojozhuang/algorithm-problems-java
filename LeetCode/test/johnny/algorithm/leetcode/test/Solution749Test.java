package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution749;

public class Solution749Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("containVirus");
        Solution749 instance = new Solution749();

        int[][] grid1 = new int[][] {
            {0,1,0,0,0,0,0,1},
            {0,1,0,0,0,0,0,1},
            {0,0,0,0,0,0,0,1},
            {0,0,0,0,0,0,0,0}
        };
        assertEquals(10, instance.containVirus(grid1));

        int[][] grid2 = new int[][] {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        assertEquals(4, instance.containVirus(grid2));

        int[][] grid3 = new int[][] {
            {1,1,1,0,0,0,0,0,0},
            {1,0,1,0,1,1,1,1,1},
            {1,1,1,0,0,0,0,0,0}
        };
        assertEquals(13, instance.containVirus(grid3));
    }
}
