package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Palindrome Partitioning.
 * Given a string s, partition s such that every substring of the partition 
 * is a palindrome.
 * 
 * Return all possible palindrome partitioning of s.
 * 
 * For example, given s = "aab",
 * Return
 * 
 *   [
 *     ["aa","b"],
 *     ["a","a","b"]
 *   ]
 * 
 * @author Johnny
 */
public class Solution131 {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        if (s == null || s.isEmpty()) {
            return res;
        }

        List<String> palindromes = new ArrayList<String>();
        dfs(s, 0, palindromes, res);

        return res;
    }
    
    private void dfs(String s, int pos, List<String> list, List<List<String>> res) {
        if (pos == s.length()) {
            res.add(new ArrayList<String>(list));
            return;
        }

        for (int i = pos + 1; i <= s.length(); i++) {
            String substr = s.substring(pos, i);
            if (!isPalindrome(substr)) {
                continue;
            }

            list.add(substr);
            dfs(s, i, list, res);
            list.remove(list.size() - 1);
        }
    }

    private boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
