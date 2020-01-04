package johnny.leetcode.algorithm;

/**
 * Hamming Distance
 * <p>
 * The Hamming distance between two integers is the number of positions at which
 * the corresponding bits are different.
 * <p>
 * Given two integers x and y, calculate the Hamming distance.
 * <p>
 * Note:
 * {@code 0 ≤ x, y < 2^31}.
 * <p>
 * Example:
 * <p>
 * Input: x = 1, y = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ^   ^
 * <p>
 * The above arrows point to positions where the corresponding bits are different.
 *
 * @author Johnny
 */
public class Solution461 {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int ans = 0;
        while (xor > 0) {
            ans += (xor & 1);
            xor = xor >>> 1;
        }

        return ans;
    }

    public int hammingDistance2(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
