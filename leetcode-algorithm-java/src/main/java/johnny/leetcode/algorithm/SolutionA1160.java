package johnny.leetcode.algorithm;

/**
 * 1160. Find Words That Can Be Formed by Characters
 * You are given an array of strings words and a string chars.
 * <p>
 * A string is good if it can be formed by characters from chars (each character can only be used once).
 * <p>
 * Return the sum of lengths of all good strings in words.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * Output: 6
 * Explanation:
 * The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
 * Example 2:
 * <p>
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * Output: 10
 * Explanation:
 * The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 *
 * @author Johnny
 */
public class SolutionA1160 {
    public int countCharacters(String[] words, String chars) {
        int[] target = new int[26];
        for (Character c : chars.toCharArray()) {
            target[c - 'a']++;
        }

        int ans = 0;
        for (String word : words) {
            int[] count = new int[26];
            for (Character c : word.toCharArray()) {
                count[c - 'a']++;
            }
            boolean matched = true;
            for (int i = 0; i < 26; i++) {
                if (count[i] > target[i]) {
                    matched = false;
                    break;
                }
            }

            if (matched) {
                ans += word.length();
            }
        }

        return ans;
    }
}
