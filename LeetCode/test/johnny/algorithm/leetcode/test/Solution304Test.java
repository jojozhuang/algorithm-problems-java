package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution304;

public class Solution304Test extends JunitBase {

    @Test
    public void testSumRegion() {
        System.out.println("sumRegion");

        int[][] matrix = new int[][] {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
        };
        Solution304 instance = new Solution304(matrix);
        assertEquals(3, instance.sumRegion(0,0,0,0));
        assertEquals(8, instance.sumRegion(2,1,4,3));
        assertEquals(11, instance.sumRegion(1,1,2,2));
        assertEquals(12, instance.sumRegion(1,2,2,4));
    }
}
