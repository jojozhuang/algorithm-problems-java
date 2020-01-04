package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Reverse Vowels of a String.
 * <p>
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * <p>
 * Example 1:
 * Given s = "hello", return "holle".
 * <p>
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 *
 * @author Johnny
 */
public class Solution345 {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        char[] letters = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < letters.length) {
                char c1 = letters[left];
                if (c1 != 'a' && c1 != 'e' && c1 != 'i' && c1 != 'o' && c1 != 'u' &&
                        c1 != 'A' && c1 != 'E' && c1 != 'I' && c1 != 'O' && c1 != 'U') {
                    left++;
                } else {
                    break;
                }
            }
            while (right >= 0) {
                char c2 = letters[right];
                if (c2 != 'a' && c2 != 'e' && c2 != 'i' && c2 != 'o' && c2 != 'u' &&
                        c2 != 'A' && c2 != 'E' && c2 != 'I' && c2 != 'O' && c2 != 'U') {
                    right--;
                } else {
                    break;
                }
            }

            if (left < right) {
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right--;
            }
        }

        return new String(letters);
    }

    public String reverseVowels2(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        HashSet<Character> set = new HashSet<Character>(Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}));

        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            while (start < chars.length && !set.contains(chars[start])) {
                start++;
            }
            while (end > 0 && !set.contains(chars[end])) {
                end--;
            }

            if (start >= end) {
                break;
            }

            char c = chars[start];
            chars[start] = chars[end];
            chars[end] = c;
            start++;
            end--;
        }

        return new String(chars);
    }
}
