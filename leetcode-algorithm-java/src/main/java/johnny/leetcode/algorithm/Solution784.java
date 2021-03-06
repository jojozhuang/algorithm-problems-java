package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 784. Letter Case Permutation
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.
 * <p>
 * Examples:
 * Input: S = "a1b2"
 * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
 * <p>
 * Input: S = "3z4"
 * Output: ["3z4", "3Z4"]
 * <p>
 * Input: S = "12345"
 * Output: ["12345"]
 * Note:
 * <p>
 * S will be a string with length at most 12.
 * S will consist only of letters or digits.
 *
 * @author Johnny
 */
public class Solution784 {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        ans.add("");

        for (int i = 0; i < S.length(); i++) {
            ans = helper(S, i, ans);
        }

        return ans;
    }

    private List<String> helper(String S, int pos, List<String> list) {
        if (pos >= S.length()) {
            return list;
        }
        List<String> ans = new ArrayList<>();
        char c = S.charAt(pos);
        for (String s : list) {
            if (Character.isDigit(c)) {
                ans.add(s + String.valueOf(c));
            } else {
                ans.add(s + String.valueOf(Character.toLowerCase(c)));
                ans.add(s + String.valueOf(Character.toUpperCase(c)));
            }
        }

        return ans;
    }

    public List<String> letterCasePermutation2(String S) {
        if (S == null) {
            return new LinkedList<>();
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(S);

        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) continue;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] chs = cur.toCharArray();

                chs[i] = Character.toUpperCase(chs[i]);
                queue.offer(String.valueOf(chs));

                chs[i] = Character.toLowerCase(chs[i]);
                queue.offer(String.valueOf(chs));
            }
        }

        return new LinkedList<>(queue);
    }
}
