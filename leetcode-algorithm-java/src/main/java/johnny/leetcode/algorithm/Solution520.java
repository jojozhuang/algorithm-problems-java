package johnny.leetcode.algorithm;

/**
 * Detect Capital
 * <p>
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * <p>
 * We define the usage of capitals in a word to be right when one of the
 * following cases holds:
 * 1. All letters in this word are capitals, like "USA".
 * 2. All letters in this word are not capitals, like "leetcode".
 * 3. Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * <p>
 * Example 1:
 * Input: "USA"
 * Output: True
 * <p>
 * Example 2:
 * Input: "FlaG"
 * Output: False
 * <p>
 * Note: The input will be a non-empty word consisting of uppercase and lowercase Latin letters.
 *
 * @author Johnny
 */
public class Solution520 {
    public boolean detectCapitalUse(String word) {
        char[] letters = word.toCharArray();
        boolean upper = (letters[0] >= 'A' && letters[0] <= 'Z');
        boolean hasUpper = false;
        boolean hasLower = false;
        for (int i = 1; i < letters.length; i++) {
            char c = letters[i];
            if (c >= 'a' && c <= 'z') {
                hasLower = true;
            }
            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            }
        }

        if (upper) {
            if (hasLower && hasUpper) {
                return false;
            }
        } else {
            if (hasUpper) {
                return false;
            }
        }

        return true;
    }

    public boolean detectCapitalUse2(String word) {
        if (word == null || word.isEmpty()) {
            return true;
        }

        boolean first = false;
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                if (i == 0) {
                    first = true;
                } else {
                    if (first == false) {
                        return false;
                    }
                }
                count++;
            }
        }

        return count == 0 || (first && count == 1) || count == word.length();
    }
}
