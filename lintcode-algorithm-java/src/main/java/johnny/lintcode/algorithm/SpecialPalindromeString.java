package johnny.lintcode.algorithm;

import java.util.*;

/**
 * Special Palindrome String
 * You have a list of paired ambigram letter, like a<->t, b<->y, y<->h, h<->n, m<->w, w<->w …
 * Given a string, return true if it is a palindrome string which letters in it can be replaced by another corresponding letters. Attentionally, nested replacement is not be allowed, which means a<-->b, b<-->c, but a<-/->c.
 *
 * For example, the string "swims" is true because "w" can be replaced by "m" and the string changes to "smims" which is palindrome.
 * the string "hob" is also true because "h" can be replaced by "y" and "b" can be replaced to "y" too. Then the string is "yoy" which is palindrome.
 * However, the string "ban" is false because nested replacement is not be allowed. Even "b" can just change to "y" and "n" can just change to "h" , the new string "yah" isn't palindrome.
 *
 * Each digit of list ambigram is 2 letters, indicating that it can be converted from one to the other.
 * The length of list ambigram does not exceed 10,000
 * The length of the string word does not exceed 1,000
 * All data are guaranteed to be lowercase.
 *
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 * Input: ambigram=["at", "by", "yh", "hn", "mw", "ww"], word="swims"
 * Output: true
 * Explanation: "w" can be replaced by "m" and the string changes to "smims" which is palindrome, so it is true.
 *
 * Example 2:
 * Input: ambigram=["at", "by", "yh", "hn", "mw", "ww"], word="hob"
 * Output: true
 * Explanation: "h" can be replaced by "y" and "b" can be replaced to "y" too. Then the string is "yoy" which is palindrome, so it is true.
 *
 * Example 3:
 * Input: ambigram=["at", "by", "yh", "hn", "mw", "ww"], word="ban"
 * Output: false
 * Explanation: Nested replacement is not be allowed. Even "b" can just change to "y" and "n" can just change to "h" , the new string "yah" isn't palindrome.
 */
public class SpecialPalindromeString {
    /**
     * @param ambigram: A list of paired ambigram letter.
     * @param word: A string need to be judged.
     * @return: If it is special palindrome string, return true.
     */
    public boolean ispalindrome(List<String> ambigram, String word) {
        Map<Character, Set<Character>> map = new HashMap<>();
        for (String amb : ambigram) {
            char c1 = amb.charAt(0);
            char c2 = amb.charAt(1);
            if (!map.containsKey(c1)) {
                map.put(c1, new HashSet<>());
            }
            map.get(c1).add(c2);
            if (!map.containsKey(c2)) {
                map.put(c2, new HashSet<>());
            }
            map.get(c2).add(c1);
        }

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            char c1 = word.charAt(left);
            char c2 = word.charAt(right);
            if (c1 != c2) {
                Set<Character> set1 = map.get(c1);
                Set<Character> set2 = map.get(c2);
                if (set1 == null || set2 == null) {
                    return false;
                }

                if (set1.contains(c2) || set2.contains(c1)) {
                    left++;
                    right--;
                    continue;
                }

                boolean same = false;
                for (int i = 0; i < 26; i++) {
                    if (set1.contains((char)('a' + i)) && set2.contains((char)('a' + i))) {
                        same = true;
                        break;
                    }
                }
                if (same == false) {
                    return false;
                }
            }

            left++;
            right--;
        }

        return true;
    }
}
