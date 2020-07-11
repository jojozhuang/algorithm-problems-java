package johnny.leetcode.algorithm;

/**
 * Arranging Coins
 * <p>
 * You have a total of n coins that you want to form in a staircase shape,
 * where every k-th row must have exactly k coins.
 * <p>
 * Given n, find the total number of full staircase rows that can be formed.
 * <p>
 * n is a non-negative integer and fits within the range of a 32-bit signed
 * integer.
 * <p>
 * Example 1:
 * n = 5
 * <p>
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * <p>
 * Because the 3rd row is incomplete, we return 2.
 * <p>
 * Example 2:
 * <p>
 * n = 8
 * <p>
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 * <p>
 * Because the 4th row is incomplete, we return 3.
 *
 * @author Johnny
 */
public class Solution441 {
    public int arrangeCoins2(int n) {
        if (n == 0) {
            return 0;
        }

        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            double sum = (0.5 * mid * mid + 0.5 * mid);
            if (sum == n) {
                return mid;
            } else if (sum > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start - 1;
    }

    public int arrangeCoins(int n) {
        if (n <= 0) {
            return 0;
        }

        int start = 1;
        int end = n;
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            long sum = (long)mid*(mid+1)/2;
            if (sum == n) {
                return mid;
            } else if (sum < n) {
                start = mid;
            } else {
                end = mid;
            }
        }

        long sum = (long)end*(end+1)/2;
        if (sum <= n) {
            return end;
        } else {
            return start;
        }
    }
}
