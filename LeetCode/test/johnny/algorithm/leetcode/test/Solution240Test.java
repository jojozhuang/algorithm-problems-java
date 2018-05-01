package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution240;

public class Solution240Test extends JunitBase {

    @Test
    public void testSearchMatrix() {
        System.out.println("searchMatrix");
        Solution240 instance = new Solution240();

        assertEquals(false, instance.searchMatrix(null, 0));

        int[][] matrix1 = new int[][] {new int[] {1}};
        assertEquals(false, instance.searchMatrix(matrix1, 0));
        assertEquals(true, instance.searchMatrix(matrix1, 1));

        int[][] matrix2 = new int[][] {new int[] {1, 2}, new int[] {2, 3}};
        assertEquals(false, instance.searchMatrix(matrix2, 0));
        assertEquals(true, instance.searchMatrix(matrix2, 2));
        assertEquals(true, instance.searchMatrix(matrix2, 3));
        assertEquals(false, instance.searchMatrix(matrix2, 4));

        int[][] matrix3 = new int[][] { new int[] {1, 4, 7, 11, 15},
                                        new int[] {2, 5, 8, 12, 19},
                                        new int[] {3, 6, 9, 16, 22},
                                        new int[] {10, 13, 14, 17, 24},
                                        new int[] {18, 21, 23, 26, 30}};
        assertEquals(false, instance.searchMatrix(matrix3, 0));
        assertEquals(true, instance.searchMatrix(matrix3, 2));
        assertEquals(true, instance.searchMatrix(matrix3, 3));
        assertEquals(true, instance.searchMatrix(matrix3, 11));
        assertEquals(false, instance.searchMatrix(matrix3, 20));
        assertEquals(true, instance.searchMatrix(matrix3, 22));
        assertEquals(true, instance.searchMatrix(matrix3, 30));
        assertEquals(false, instance.searchMatrix(matrix3, 31));
    }
}
