package johnny.algorithm.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Word Break.
 * Given a string s and a dictionary of words dict, determine if s can be 
 * segmented into a space-separated sequence of one or more dictionary words.
 * 
 * For example, given
 * s = "leetcode",
 * dict = ["leet", "code"].
 * 
 * Return true because "leetcode" can be segmented as "leet code".
 * 
 * @author Johnny
 */
public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0){
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
        if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0){
            return false;
        }
        
        // optimize, check the longest word in dict
        int maxLen = 0;
        for (String str: wordDict) {
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
    
    // Brute Force 
    public boolean wordBreak2(String s, List<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0){
            return false;
        }
        return word_Break(s, new HashSet<String>(wordDict), 0);
    }
    public boolean word_Break(String s, Set<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && word_Break(s, wordDict, end)) {
                return true;
            }
        }
        return false;
    }
}
