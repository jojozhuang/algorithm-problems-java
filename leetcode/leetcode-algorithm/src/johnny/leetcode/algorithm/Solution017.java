package johnny.leetcode.algorithm;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * Letter Combinations of a Phone Number .
 * Given a digit string, return all possible letter combinations that the number
 * could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is 
 * given below.
 * 
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 * @author Johnny
 */
public class Solution017 {
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits == null || digits.isEmpty()) {
            return res;
        }
        combination(digits, 0, "", res);
        
        return res;
    }
    
    private void combination(String digits, int pos, String prefix, List<String> res) {
        if (pos >= digits.length()) {
            res.add(prefix);
            return;
        }
        String letters = KEYS[(digits.charAt(pos) - '0')];
        for (int i = 0; i < letters.length(); i++) {
            combination(digits, pos + 1, prefix + letters.charAt(i), res);
        }
    }
    
    public List<String> letterCombinations2(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits == null || digits.isEmpty()) {
            return res;
        }
        
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        
        helper(digits, 0, map, "", res);
        
        return res;
    }
    
    private void helper(String digits, int pos, Map<Integer, String> map, String str, List<String> res) {
        if (pos == digits.length()) {
            res.add(str);
            return;
        }
        
        int num = digits.charAt(pos) - '0';
        if (map.containsKey(num)) {
            String chars = map.get(num);
            for (int i = 0; i < chars.length(); i++) {
                helper(digits, pos + 1, map, str + chars.charAt(i), res);
            }
        }
    }
}
