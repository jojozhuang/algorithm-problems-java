package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution308Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("NumMatrix");

        int[][] matrix1 = new int [][] {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
        };
        Solution308 instance = new Solution308(matrix1);
        assertEquals(8, instance.sumRegion(2, 1, 4, 3));
        instance.update(3, 2, 2);
        assertEquals(10, instance.sumRegion(2, 1, 4, 3));
    }
}
