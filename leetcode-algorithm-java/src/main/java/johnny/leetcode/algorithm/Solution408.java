package johnny.leetcode.algorithm;

/**
 * 408. Valid Word Abbreviation
 * Given a non-empty string s and an abbreviation abbr, return whether the string matches with the given abbreviation.
 * <p>
 * A string such as "word" contains only the following valid abbreviations:
 * <p>
 * ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
 * Notice that only the above abbreviations are valid abbreviations of the string "word". Any other string is not a valid abbreviation of "word".
 * <p>
 * Note:
 * Assume s contains only lowercase letters and abbr contains only lowercase letters and digits.
 * <p>
 * Example 1:
 * Given s = "internationalization", abbr = "i12iz4n":
 * <p>
 * Return true.
 * Example 2:
 * Given s = "apple", abbr = "a2e":
 * <p>
 * Return false.
 *
 * @author Johnny
 */
public class Solution408 {
    public boolean validWordAbbreviation(String word, String abbr) {
        int m = word.length();
        int n = abbr.length();
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
                continue;
            }

            char c = abbr.charAt(j);
            if (c <= '0' || c > '9') {
                return false;
            }
            int sum = 0;
            while (j < n && Character.isDigit(abbr.charAt(j))) {
                sum = sum * 10 + (abbr.charAt(j) - '0');
                j++;
            }
            i += sum;
        }

        return i == m && j == n;
    }

}
