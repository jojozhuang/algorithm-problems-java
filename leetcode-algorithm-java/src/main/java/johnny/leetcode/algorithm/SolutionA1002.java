package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 1002. Find Common Characters
 * Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.
 * <p>
 * You may return the answer in any order.
 * <p>
 * Example 1:
 * Input: ["bella","label","roller"]
 * Output: ["e","l","l"]
 * <p>
 * Example 2:
 * Input: ["cool","lock","cook"]
 * Output: ["c","o"]
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] is a lowercase letter
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1002 {
    public List<String> commonChars(String[] A) {
        int[][] count = new int[A.length][26];
        for (int i = 0; i < A.length; i++) {
            for (char c : A[i].toCharArray()) {
                count[i][c - 'a']++;
            }
        }

        List<String> ans = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            boolean isbreak = false;
            int min = Integer.MAX_VALUE;
            for (int[] word : count) {
                if (word[c - 'a'] == 0) {
                    isbreak = true;
                    break;
                }
                min = Math.min(min, word[c - 'a']);
            }
            if (!isbreak) {
                for (int i = 0; i < min; i++) {
                    ans.add(String.valueOf(c));
                }
            }
        }

        return ans;
    }
}
