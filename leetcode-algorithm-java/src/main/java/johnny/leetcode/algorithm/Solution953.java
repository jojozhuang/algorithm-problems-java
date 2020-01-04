package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 953. Verifying an Alien Dictionary
 * In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
 * <p>
 * Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.
 * <p>
 * Example 1:
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
 * <p>
 * Example 2:
 * Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
 * Output: false
 * Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
 * <p>
 * Example 3:
 * Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 * Output: false
 * Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 20
 * order.length == 26
 * All characters in words[i] and order are english lowercase letters.
 * }</pre>
 *
 * @author Johnny
 */
public class Solution953 {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        for (Character c : order.toCharArray()) {
            map.put(c, i++);
        }
        for (i = 0; i < words.length - 1; i++) {
            int res = compare(words[i], words[i + 1], map);
            if (res <= 0) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    private int compare(String s1, String s2, Map<Character, Integer> map) {
        int i = 0;
        int j = 0;
        while (i < s1.length() || j < s2.length()) {
            if (i >= s1.length()) {
                return -1;
            }
            if (j >= s2.length()) {
                return 1;
            }
            int index1 = map.get(s1.charAt(i));
            int index2 = map.get(s2.charAt(j));
            if (index1 == index2) {
                i++;
                j++;
                continue;
            } else if (index1 < index2) {
                return -1;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public boolean isAlienSorted2(String[] words, String order) {
        if (words.length < 2) {
            return true;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        for (int i = 1; i < words.length; i++) {
            int len = Math.min(words[i].length(), words[i - 1].length());
            int j = 0;
            for (j = 0; j < len; j++) {
                Character c1 = words[i - 1].charAt(j);
                Character c2 = words[i].charAt(j);
                if (map.get(c1) == map.get(c2)) {
                    continue;
                } else if (map.get(c1) < map.get(c2)) {
                    break;
                } else {
                    return false;
                }
            }

            if (j == len && words[i - 1].length() > words[i].length()) {
                return false;
            }
        }

        return true;
    }
}
