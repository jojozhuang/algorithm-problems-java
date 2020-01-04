package johnny.leetcode.algorithm;

/**
 * 782. Transform to Chessboard
 * An N x N board contains only 0s and 1s. In each move, you can swap any 2 rows with each other, or any 2 columns with each other.
 * <p>
 * What is the minimum number of moves to transform the board into a "chessboard" - a board where no 0s and no 1s are 4-directionally adjacent? If the task is impossible, return -1.
 * <p>
 * Examples:
 * Input: board = [[0,1,1,0],[0,1,1,0],[1,0,0,1],[1,0,0,1]]
 * Output: 2
 * Explanation:
 * One potential sequence of moves is shown below, from left to right:
 * <p>
 * 0110     1010     1010
 * 0110 --> 1010 --> 0101
 * 1001     0101     1010
 * 1001     0101     0101
 * <p>
 * The first move swaps the first and second column.
 * The second move swaps the second and third row.
 * <p>
 * <p>
 * Input: board = [[0, 1], [1, 0]]
 * Output: 0
 * Explanation:
 * Also note that the board with 0 in the top left corner,
 * 01
 * 10
 * <p>
 * is also a valid chessboard.
 * <p>
 * Input: board = [[1, 0], [1, 0]]
 * Output: -1
 * Explanation:
 * No matter what sequence of moves you make, you cannot end with a valid chessboard.
 * Note:
 * <p>
 * board will have the same number of rows and columns, a number in the range [2, 30].
 * board[i][j] will be only 0s or 1s.
 *
 * @author Johnny
 */
public class Solution782 {
    public int movesToChessboard(int[][] b) {
        int N = b.length, rowSum = 0, colSum = 0, rowSwap = 0, colSwap = 0;
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j)
                if ((b[0][0] ^ b[i][0] ^ b[0][j] ^ b[i][j]) == 1) return -1;
        for (int i = 0; i < N; ++i) {
            rowSum += b[0][i];
            colSum += b[i][0];
            if (b[i][0] == i % 2) rowSwap++;
            if (b[0][i] == i % 2) colSwap++;
        }
        if (N / 2 > rowSum || rowSum > (N + 1) / 2) return -1;
        if (N / 2 > colSum || colSum > (N + 1) / 2) return -1;
        if (N % 2 == 1) {
            if (colSwap % 2 == 1) colSwap = N - colSwap;
            if (rowSwap % 2 == 1) rowSwap = N - rowSwap;
        } else {
            colSwap = Math.min(N - colSwap, colSwap);
            rowSwap = Math.min(N - rowSwap, rowSwap);
        }
        return (colSwap + rowSwap) / 2;
    }
}
