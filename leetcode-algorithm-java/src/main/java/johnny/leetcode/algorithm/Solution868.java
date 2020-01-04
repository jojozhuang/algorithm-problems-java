package johnny.leetcode.algorithm;

/**
 * 868. Binary Gap
 * Given a positive integer N, find and return the longest distance between two consecutive 1's in the binary representation of N.
 * <p>
 * If there aren't two consecutive 1's, return 0.
 * <p>
 * Example 1:
 * Input: 22
 * Output: 2
 * Explanation:
 * 22 in binary is 0b10110.
 * In the binary representation of 22, there are three ones, and two consecutive pairs of 1's.
 * The first consecutive pair of 1's have distance 2.
 * The second consecutive pair of 1's have distance 1.
 * The answer is the largest of these two distances, which is 2.
 * <p>
 * Example 2:
 * Input: 5
 * Output: 2
 * Explanation:
 * 5 in binary is 0b101.
 * <p>
 * Example 3:
 * Input: 6
 * Output: 1
 * Explanation:
 * 6 in binary is 0b110.
 * <p>
 * Example 4:
 * Input: 8
 * Output: 0
 * Explanation:
 * 8 in binary is 0b1000.
 * There aren't any consecutive pairs of 1's in the binary representation of 8, so we return 0.
 * <p>
 * Note:
 * {@code 1 <= N <= 10^9}
 *
 * @author Johnny
 */
public class Solution868 {
    public int binaryGap(int N) {
        String bit = Integer.toBinaryString(N);

        int distance = 0;
        int one = 0;
        for (int i = 1; i < bit.length(); i++) {
            char ch = bit.charAt(i);
            if (ch == '1') {
                distance = Math.max(distance, i - one);
                one = i;
            }
        }

        return distance;
    }
}
