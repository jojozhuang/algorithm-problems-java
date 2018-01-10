package johnny.algorithm.leetcode;

/**
 * Valid Sudoku .
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled 
 * with the character '.'.
 * 
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable. 
 * Only the filled cells need to be validated.
* 
 * @author Johnny
 */
public class Solution036 {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) {
            return false;
        }

        // check row
        for (int i = 0; i < board.length; i++) {            
            boolean[] numsUsed = new boolean[board.length];
            for (int j = 0; j < board[0].length; j++) {
                if (isDuplicated(board[i][j], numsUsed)) {
                    return false;
                }
            }
        }
        // check column
        for (int i = 0; i < board[0].length; i++) {            
            boolean[] numsUsed = new boolean[board.length];
            for (int j = 0; j < board.length; j++) {
                if (isDuplicated(board[j][i], numsUsed)) {
                    return false;
                }
            }
        }
        
        // check 9 small matrix
        for (int i = 0; i < board.length; i = i + 3) {
            for (int j = 0; j < board[0].length; j = j + 3) {
                if (!isValidMatrix(board, i, j)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    // check matrix
    private boolean isValidMatrix(char[][] matrix, int top, int left) {
        boolean[] numsUsed = new boolean[matrix.length];
        for (int i = top; i < top + 3; i++) {
            for (int j = left; j < left + 3; j++) {
                if (isDuplicated(matrix[i][j], numsUsed)) {
                    return false;
                }
            }
        }        
        return true;
    }
    // check array
    private boolean isDuplicated(char c, boolean[] numsUsed) {
        if (c == '.') {
            return false;
        } else if (numsUsed[c - '1']) {
            return true;
        } else {
            numsUsed[c - '1'] = true;
            return false;
        }
    }    
}
