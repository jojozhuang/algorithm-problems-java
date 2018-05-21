package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution832;

public class Solution832Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sumOfDistancesInTree");
        Solution832 instance = new Solution832();

        int[][] A1 = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        int[][] expect1 = {
            {1,0,0},
            {0,1,0},
            {1,1,1}
        };
        assertArrayEquals(expect1, instance.flipAndInvertImage(A1));

        int[][] A2 = {
            {1,1,0,0},
            {1,0,0,1},
            {0,1,1,1},
            {1,0,1,0}
        };
        int[][] expect2 = {
            {1,1,0,0},
            {0,1,1,0},
            {0,0,0,1},
            {1,0,1,0}
        };
        assertArrayEquals(expect2, instance.flipAndInvertImage(A2));
    }
}
