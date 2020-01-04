package johnny.leetcode.algorithm;

/**
 * Shortest Word Distance.
 * <p>
 * Given a list of words and two words word1 and word2, return the shortest
 * distance between these two words in the list.
 * <p>
 * For example,
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * <p>
 * Given word1 = "coding", word2 = "practice", return 3.
 * Given word1 = "makes", word2 = "coding", return 1.
 * <p>
 * Note:
 * You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
 * <p>
 * The naive idea is very easy. But could you solve it in one-pass?
 *
 * @author Johnny
 */
public class Solution243 {
    public int shortestDistance(String[] words, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int n = words.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(word1)) {
                index1 = i;
            } else if (words[i].equals(word2)) {
                index2 = i;
            }
            if (index1 != -1 && index2 != -1) {
                min = Math.min(min, Math.abs(index1 - index2));
            }
        }
        return min;
    }
}
