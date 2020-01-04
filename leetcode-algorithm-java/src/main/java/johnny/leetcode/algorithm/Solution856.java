package johnny.leetcode.algorithm;

/**
 * 856. Score of Parentheses
 * Given a balanced parentheses string S, compute the score of the string based on the following rule:
 * <p>
 * () has score 1
 * AB has score A + B, where A and B are balanced parentheses strings.
 * (A) has score 2 * A, where A is a balanced parentheses string.
 * <p>
 * Example 1:
 * Input: "()"
 * Output: 1
 * <p>
 * Example 2:
 * Input: "(())"
 * Output: 2
 * <p>
 * Example 3:
 * Input: "()()"
 * Output: 2
 * <p>
 * Example 4:
 * Input: "(()(()))"
 * Output: 6
 * <p>
 * Note:
 * S is a balanced parentheses string, containing only ( and ).
 * {@code 2 <= S.length <= 50}
 *
 * @author Johnny
 */
public class Solution856 {
    public int scoreOfParentheses(String S) {
        return F(S, 0, S.length());
    }

    public int F(String S, int i, int j) {
        //Score of balanced string S[i:j]
        int ans = 0, bal = 0;

        // Split string into primitives
        for (int k = i; k < j; ++k) {
            bal += S.charAt(k) == '(' ? 1 : -1;
            if (bal == 0) {
                if (k - i == 1) ans++;
                else ans += 2 * F(S, i + 1, k);
                i = k + 1;
            }
        }

        return ans;
    }
}
