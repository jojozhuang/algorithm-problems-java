package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution059;

public class Solution059Test extends JunitBase {

    @Test
    public void testGenerateMatrix() {
        System.out.println("generateMatrix");
        Solution059 instance = new Solution059();

        assertArrayEquals(new int[][]{}, instance.generateMatrix(0));
        assertArrayEquals(new int[][]{}, instance.generateMatrix(-1));
        assertArrayEquals(new int[][]{{1}}, instance.generateMatrix(1));
        assertArrayEquals(new int[][]{{1,2},{4,3}}, instance.generateMatrix(2));
        assertArrayEquals(new int[][]{{1,2,3},{8,9,4},{7,6,5}}, instance.generateMatrix(3));
    }
}
