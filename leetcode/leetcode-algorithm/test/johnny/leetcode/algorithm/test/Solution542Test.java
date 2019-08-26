package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution542;

public class Solution542Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("updateMatrix");
        Solution542 instance = new Solution542();

        int[][] matrix1 = new int[][] {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        int[][] result1 = new int[][] {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        assertArrayEquals(result1, instance.updateMatrix(matrix1));

        int[][] matrix2 = new int[][] {
            {0, 0, 0},
            {0, 1, 0},
            {1, 1, 1}
        };
        int[][] result2 = new int[][] {
            {0, 0, 0},
            {0, 1, 0},
            {1, 2, 1}
        };
        assertArrayEquals(result2, instance.updateMatrix(matrix2));
    }
}
