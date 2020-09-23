package johnny.lintcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Most Frequent Word II
 * Give a string which represents the content of the novel and return the most frequently occurring words in the string(If there are multiple times, the one with the lowest lexicographic order is returned).
 *
 * 1 <= paragraph.length <= 50000.
 * The answer is unique, and written in lowercase (even if its occurrences in paragraph may have uppercase symbols, and even if it is a proper noun.)
 * paragraph only consists of letters, spaces, or the punctuation symbols !?',;.
 * Different words in paragraph are always separated by a space.
 * There are no hyphens or hyphenated words.
 * Words never apostrophes or other punctuation symbols.
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 *
 * Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 * Output: "hit"
 * Explanation:
 * "hit" appears most often, at 3 times.
 * Example 2:
 *
 * Input: paragraph = "a a a b b b c c d"
 * Output: "a"
 * Explanation:
 * "a" and "b" both appear 3 times, but "a" has the smallest lexicographic order.
 */
public class MostFrequentWordII {
    /**
     * @param paragraph: a string
     * @return: the most frequent word
     */
    public String mostCommonWord(String paragraph) {
        Map<String, Integer> map = new HashMap<>();
        int start = -1;
        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                if (start == -1) {
                    start = i;
                }
            } else {
                if (start > -1) {
                    String word = paragraph.substring(start, i).toLowerCase();
                    map.put(word, map.getOrDefault(word, 0) + 1);
                    start = -1;
                }
            }
        }

        if (start >= 0) {
            String word = paragraph.substring(start).toLowerCase();
            map.put(word, map.getOrDefault(map, 0) + 1);
        }

        String ans = "";
        int max = 0;
        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                ans = key;
                max = map.get(key);
            } else if (map.get(key) == max) {
                if (key.compareTo(ans) < 0) {
                    ans = key;
                }
            }
        }

        return ans;
    }
}
