package johnny.leetcode.algorithm;

/**
 * 1147. Longest Chunked Palindrome Decomposition
 * Return the largest possible k such that there exists a_1, a_2, ..., a_k such that:
 * <p>
 * Each a_i is a non-empty string;
 * Their concatenation a_1 + a_2 + ... + a_k is equal to text;
 * For all {@code 1 <= i <= k,  a_i = a_{k+1 - i}}.
 * <p>
 * Example 1:
 * Input: text = "ghiabcdefhelloadamhelloabcdefghi"
 * Output: 7
 * Explanation: We can split the string on "(ghi)(abcdef)(hello)(adam)(hello)(abcdef)(ghi)".
 * <p>
 * Example 2:
 * Input: text = "merchant"
 * Output: 1
 * Explanation: We can split the string on "(merchant)".
 * <p>
 * Example 3:
 * Input: text = "antaprezatepzapreanta"
 * Output: 11
 * Explanation: We can split the string on "(a)(nt)(a)(pre)(za)(tpe)(za)(pre)(a)(nt)(a)".
 * <p>
 * Example 4:
 * Input: text = "aaa"
 * Output: 3
 * Explanation: We can split the string on "(a)(a)(a)".
 * <p>
 * Constraints:
 * <pre>{@code
 * text consists only of lowercase English characters.
 * 1 <= text.length <= 1000
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1147 {
    public int longestDecomposition(String text) {
        return 0;
    }
}
