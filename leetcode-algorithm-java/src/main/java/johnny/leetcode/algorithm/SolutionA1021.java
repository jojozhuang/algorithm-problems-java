package johnny.leetcode.algorithm;

/**
 * 1021. Remove Outermost Parentheses
 * A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 * <p>
 * A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
 * <p>
 * Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
 * <p>
 * Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
 * <p>
 * Example 1:
 * Input: "(()())(())"
 * Output: "()()()"
 * Explanation:
 * The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
 * After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 * <p>
 * Example 2:
 * Input: "(()())(())(()(()))"
 * Output: "()()()()(())"
 * Explanation:
 * The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
 * After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
 * <p>
 * Example 3:
 * Input: "()()"
 * Output: ""
 * Explanation:
 * The input string is "()()", with primitive decomposition "()" + "()".
 * After removing outer parentheses of each part, this is "" + "" = "".
 * <p>
 * Note:
 * <pre>{@code
 * S.length <= 10000
 * S[i] is "(" or ")"
 * S is a valid parentheses string
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1021 {
    public String removeOuterParentheses(String S) {
        if (S == null || S.length() == 0) {
            return "";
        }

        int n = S.length();
        int left = 0;
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            char c = S.charAt(i);
            if (c == '(') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                sb.append(S.substring(left + 1, i));
                left = i + 1;
            }
        }

        return sb.toString();
    }
}
