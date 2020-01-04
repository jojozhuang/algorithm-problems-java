package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Shortest Word Distance II.
 * <p>
 * This is a follow up of Shortest Word Distance. The only difference is now you
 * are given the list of words and your method will be called repeatedly many
 * times with different parameters. How would you optimize it?
 * <p>
 * Design a class which receives a list of words in the constructor, and
 * implements a method that takes two words word1 and word2 and return the
 * shortest distance between these two words in the list.
 * <p>
 * For example,
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * <p>
 * Given word1 = "coding”, word2 = "practice”, return 3.
 * Given word1 = "makes", word2 = "coding", return 1.
 * <p>
 * Note:
 * You may assume that word1 does not equal to word2, and word1 and word2 are
 * both in the list.
 *
 * @author Johnny
 */
public class Solution244 {
    HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();

    public Solution244(String[] words) {
        if (words == null || words.length == 0) {

        } else {
            for (int i = 0; i < words.length; i++) {
                if (!map.containsKey(words[i])) {
                    map.put(words[i], new ArrayList<Integer>());
                }
                map.get(words[i]).add(i);
            }
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> list1 = map.get(word1);
        List<Integer> list2 = map.get(word2);

        int min = Integer.MAX_VALUE;
        for (Integer i1 : list1) {
            for (Integer i2 : list2) {
                min = Math.min(min, Math.abs(i1 - i2));
            }
        }

        return min;
    }
}
