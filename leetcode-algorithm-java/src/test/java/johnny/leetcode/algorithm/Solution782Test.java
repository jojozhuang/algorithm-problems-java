package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution782Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("movesToChessboard");
        Solution782 instance = new Solution782();

        int[][] board1 = new int[][] {{0,1,1,0},{0,1,1,0},{1,0,0,1},{1,0,0,1}};
        assertEquals(2, instance.movesToChessboard(board1));
    }
}
