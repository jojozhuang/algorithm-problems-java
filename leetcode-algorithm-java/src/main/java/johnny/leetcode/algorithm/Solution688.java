package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * 688. Knight Probability in Chessboard
 * <p>
 * On an NxN chessboard, a knight starts at the r-th row and c-th column and attempts to make exactly
 * K moves. The rows and columns are 0 indexed, so the top-left square is (0, 0), and the bottom-right
 * square is (N-1, N-1).
 * <p>
 * A chess knight has 8 possible moves it can make, as illustrated below. Each move is two squares
 * in a cardinal direction, then one square in an orthogonal direction.
 * <p>
 * Each time the knight is to move, it chooses one of eight possible moves uniformly at random
 * (even if the piece would go off the chessboard) and moves there.
 * <p>
 * The knight continues moving until it has made exactly K moves or has moved off the chessboard.
 * Return the probability that the knight remains on the board after it has stopped moving.
 * <p>
 * Example:
 * Input: 3, 2, 0, 0
 * Output: 0.0625
 * Explanation: There are two moves (to (1,2), (2,1)) that will keep the knight on the board.
 * From each of those positions, there are also two moves that will keep the knight on the board.
 * The total probability the knight stays on the board is 0.0625.
 * Note:
 * N will be between 1 and 25.
 * K will be between 0 and 100.
 * The knight always initially starts on the board.
 *
 * @author Johnny
 */
public class Solution688 {
    int[][] moves = {{1, 2}, {1, -2}, {2, 1}, {2, -1}, {-1, 2}, {-1, -2}, {-2, 1}, {-2, -1}};

    public double knightProbability(int N, int K, int r, int c) {
        int len = N;
        double dp0[][] = new double[len][len];
        for (double[] row : dp0) Arrays.fill(row, 1);
        for (int l = 0; l < K; l++) {
            double[][] dp1 = new double[len][len];
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    for (int[] move : moves) {
                        int row = i + move[0];
                        int col = j + move[1];
                        if (isLegal(row, col, len)) dp1[i][j] += dp0[row][col];
                    }
                }
            }
            dp0 = dp1;
        }
        return dp0[r][c] / Math.pow(8, K);
    }

    private boolean isLegal(int r, int c, int len) {
        return r >= 0 && r < len && c >= 0 && c < len;
    }
}