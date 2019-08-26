package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution311;

public class Solution311Test extends JunitBase {

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Solution311 instance = new Solution311();

        assertArrayEquals(new int[][]{}, instance.multiply(null, null));

        int[][] A2 = new int[][]{
            {1, 0, 0},
            {-1, 0, 3}
        };
        int[][] B2 = new int[][]{
            {7, 0, 0},
            {0, 0, 0},
            {0, 0, 1}
        };
        int[][] expect2 = new int[][]{
            {7, 0, 0},
            {-7, 0, 3}
        };
        assertArrayEquals(expect2, instance.multiply(A2, B2));
    }
}
