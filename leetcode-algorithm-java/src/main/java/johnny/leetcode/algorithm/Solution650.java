package johnny.leetcode.algorithm;

/**
 * 2 Keys Keyboard
 * <p>
 * Initially on a notepad only one character 'A' is present. You can perform
 * two operations on this notepad for each step:
 * <p>
 * Copy All: You can copy all the characters present on the notepad
 * (partial copy is not allowed).
 * <p>
 * Paste: You can paste the characters which are copied last time.
 * Given a number n. You have to get exactly n 'A' on the notepad by performing
 * the minimum number of steps permitted. Output the minimum number of steps to get n 'A'.
 * <p>
 * Example 1:
 * Input: 3
 * Output: 3
 * Explanation:
 * <p>
 * Initially, we have one character 'A'.
 * In step 1, we use Copy All operation.
 * In step 2, we use Paste operation to get 'AA'.
 * In step 3, we use Paste operation to get 'AAA'.
 * <p>
 * Note:
 * The n will be in the range [1, 1000].
 *
 * @author Johnny
 */
public class Solution650 {
    public int minSteps(int n) {
        if (n < 2) {
            return 0;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 3;
        }

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return minSteps(n / i) + i;
            }
        }

        return n;
    }
}
