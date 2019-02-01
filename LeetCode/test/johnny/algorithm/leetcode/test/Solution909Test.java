package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution909;

public class Solution909Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("snakesAndLadders");
        Solution909 instance = new Solution909();

        int[][] board1 = new int[][]{
            {-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1},
            {-1,35,-1,-1,13,-1},
            {-1,-1,-1,-1,-1,-1},
            {-1,15,-1,-1,-1,-1}};
        assertEquals(4, instance.snakesAndLadders(board1));
    }
}
