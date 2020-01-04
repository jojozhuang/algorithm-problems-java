package johnny.leetcode.algorithm;

/**
 * Decode Ways II.
 * <p>
 * A message containing letters from A-Z is being encoded to numbers using the
 * following mapping way:
 * <p>
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * <p>
 * Beyond that, now the encoded string can also contain the character '*',
 * which can be treated as one of the numbers from 1 to 9.
 * <p>
 * Given the encoded message containing digits and the character '*', return
 * the total number of ways to decode it.
 * <p>
 * Also, since the answer may be very large, you should return the output mod 109 + 7.
 * <p>
 * Example 1:
 * Input: "*"
 * Output: 9
 * Explanation: The encoded message can be decoded to the string: "A", "B", "C", "D", "E", "F", "G", "H", "I".
 * <p>
 * Example 2:
 * Input: "1*"
 * Output: 9 + 9 = 18
 * <p>
 * Note:
 * The length of the input string will fit in range [1, 105].
 * The input string will only contain the character '*' and digits '0' - '9'.
 *
 * @author Johnny
 */
public class Solution639 {
    public int numDecodings(String s) {
        /* initial conditions */
        long[] dp = new long[s.length() + 1];
        dp[0] = 1;
        if (s.charAt(0) == '0') {
            return 0;
        }
        dp[1] = (s.charAt(0) == '*') ? 9 : 1;

        /* bottom up method */
        for (int i = 2; i <= s.length(); i++) {
            char first = s.charAt(i - 2);
            char second = s.charAt(i - 1);

            // For dp[i-1]
            if (second == '*') {
                dp[i] += 9 * dp[i - 1];
            } else if (second > '0') {
                dp[i] += dp[i - 1];
            }

            // For dp[i-2]
            if (first == '*') {
                if (second == '*') {
                    dp[i] += 15 * dp[i - 2];
                } else if (second <= '6') {
                    dp[i] += 2 * dp[i - 2];
                } else {
                    dp[i] += dp[i - 2];
                }
            } else if (first == '1' || first == '2') {
                if (second == '*') {
                    if (first == '1') {
                        dp[i] += 9 * dp[i - 2];
                    } else { // first == '2'
                        dp[i] += 6 * dp[i - 2];
                    }
                } else if (((first - '0') * 10 + (second - '0')) <= 26) {
                    dp[i] += dp[i - 2];
                }
            }

            dp[i] %= 1000000007;
        }
        /* Return */
        return (int) dp[s.length()];
    }
}
