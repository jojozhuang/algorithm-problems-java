package johnny.algorithm.leetcode;

/**
 * Sudoku Solver. (picture not downloaded)
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * 
 * Empty cells are indicated by the character '.'.
 * 
 * You may assume that there will be only one unique solution.
 * 
 * A sudoku puzzle...
 * 
 * ...and its solution numbers marked in red.
 * 
 * @author Johnny
 */
public class Solution037 {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        
        helper(board);
    }
    
    private boolean helper(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)){
                            board[i][j] = c;
                            if (helper(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean isValid(char[][] board, int i, int j, char c) {
        int n = board.length;
        int m = board[0].length;
        for (int row = 0; row < n; row++) {
            if (board[row][j] == c) {
                return false;
            }
        }
        for (int col = 0; col < m; col++) {
            if (board[i][col] == c) {
                return false;
            }
        }
        // block
        int top = 3 * (i / 3);
        int left = 3 * (j / 3);
        for (int row = top; row < top + 3; row++) {
            for (int col = left; col < left + 3; col++) {
                if (board[row][col] == c) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
