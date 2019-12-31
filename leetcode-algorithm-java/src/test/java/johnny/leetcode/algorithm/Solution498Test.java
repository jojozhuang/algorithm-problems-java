package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution498;

public class Solution498Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findDiagonalOrder");
        Solution498 instance = new Solution498();

        int[][] matrix1 = new int[][]{
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        assertArrayEquals(new int[] {1,2,4,7,5,3,6,8,9}, instance.findDiagonalOrder(matrix1));
    }
}
