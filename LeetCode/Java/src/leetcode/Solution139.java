/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
    public boolean wordBreak(String s, Set<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0){
            return false;
        }
        
        boolean[] breakable = new boolean[s.length() + 1];
        breakable[0] = true;
        
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >=0; j--) {
                String word = s.substring(j, i);
                if (breakable[j] && wordDict.contains(word)) {
                    breakable[i] = true;
                }
            }
        }
        
        return breakable[s.length()];
    }
}
