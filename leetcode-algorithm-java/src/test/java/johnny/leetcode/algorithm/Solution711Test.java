package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution711;

public class Solution711Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numDistinctIslands2");
        Solution711 instance = new Solution711();

        int[][] grid1 = new int[][] {
            {1,1,0,0,0},
            {1,0,0,0,0},
            {0,0,0,0,1},
            {0,0,0,1,1}
        };
        assertEquals(1, instance.numDistinctIslands2(grid1));

        int[][] grid2 = new int[][] {
            {1,1,1,0,0},
            {1,0,0,0,1},
            {0,1,0,0,1},
            {0,1,1,1,0}
        };
        assertEquals(2, instance.numDistinctIslands2(grid2));
    }
}
