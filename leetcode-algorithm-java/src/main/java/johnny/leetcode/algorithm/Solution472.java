package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Concatenated Words
 * <p>
 * Given a list of words (without duplicates), please write a program that
 * returns all concatenated words in the given list of words.
 * <p>
 * A concatenated word is defined as a string that is comprised entirely of at
 * least two shorter words in the given array.
 * <p>
 * Example:
 * Input: ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses",
 * "rat","ratcatdogcat"]
 * <p>
 * Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
 * <p>
 * Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats";
 * "dogcatsdog" can be concatenated by "dog", "cats" and "dog";
 * "ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
 * <p>
 * Note:
 * The number of elements of the given array will not exceed 10,000
 * The length sum of elements in the given array will not exceed 600,000.
 * All the input string will only include lower case letters.
 * The returned elements order does not matter.
 *
 * @author Johnny
 */
public class Solution472 {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> list = new ArrayList<>();
        if (words == null || words.length == 0) {
            return list;
        }

        Set<String> set = new HashSet<>();
        int max = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                set.add(word);
                max = Math.max(max, word.length());
            }
        }

        for (String word : words) {
            if (helper(word, max, set)) {
                list.add(word);
            }
        }

        return list;
    }

    private boolean helper(String str, int max, Set<String> set) {
        if (str.isEmpty()) {
            return false;
        }
        int n = str.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (i - j > max) {
                    break;
                } else {
                    String sub = str.substring(j, i);
                    if (dp[j] && !str.equals(sub) && set.contains(sub)) {
                        dp[i] = true;
                    }
                }
            }
        }

        return dp[n];
    }

    public List<String> findAllConcatenatedWordsInADict2(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> preWords = new HashSet<>();
        Arrays.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        for (int i = 0; i < words.length; i++) {
            if (canForm(words[i], preWords)) {
                result.add(words[i]);
            }
            preWords.add(words[i]);
        }

        return result;
    }

    private boolean canForm(String word, Set<String> dict) {
        if (dict.isEmpty()) return false;
        boolean[] dp = new boolean[word.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= word.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (!dp[j]) {
                    continue;
                }
                if (dict.contains(word.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[word.length()];
    }
}
