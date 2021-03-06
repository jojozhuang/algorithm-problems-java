package johnny.leetcode.algorithm;

/**
 * 765. Couples Holding Hands
 * N couples sit in 2N seats arranged in a row and want to hold hands. We want to know the minimum number of swaps so that every couple is sitting side by side. A swap consists of choosing any two people, then they stand up and switch seats.
 * <p>
 * The people and seats are represented by an integer from 0 to 2N-1, the couples are numbered in order, the first couple being (0, 1), the second couple being (2, 3), and so on with the last couple being (2N-2, 2N-1).
 * <p>
 * The couples' initial seating is given by row[i] being the value of the person who is initially sitting in the i-th seat.
 * <p>
 * Example 1:
 * <p>
 * Input: row = [0, 2, 1, 3]
 * Output: 1
 * Explanation: We only need to swap the second (row[1]) and third (row[2]) person.
 * Example 2:
 * <p>
 * Input: row = [3, 2, 0, 1]
 * Output: 0
 * Explanation: All couples are already seated side by side.
 * Note:
 * <p>
 * len(row) is even and in the range of [4, 60].
 * row is guaranteed to be a permutation of 0...len(row)-1.
 *
 * @author Johnny
 */
public class Solution765 {
    public int minSwapsCouples(int[] row) {
        int res = 0, N = row.length;

        int[] ptn = new int[N];
        int[] pos = new int[N];

        for (int i = 0; i < N; i++) {
            ptn[i] = (i % 2 == 0 ? i + 1 : i - 1);
            pos[row[i]] = i;
        }

        for (int i = 0; i < N; i++) {
            for (int j = ptn[pos[ptn[row[i]]]]; i != j; j = ptn[pos[ptn[row[i]]]]) {
                swap(row, i, j);
                swap(pos, row[i], row[j]);
                res++;
            }
        }

        return res;
    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
