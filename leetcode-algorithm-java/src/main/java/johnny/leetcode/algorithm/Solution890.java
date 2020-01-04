package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Johnny
 */
public class Solution890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        for (String word : words) {
            if (word.length() == pattern.length()) {
                if (match(word, pattern)) {
                    ans.add(word);
                }
            }
        }

        return ans;
    }

    private boolean match(String word, String pattern) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (!map.containsKey(w)) {
                if (map.containsValue(p)) {
                    return false;
                }
                map.put(w, p);
            } else {
                if (map.get(w) != p) {
                    return false;
                }
            }
        }

        return true;
    }
}
