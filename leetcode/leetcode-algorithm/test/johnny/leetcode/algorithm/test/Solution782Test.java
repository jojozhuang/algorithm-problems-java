package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution782;

public class Solution782Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("movesToChessboard");
        Solution782 instance = new Solution782();

        int[][] board1 = new int[][] {{0,1,1,0},{0,1,1,0},{1,0,0,1},{1,0,0,1}};
        assertEquals(2, instance.movesToChessboard(board1));
    }
}
