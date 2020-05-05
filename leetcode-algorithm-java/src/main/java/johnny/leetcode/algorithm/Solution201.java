package johnny.leetcode.algorithm;

/**
 * Bitwise AND of Numbers Range.
 * <p>
 * Given a range [m, n] where 0 {@code <= m <= n <= 2147483647}, return the bitwise
 * AND of all numbers in this range, inclusive.
 * <p>
 * For example, given the range [5, 7], you should return 4.
 *
 * @author Johnny
 */
public class Solution201 {
    //http://www.cnblogs.com/grandyang/p/4431646.html
    public int rangeBitwiseAnd(int m, int n) {
        int mask = Integer.MAX_VALUE;
        while ((m & mask) != (n & mask)) {
            mask = mask << 1;
        }
        return m & mask;
    }
    public int rangeBitwiseAnd2(int m, int n) {
        int i = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            ++i;
        }
        return (m << i);
    }

    // brute force: O(32*(n-m))
    public int rangeBitwiseAnd4(int m, int n) {
        int[] bits = new int[32];
        for (int i = 0; i < 32; i++) {
            int bit = 1;
            for (int j = m; j >= 0 && j <= n; j++) {
                if (((j >> (31 - i)) & 1) == 0) {
                    bit = 0;
                    break;
                }
            }
            bits[i] = bit;
        }

        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans |= bits[i] << (31 - i);
        }

        return ans;
    }
}
