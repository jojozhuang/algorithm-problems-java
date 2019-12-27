package johnny.lintcode.algorithm;

/**
 * Reverse Integer
 * 
 * Reverse digits of an integer. Returns 0 when the reversed integer overflows (signed 32-bit integer).
 *
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * 
 * @author Johnny
 */
public class ReverseInteger {
    public int reverseInteger(int n) {
        long ans = 0;
        boolean negative = n < 0;
        int num = Math.abs(n);
        while (num > 0) {
            ans = ans * 10 + num % 10;
            num = num / 10;
        }

        if (negative) {
            ans = ans * -1;
        }

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)ans;
    }
}
