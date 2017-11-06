/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Generalized Abbreviation.
 * 
 * Write a function to generate the generalized abbreviations of a word.
 * 
 * Example:
 * Given word = "word", return the following list (order does not matter):
 * ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
 * 
 * @author Johnny
 */
public class Solution320 {
    //https://segmentfault.com/a/1190000004187690
    public List<String> generateAbbreviations(String word) {
        List<String> res = new ArrayList<>();
        if (word == null || word.isEmpty()) {
            return res;
        }
        dfs(res, "", 0, word);
        return res;
    }
    
    private void dfs(List<String> res, String curr, int start, String s) {
        res.add(curr + s.substring(start));                   
        if (start == s.length()) 
            return;

        int i = 0;

        if (start > 0) {
            i = start + 1;
        }
        
        for (; i < s.length(); i++) {
            String prefix = curr + s.substring(start, i);               
            for (int j = 1; j <= s.length() - i; j++) {
                dfs(res,  prefix+ j, i + j, s);
            }
        }
    }
}
