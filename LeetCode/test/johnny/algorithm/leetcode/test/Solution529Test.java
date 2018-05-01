package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution529;

public class Solution529Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("updateBoard");
        Solution529 instance = new Solution529();

        char[][] board1 = new char[][] {
            {'E', 'E', 'E', 'E', 'E'},
            {'E', 'E', 'M', 'E', 'E'},
            {'E', 'E', 'E', 'E', 'E'},
            {'E', 'E', 'E', 'E', 'E'}
        };
        char[][] expect1 = new char[][] {
            {'B', '1', 'E', '1', 'B'},
            {'B', '1', 'M', '1', 'B'},
            {'B', '1', '1', '1', 'B'},
            {'B', 'B', 'B', 'B', 'B'}
        };
        assertArrayEquals(expect1, instance.updateBoard(board1, new int[] {3,0}));

        char[][] board2 = new char[][] {
            {'B', '1', 'E', '1', 'B'},
            {'B', '1', 'M', '1', 'B'},
            {'B', '1', '1', '1', 'B'},
            {'B', 'B', 'B', 'B', 'B'}
        };
        char[][] expect2 = new char[][] {
            {'B', '1', 'E', '1', 'B'},
            {'B', '1', 'X', '1', 'B'},
            {'B', '1', '1', '1', 'B'},
            {'B', 'B', 'B', 'B', 'B'}
        };
        assertArrayEquals(expect2, instance.updateBoard(board2, new int[] {1,2}));
    }
}
