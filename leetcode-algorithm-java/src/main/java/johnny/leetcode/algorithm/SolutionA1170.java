package johnny.leetcode.algorithm;

/**
 * 1170. Compare Strings by Frequency of the Smallest Character
 * <p>
 * Let's define a function f(s) over a non-empty string s, which calculates the frequency of the smallest character in s. For example, if s = "dcce" then f(s) = 2 because the smallest character is "c" and its frequency is 2.
 * <p>
 * Now, given string arrays queries and words, return an integer array answer, where each answer[i] is the number of words such that f(queries[i]) < f(W), where W is a word in words.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: queries = ["cbd"], words = ["zaaaz"]
 * Output: [1]
 * Explanation: On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd") < f("zaaaz").
 * Example 2:
 * <p>
 * Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
 * Output: [1,2]
 * Explanation: On the first query only f("bbb") < f("aaaa"). On the second query both f("aaa") and f("aaaa") are both > f("cc").
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= queries.length <= 2000
 * 1 <= words.length <= 2000
 * 1 <= queries[i].length, words[i].length <= 10
 * queries[i][j], words[i][j] are English lowercase letters.
 *
 * @author Johnny
 */
public class SolutionA1170 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] freq = new int[words.length];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = f(words[i]);
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int qf = f(queries[i]);
            int temp = 0;
            for (int j = 0; j < freq.length; j++) {
                if (qf < freq[j]) {
                    temp++;
                }
            }
            ans[i] = temp;
        }

        return ans;
    }

    private int f(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                return count[i];
            }
        }

        return 0;
    }
}
