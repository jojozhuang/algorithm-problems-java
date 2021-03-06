package johnny.leetcode.algorithm;

/**
 * 1165. Single-Row Keyboard
 * There is a special keyboard with all keys in a single row.
 * <p>
 * Given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25), initially your finger is at index 0. To type a character, you have to move your finger to the index of the desired character. The time taken to move your finger from index i to index j is |i - j|.
 * <p>
 * You want to type a string word. Write a function to calculate how much time it takes to type it with one finger.
 * <p>
 * Example 1:
 * Input: keyboard = "abcdefghijklmnopqrstuvwxyz", word = "cba"
 * Output: 4
 * Explanation: The index moves from 0 to 2 to write 'c' then to 1 to write 'b' then to 0 again to write 'a'.
 * Total time = 2 + 1 + 1 = 4.
 * <p>
 * Example 2:
 * Input: keyboard = "pqrstuvwxyzabcdefghijklmno", word = "leetcode"
 * Output: 73
 * <p>
 * Constraints:
 * <pre>{@code
 * keyboard.length == 26
 * keyboard contains each English lowercase letter exactly once in some order.
 * 1 <= word.length <= 10^4
 * word[i] is an English lowercase letter.
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1165 {
    public int calculateTime(String keyboard, String word) {
        int[] index = new int[26];
        for (int i = 0; i < keyboard.length(); i++) {
            index[keyboard.charAt(i) - 'a'] = i;
        }

        int ans = 0;
        int pos = 0;
        for (int i = 0; i < word.length(); i++) {
            ans += Math.abs(index[word.charAt(i) - 'a'] - pos);
            pos = index[word.charAt(i) - 'a'];
        }

        return ans;
    }
}
