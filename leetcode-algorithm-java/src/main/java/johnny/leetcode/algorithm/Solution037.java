package johnny.leetcode.algorithm;

/**
 * Sudoku Solver. (picture not downloaded)
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * <p>
 * Empty cells are indicated by the character '.'.
 * <p>
 * You may assume that there will be only one unique solution.
 * <p>
 * A sudoku puzzle...
 * <p>
 * ...and its solution numbers marked in red.
 *
 * @author Johnny
 */
public class Solution037 {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] box = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int val = c - '0';
                    row[i][val - 1] = 1;
                    col[j][val - 1] = 1;
                    int bx = i / 3;
                    int by = j / 3;
                    box[bx * 3 + by][val - 1] = 1;
                }
            }
        }

        fill(board, 0, 0, row, col, box);
    }

    private boolean fill(char[][] board, int x, int y, int[][] row, int[][] col, int[][] box) {
        if (x == 9) {
            return true;
        }

        // next position, from left to right, and up to down
        int nc = (y + 1) % 9;           // column of next position
        int nr = (nc == 0) ? x + 1 : x; // row of next position
        if (board[x][y] != '.') {
            return fill(board, nr, nc, row, col, box);
        }

        // board[x][y] == '.'
        for (int i = 0; i < 9; i++) {
            int bx = x / 3;
            int by = y / 3;
            int boxkey = bx * 3 + by;
            if (row[x][i] == 0 && col[y][i] == 0 && box[boxkey][i] == 0) {
                row[x][i] = 1;
                col[y][i] = 1;
                box[boxkey][i] = 1;
                board[x][y] = (char) (i + 1 + '0');
                if (fill(board, nr, nc, row, col, box)) {
                    return true;
                }
                board[x][y] = '.';
                box[boxkey][i] = 0;
                col[y][i] = 0;
                row[x][i] = 0;
            }
        }

        return false;
    }

    public void solveSudoku2(char[][] board) {
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
                        if (isValid(board, i, j, c)) {
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
