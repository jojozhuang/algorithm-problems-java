package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Word Break II
 * Given a string s and a dictionary of words dict, add spaces in s to construct a sentence where each word is a valid dictionary word.
 *
 * Return all such possible sentences.
 *
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 *
 * Input："lintcode"，["de","ding","co","code","lint"]
 * Output：["lint code", "lint co de"]
 * Explanation：
 * insert a space is "lint code"，insert two spaces is "lint co de".
 * Example 2:
 *
 * Input："a"，[]
 * Output：[]
 * Explanation：dict is null.
 *
 */
public class WordBreakII {
    /*
     * @param s: A string
     * @param wordDict: A set of words.
     * @return: All possible sentences.
     */
    // Memory Cache
    public List<String> wordBreak(String s, Set<String> dict) {
        List<String> list = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        helper(s, 0, dict, list, ans);
        return ans;
    }

    private void helper(String s, int index, Set<String> dict, List<String> list, List<String> ans){
        if (index == s.length()) {
            StringBuilder sb = new StringBuilder();
            for (String word: list) {
                sb.append(word).append(" ");
            }
            sb.setLength(sb.length() - 1);
            ans.add(sb.toString());
            return;
        }

        // recursion
        for (int i = index + 1; i <= s.length(); i++){
            String t = s.substring(index, i);
            if (dict.contains(t)) {
                list.add(t);
                dfs(s, i, dict, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }

    // Memory Limit Exceeded
    public List<String> wordBreak2(String s, Set<String> dict) {
        List<String> list = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        dfs(s, 0, dict, list, ans);
        return ans;
    }

    private void dfs(String s, int index, Set<String> dict, List<String> list, List<String> ans){
        if (index == s.length()) {
            StringBuilder sb = new StringBuilder();
            for (String word: list) {
                sb.append(word).append(" ");
            }
            sb.setLength(sb.length() - 1);
            ans.add(sb.toString());
            return;
        }

        // recursion
        for (int i = index + 1; i <= s.length(); i++){
            String t = s.substring(index, i);
            if (dict.contains(t)) {
                list.add(t);
                dfs(s, i, dict, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
}
