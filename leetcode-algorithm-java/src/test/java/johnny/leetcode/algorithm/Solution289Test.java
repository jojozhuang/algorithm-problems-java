package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution289Test extends JunitBase {

    @Test
    public void testGameOfLife() {
        System.out.println("gameOfLife");
        int[][] board = null;
        Solution289 instance = new Solution289();
        instance.gameOfLife(board);

        int[][] board2 = new int[][]{
            {1,0,1},
            {1,0,1},
            {0,1,0}
        };
        int[][] expect2 = new int[][]{
            {0,0,0},
            {1,0,1},
            {0,1,0}
        };
        instance.gameOfLife(board2);
        assertArrayEquals(expect2, board2);

        int[][] board3 = new int[][]{
            {1},
            {0},
            {0},
            {1},
            {0},
            {0},
            {1},
            {0},
            {0},
            {1}
        };
        int[][] expect3 = new int[][]{
            {0},
            {0},
            {0},
            {0},
            {0},
            {0},
            {0},
            {0},
            {0},
            {0}
        };
        instance.gameOfLife(board3);
        assertArrayEquals(expect3, board3);
    }
}
