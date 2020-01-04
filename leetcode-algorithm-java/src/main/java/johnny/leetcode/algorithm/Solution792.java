package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 792. Number of Matching Subsequences
 * Given string S and a dictionary of words words, find the number of words[i] that is a subsequence of S.
 * <p>
 * Example :
 * Input:
 * S = "abcde"
 * words = ["a", "bb", "acd", "ace"]
 * Output: 3
 * Explanation: There are three words in words that are a subsequence of S: "a", "acd", "ace".
 * Note:
 * <p>
 * All words in words and S will only consists of lowercase letters.
 * The length of S will be in the range of [1, 50000].
 * The length of words will be in the range of [1, 5000].
 * The length of words[i] will be in the range of [1, 50].
 *
 * @author Johnny
 */
public class Solution792 {
    public int numMatchingSubseq(String S, String[] words) {
        List<Integer[]>[] waiting = new List[128];
        for (int c = 0; c <= 'z'; c++)
            waiting[c] = new ArrayList<Integer[]>();
        for (int i = 0; i < words.length; i++)
            waiting[words[i].charAt(0)].add(new Integer[]{i, 1});
        for (char c : S.toCharArray()) {
            List<Integer[]> advance = new ArrayList<Integer[]>(waiting[c]);
            waiting[c].clear();
            for (Integer[] a : advance)
                waiting[a[1] < words[a[0]].length() ? words[a[0]].charAt(a[1]++) : 0].add(a);
        }
        return waiting[0].size();
    }
}
