package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution329;

public class Solution329Test extends JunitBase {

    @Test
    public void testLongestIncreasingPath() {
        System.out.println("longestIncreasingPath");
        Solution329 instance = new Solution329();

        assertEquals(0, instance.longestIncreasingPath(null));

        int[][] matrix2 = new int[][] {
            {9,9,4},
            {6,6,8},
            {2,1,1}
        };
        assertEquals(4, instance.longestIncreasingPath(matrix2));

        int[][] matrix3 = new int[][] {
            {3,4,5},
            {3,2,6},
            {2,2,1}
        };
        assertEquals(4, instance.longestIncreasingPath(matrix3));

        int[][] matrix4 = new int[][] {
            {7,8,9},
            {9,7,6},
            {7,2,3}
        };
        assertEquals(6, instance.longestIncreasingPath(matrix4));
    }
}
