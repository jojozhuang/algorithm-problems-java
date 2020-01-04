package johnny.leetcode.algorithm;

/**
 * 709. To Lower Case
 * <p>
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 * <p>
 * Example 1:
 * <p>
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 * <p>
 * Input: "here"
 * Output: "here"
 * Example 3:
 * <p>
 * Input: "LOVELY"
 * Output: "lovely"
 *
 * @author Johnny
 */
public class Solution709 {
    public String toLowerCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] lower = new char[str.length()];
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                lower[i] = (char) (c - 'A' + 'a');
            } else {
                lower[i] = c;
            }
            i++;
        }

        return new String(lower);
    }

    public String toLowerCase2(String str) {
        char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        char[] input = str.toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 'A' && input[i] <= 'Z') {
                input[i] = lower[input[i] - 'A'];
            }
        }

        return new String(input);
    }
}