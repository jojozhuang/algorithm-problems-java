package johnny.leetcode.algorithm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Word Break.
 * Given a string s and a dictionary of words dict, determine if s can be
 * segmented into a space-separated sequence of one or more dictionary words.
 * <p>
 * For example, given
 * s = "leetcode",
 * dict = ["leet", "code"].
 * <p>
 * Return true because "leetcode" can be segmented as "leet code".
 *
 * @author Johnny
 */
public class Solution139 {
    // optimized
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0) {
            return false;
        }

        // optimize, check the longest word in dict
        int maxLen = 0;
        for (String str : wordDict) {
            maxLen = Math.max(maxLen, str.length());
        }

        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) { // reverse sequence
                if (i - j > maxLen) { // no need to continue if exceed the max word length
                    break;
                }
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public boolean wordBreak4(String s, List<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0) {
            return false;
        }

        Set<String> wordDictSet = new HashSet<String>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public boolean wordBreak3(String s, List<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0) {
            return false;
        }

        // optimize, check the longest word in dict
        int maxLen = 0;
        for (String str : wordDict) {
            maxLen = Math.max(maxLen, str.length());
        }

        boolean[] breakable = new boolean[s.length() + 1];
        breakable[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (i - j > maxLen) { // no need to continue if exceed the max word length
                    break;
                }
                String word = s.substring(j, i);
                if (breakable[j] && wordDict.contains(word)) {
                    breakable[i] = true;
                }
            }
        }

        return breakable[s.length()];
    }

    // Recursive
    public boolean wordBreak2(String s, List<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0) {
            return false;
        }
        return helper(s, 0, new HashSet<>(wordDict));
    }

    public boolean helper(String s, int start, Set<String> wordDict) {
        if (start == s.length()) {
            return true;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && helper(s, end, wordDict)) {
                return true;
            }
        }
        return false;
    }
}
