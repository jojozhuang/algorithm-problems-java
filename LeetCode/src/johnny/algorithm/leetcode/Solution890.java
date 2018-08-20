package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Johnny
 */
public class Solution890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String>  res = new ArrayList<String>();
        if (words == null || words.length == 0 || pattern == null || pattern.length() == 0) {
            return res;
        }
        
        for (String word: words) {
            if (word.length() == pattern.length()) {
                if (match(word, pattern)) {
                    res.add(word);
                }
            }
        }
        
        return res;
    }
    
    private boolean match(String word, String pattern) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        char[] arr1 = word.toCharArray();
        char[] arr2 = pattern.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if (map.isEmpty() || !map.containsKey(arr1[i])) {
                if (map.containsValue(arr2[i])) {
                    return false;
                }
                map.put(arr1[i], arr2[i]);
            } else {
                if (map.get(arr1[i]) != arr2[i]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
