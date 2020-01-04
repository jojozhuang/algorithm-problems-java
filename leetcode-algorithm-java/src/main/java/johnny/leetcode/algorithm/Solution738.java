package johnny.leetcode.algorithm;

/**
 * 738. Monotone Increasing Digits
 * Given a non-negative integer N, find the largest number that is less than or equal to N with monotone increasing digits.
 * <p>
 * (Recall that an integer has monotone increasing digits if and only if each pair of adjacent digits x and y satisfy x <= y.)
 * <p>
 * Example 1:
 * Input: N = 10
 * Output: 9
 * Example 2:
 * Input: N = 1234
 * Output: 1234
 * Example 3:
 * Input: N = 332
 * Output: 299
 * Note: N is an integer in the range [0, 10^9].
 *
 * @author Johnny
 */
public class Solution738 {
    public int monotoneIncreasingDigits(int N) {
        if (N <= 9)
            return N;
        char[] x = String.valueOf(N).toCharArray();

        int mark = x.length;
        for (int i = x.length - 1; i > 0; i--) {
            if (x[i] < x[i - 1]) {
                mark = i - 1;
                x[i - 1]--;
            }
        }
        for (int i = mark + 1; i < x.length; i++) {
            x[i] = '9';
        }
        return Integer.parseInt(new String(x));
    }
}
