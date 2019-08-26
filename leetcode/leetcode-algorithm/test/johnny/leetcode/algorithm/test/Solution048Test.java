package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution048;

public class Solution048Test extends JunitBase {

    @Test
    public void testRotate() {
        System.out.println("rotate");
        Solution048 instance = new Solution048();
        int[][] matrix = null;
        instance.rotate(matrix);
        assertArrayEquals(null, matrix);

        int[][] matrix2 = new int[][]{};
        instance.rotate(matrix2);
        assertArrayEquals(new int[][]{},matrix2);

        int[][] matrix3 = new int[][]{{1}};
        instance.rotate(matrix3);
        assertArrayEquals(new int[][]{{1}},matrix3);

        int[][] matrix4 = new int[][]{{1,2},{3,4}};
        instance.rotate(matrix4);
        assertArrayEquals(new int[][]{{3,1},{4,2}},matrix4);

        int[][] matrix5 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        instance.rotate(matrix5);
        assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}},matrix5);

        int[][] matrix6 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        instance.rotate(matrix6);
        assertArrayEquals(new int[][]{{13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}},matrix6);
    }
}
