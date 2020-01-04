package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * 869. Reordered Power of 2
 * Starting with a positive integer N, we reorder the digits in any order (including the original order) such that the leading digit is not zero.
 * <p>
 * Return true if and only if we can do this in a way such that the resulting number is a power of 2.
 * <p>
 * Example 1:
 * Input: 1
 * Output: true
 * <p>
 * Example 2:
 * Input: 10
 * Output: false
 * <p>
 * Example 3:
 * Input: 16
 * Output: true
 * <p>
 * Example 4:
 * Input: 24
 * Output: false
 * <p>
 * Example 5:
 * Input: 46
 * Output: true
 * <p>
 * Note:
 * {@code 1 <= N <= 10^9}
 *
 * @author Johnny
 */
public class Solution869 {
    public boolean reorderedPowerOf2(int N) {
        int[] A = count(N);
        for (int i = 0; i < 31; ++i)
            if (Arrays.equals(A, count(1 << i)))
                return true;
        return false;
    }

    // Returns the count of digits of N
    // Eg. N = 112223334, returns [0,2,3,3,1,0,0,0,0,0]
    public int[] count(int N) {
        int[] ans = new int[10];
        while (N > 0) {
            ans[N % 10]++;
            N /= 10;
        }
        return ans;
    }
}
