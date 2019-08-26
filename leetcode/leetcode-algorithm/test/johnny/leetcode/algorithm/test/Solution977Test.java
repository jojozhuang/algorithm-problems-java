package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution977;

public class Solution977Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sortedSquares");
        Solution977 instance = new Solution977();

        assertArrayEquals(new int[] {0}, instance.sortedSquares(new int[] {0}));
        assertArrayEquals(new int[] {1}, instance.sortedSquares(new int[] {-1}));
        assertArrayEquals(new int[] {0,1,1}, instance.sortedSquares(new int[] {-1,0,1}));
        assertArrayEquals(new int[] {0,1,4}, instance.sortedSquares(new int[] {-2,0,1}));
        assertArrayEquals(new int[] {0,1,9,16,100}, instance.sortedSquares(new int[] {-4,-1,0,3,10}));
        assertArrayEquals(new int[] {4,9,9,49,121}, instance.sortedSquares(new int[] {-7,-3,2,3,11}));
    }
}
