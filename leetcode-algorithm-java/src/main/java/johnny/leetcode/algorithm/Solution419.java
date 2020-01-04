package johnny.leetcode.algorithm;

/**
 * Battleships in a Board
 * <p>
 * Given an 2D board, count how many battleships are in it. The battleships are
 * represented with 'X's, empty slots are represented with '.'s. You may assume
 * the following rules:
 * <p>
 * You receive a valid board, made of only battleships or empty slots.
 * Battleships can only be placed horizontally or vertically. In other words,
 * they can only be made of the shape 1xN (1 row, N columns) or
 * Nx1 (N rows, 1 column), where N can be of any size.
 * <p>
 * At least one horizontal or vertical cell separates between two battleships -
 * there are no adjacent battleships.
 * <p>
 * Example:
 * X..X
 * ...X
 * ...X
 * <p>
 * In the above board there are 2 battleships.
 * <p>
 * Invalid Example:
 * ...X
 * XXXX
 * ...X
 * <p>
 * This is an invalid board that you will not receive - as battleships will
 * always have a cell separating between them.
 * <p>
 * Follow up:
 * Could you do it in one-pass, using only O(1) extra memory and without
 * modifying the value of the board?
 *
 * @author Johnny
 */
public class Solution419 {
    public int countBattleships(char[][] board) {
        int m = board.length;
        if (m == 0) return 0;
        int n = board[0].length;

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') continue;
                if (i > 0 && board[i - 1][j] == 'X') continue;
                if (j > 0 && board[i][j - 1] == 'X') continue;
                count++;
            }
        }

        return count;
    }
}
