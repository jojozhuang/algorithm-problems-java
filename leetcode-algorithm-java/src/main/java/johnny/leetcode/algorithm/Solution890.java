package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Johnny
 */
public class Solution890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (helper(word, pattern)) {
                list.add(word);
            }
        }

        return list;
    }

    private boolean helper (String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (!map1.containsKey(c1)) {
                map1.put(c1, c2);
            } else {
                if (map1.get(c1) != c2) {
                    return false;
                }
            }
            if (!map2.containsKey(c2)) {
                map2.put(c2, c1);
            } else {
                if (map2.get(c2) != c1) {
                    return false;
                }
            }
        }

        return true;
    }

    public List<String> findAndReplacePattern2(String[] words, String pattern) {
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
        Map<Character, Character> map = new HashMap<>();
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
