package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Palindrome Permutation.
 * <p>
 * Given a string, determine if a permutation of the string could form a palindrome.
 * <p>
 * For example,
 * "code" -> False, "aab" -> True, "carerac" -> True.
 * <p>
 * Hint:
 * <p>
 * Consider the palindromes of odd vs even length. What difference do you notice?
 * Count the frequency of each character.
 * If each character occurs even number of times, then it must be a palindrome.
 * How about character which occurs odd number of times?
 *
 * @author Johnny
 */
public class Solution266 {
    public boolean canPermutePalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int odd = 0;
        for (Integer i : map.values()) {
            if (i % 2 == 1) {
                odd++;
            }
            if (odd > 1) {
                return false;
            }
        }

        return true;
    }

    public boolean canPermutePalindrome2(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        char[] arr = new char[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        boolean odd = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (odd == true) {
                    return false;
                } else {
                    odd = true;
                }
            }
        }

        return true;
    }
}
