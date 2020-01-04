package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Word Pattern.
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * <p>
 * Examples:
 * 1. pattern = "abba", str = "dog cat cat dog" should return true.
 * 2. pattern = "abba", str = "dog cat cat fish" should return false.
 * 3. pattern = "aaaa", str = "dog cat cat dog" should return false.
 * 4. pattern = "abba", str = "dog dog dog dog" should return false.
 * <p>
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 *
 * @author Johnny
 */
public class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || pattern.isEmpty() || str == null || str.isEmpty()) {
            return false;
        }

        String[] arr = str.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<Character, String>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(arr[i])) {
                    return false;
                } else {
                    map.put(pattern.charAt(i), arr[i]);
                }
            } else {
                if (!map.get(pattern.charAt(i)).equals(arr[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
