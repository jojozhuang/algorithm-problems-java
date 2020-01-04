package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution304Test extends JunitBase {

    @Test
    public void testSumRegion() {
        System.out.println("sumRegion");

        int[][] matrix1 = new int[][] {
            {}
        };
        Solution304 instance1 = new Solution304(matrix1);
        assertEquals(0, instance1.sumRegion(0,0,0,0));
        
        int[][] matrix2 = new int[][] {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
        };
        Solution304 instance2 = new Solution304(matrix2);
        assertEquals(3, instance2.sumRegion(0,0,0,0));
        assertEquals(8, instance2.sumRegion(2,1,4,3));
        assertEquals(11, instance2.sumRegion(1,1,2,2));
        assertEquals(12, instance2.sumRegion(1,2,2,4));
    }
}
