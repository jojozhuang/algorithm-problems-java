package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution130;

public class Solution130Test extends JunitBase {

    @Test
    public void testSolve() {
        System.out.println("solve");
        char[][] board = null;
        Solution130 instance = new Solution130();
        instance.solve(board);

        char[][] board21 = new char[][] {
            {'X','X','X','X'},
            {'X','O','O','X'},
            {'X','X','O','X'},
            {'X','O','X','X'},
        };
        char[][] board22 = new char[][] {
            {'X','X','X','X'},
            {'X','X','X','X'},
            {'X','X','X','X'},
            {'X','O','X','X'},
        };
        instance.solve(board21);
        assertArrayEquals(board22, board21);

        char[][] board31 = new char[][] {
            {'X','O','X','X','X','O','X','X'},
            {'X','O','O','X','X','X','X','X'},
            {'O','X','O','X','X','O','X','X'},
            {'X','O','X','X','X','O','X','X'},
            {'X','X','X','O','X','X','X','O'},
            {'X','O','X','X','O','X','X','X'},
            {'X','O','X','X','O','X','O','X'},
            {'X','O','X','X','X','X','O','X'},
        };
        char[][] board32 = new char[][] {
            {'X','O','X','X','X','O','X','X'},
            {'X','O','O','X','X','X','X','X'},
            {'O','X','O','X','X','X','X','X'},
            {'X','X','X','X','X','X','X','X'},
            {'X','X','X','X','X','X','X','O'},
            {'X','O','X','X','X','X','X','X'},
            {'X','O','X','X','X','X','O','X'},
            {'X','O','X','X','X','X','O','X'},
        };
        instance.solve(board31);
        assertArrayEquals(board32, board31);

        char[][] board41 = new char[][] {
            {'X','O','X','O','X','O'},
            {'O','X','O','X','O','X'},
            {'X','O','X','O','X','O'},
            {'O','X','O','X','O','X'}
        };
        char[][] board42 = new char[][] {
            {'X','O','X','O','X','O'},
            {'O','X','X','X','X','X'},
            {'X','X','X','X','X','O'},
            {'O','X','O','X','O','X'}
        };
        instance.solve(board41);
        assertArrayEquals(board42, board41);
    }
}
