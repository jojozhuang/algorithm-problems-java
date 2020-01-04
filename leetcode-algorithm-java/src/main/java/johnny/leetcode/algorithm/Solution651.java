package johnny.leetcode.algorithm;

/**
 * 651. 4 Keys Keyboard
 * Imagine you have a special keyboard with the following keys:
 * <p>
 * Key 1: (A): Print one 'A' on screen.
 * <p>
 * Key 2: (Ctrl-A): Select the whole screen.
 * <p>
 * Key 3: (Ctrl-C): Copy selection to buffer.
 * <p>
 * Key 4: (Ctrl-V): Print buffer on screen appending it after what has already been printed.
 * <p>
 * Now, you can only press the keyboard for N times (with the above four keys), find out the maximum numbers of 'A' you can print on screen.
 * <p>
 * Example 1:
 * Input: N = 3
 * Output: 3
 * Explanation:
 * We can at most get 3 A's on screen by pressing following key sequence:
 * A, A, A
 * Example 2:
 * Input: N = 7
 * Output: 9
 * Explanation:
 * We can at most get 9 A's on screen by pressing following key sequence:
 * A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V
 * Note:
 * {@code 1 <= N <= 50}
 * Answers will be in the range of 32-bit signed integer.
 *
 * @author Johnny
 */
public class Solution651 {
    public int maxA(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j <= i - 3; j++)
                dp[i] = Math.max(dp[i], dp[j] * (i - j - 1));
        }
        return dp[n];
    }
}
