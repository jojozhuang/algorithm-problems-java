package johnny.lintcode.algorithm;

/**
 * Length of Last Word
 * <p>
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Example
 * Example 1:
 * <p>
 * Input: "Hello World"
 * Output: 5
 * Example 2:
 * <p>
 * Input: "Hello LintCode"
 * Output: 8
 *
 * @author Johnny
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int index = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (index != -1) {
                    return index - i;
                }
            } else {
                if (index == -1) {
                    index = i;
                }
            }
        }

        if (index != -1) {
            return index + 1;
        }

        return 0;
    }
}
