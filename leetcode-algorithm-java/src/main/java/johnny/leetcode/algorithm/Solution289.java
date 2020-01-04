package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * Game of Life.
 * <p>
 * According to the Wikipedia's article: "The Game of Life, also known simply as
 * Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 * <p>
 * Given a board with m by n cells, each cell has an initial state live (1) or
 * dead (0). Each cell interacts with its eight neighbors (horizontal, vertical,
 * diagonal) using the following four rules (taken from the above Wikipedia article):
 * <p>
 * Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population..
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * Write a function to compute the next state (after one update) of the board given its current state.
 *
 * @author Johnny
 */
public class Solution289 {
    //https://segmentfault.com/a/1190000003819277
    //http://www.cnblogs.com/grandyang/p/4854466.html
    //http://www.programcreek.com/2014/05/leetcode-game-of-life-java/
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }

        int[] dx = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
        int m = board.length;
        int n = board[0].length;

        // 0: 0->0
        // 1: 1->1
        // 2: 0->1
        // 3: 1->0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                for (int k = 0; k < 8; k++) {
                    count += getNeighbors(board, i + dx[k], j + dy[k]);
                }

                if ((board[i][j] & 1) == 1 && count < 2) {
                    board[i][j] = 3;
                } else if ((board[i][j] & 1) == 1 && (count == 2 || count == 3)) {
                    board[i][j] = 1;
                } else if ((board[i][j] & 1) == 1 && count > 3) {
                    board[i][j] = 3;
                } else if ((board[i][j] & 1) == 0 && count == 3) {
                    board[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 3) {
                    board[i][j] = 0;
                } else if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }
    }

    private int getNeighbors(int[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return 0;
        }

        return board[i][j] & 1;
    }

    public void gameOfLife2(int[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }

        int[][] copy = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            copy[i] = Arrays.copyOf(board[i], board[i].length);
        }
        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[0].length; j++) {
                int next = nextGen(copy, i, j);
                if (next != 2) {
                    board[i][j] = next;
                }
            }
        }
    }

    // 1 = live; 0 = die; 2; unchange
    private int nextGen(int[][] matrix, int i, int j) {
        int count = 0;
        for (int row = i - 1; row <= i + 1; row++) {
            for (int col = j - 1; col <= j + 1; col++) {
                if (row >= 0 && row < matrix.length &&
                        col >= 0 && col < matrix[0].length) {
                    if (row == i && col == j) {
                        continue;
                    } else {
                        count += matrix[row][col];
                    }
                }
            }
        }

        boolean live = matrix[i][j] == 1 ? true : false;
        int nextgen = 2;
        if (live) {
            if (count < 2) {
                nextgen = 0;
            } else if (count == 2 || count == 3) {
                nextgen = 1;
            } else if (count > 3) {
                nextgen = 0;
            }
        } else {
            if (count == 3) {
                nextgen = 1;
            }
        }

        return nextgen;
    }
}
