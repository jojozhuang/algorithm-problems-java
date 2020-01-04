package johnny.leetcode.algorithm;

/**
 * 443. String Compression
 * Given an array of characters, compress it in-place.
 * <p>
 * The length after compression must always be smaller than or equal to the original array.
 * <p>
 * Every element of the array should be a character (not int) of length 1.
 * <p>
 * After you are done modifying the input array in-place, return the new length of the array.
 * <p>
 * Follow up:
 * Could you solve it using only O(1) extra space?
 * <p>
 * Example 1:
 * Input:
 * ["a","a","b","b","c","c","c"]
 * <p>
 * Output:
 * Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 * <p>
 * Explanation:
 * "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
 * Example 2:
 * Input:
 * ["a"]
 * <p>
 * Output:
 * Return 1, and the first 1 characters of the input array should be: ["a"]
 * <p>
 * Explanation:
 * Nothing is replaced.
 * Example 3:
 * Input:
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * <p>
 * Output:
 * Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
 * <p>
 * Explanation:
 * Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
 * Notice each digit has it's own entry in the array.
 * Note:
 * All characters have an ASCII value in [35, 126].
 * 1 <= len(chars) <= 1000.
 *
 * @author Johnny
 */
public class Solution443 {
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) {
            return 0;
        }
        int slow = 0;
        int fast = 0;
        while (fast < chars.length) {
            char c = chars[fast];
            int count = 0;
            while (fast < chars.length && chars[fast] == c) {
                fast++;
                count++;
            }
            chars[slow++] = c;
            if (count != 1) {
                for (char numc : Integer.toString(count).toCharArray()) {
                    chars[slow++] = numc;
                }
            }
        }
        return slow;
    }
}
