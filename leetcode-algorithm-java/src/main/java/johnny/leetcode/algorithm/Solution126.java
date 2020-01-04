package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Word Ladder II.
 * Given two words (start and end), and a dictionary, find all shortest
 * transformation sequence(s) from start to end, such that:
 * <p>
 * Only one letter can be changed at a time
 * Each intermediate word must exist in the dictionary
 * For example,
 * <p>
 * Given:
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 * Return
 * [
 * ["hit","hot","dot","dog","cog"],
 * ["hit","hot","lot","log","cog"]
 * ]
 * Note:
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 *
 * @author Johnny
 */
public class Solution126 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> ans = new ArrayList<>();
        if (beginWord.isEmpty() || endWord.isEmpty() || wordList == null || wordList.isEmpty()) {
            return ans;
        }
        Set<String> set = new HashSet<>();
        for (String s : wordList) {
            set.add(s);
        }
        if (!set.contains(endWord)) {
            return ans;
        }
        set.remove(beginWord);
        set.remove(endWord);

        Map<String, Integer> steps = new HashMap<>();
        steps.put(beginWord, 1);
        Map<String, List<String>> parents = new HashMap<>();

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        int len = beginWord.length();
        int step = 0;
        boolean found = false;
        while (!queue.isEmpty() && !found) {
            step++;
            int size = queue.size();
            for (int s = 0; s < size; s++) {
                String word = queue.poll();

                for (int i = 0; i < len; i++) {
                    for (int j = 'a'; j <= 'z'; j++) {
                        String newWord = word.substring(0, i) + (char) (j) + word.substring(i + 1);
                        if (newWord.equals(endWord)) {
                            if (!parents.containsKey(newWord)) {
                                parents.put(newWord, new ArrayList<>());
                            }
                            parents.get(newWord).add(word);
                            found = true;
                        } else {
                            if (steps.containsKey(newWord) && step < steps.get(newWord)) {
                                if (!parents.containsKey(newWord)) {
                                    parents.put(newWord, new ArrayList<>());
                                }
                                parents.get(newWord).add(word);
                            }
                        }
                        if (!set.contains(newWord)) {
                            continue;
                        }
                        set.remove(newWord);
                        queue.offer(newWord);
                        steps.put(newWord, steps.get(word) + 1);
                        if (!parents.containsKey(newWord)) {
                            parents.put(newWord, new ArrayList<>());
                        }
                        parents.get(newWord).add(word);
                    }
                }
            }
        }

        if (found) {
            List<String> list = new ArrayList<>();
            list.add(endWord);
            dfs(endWord, beginWord, parents, list, ans);
        }

        return ans;
    }

    private void dfs(String word, String beginWord, Map<String, List<String>> parents, List<String> list, List<List<String>> ans) {
        if (word.equals(beginWord)) {
            List<String> clone = new ArrayList<>();
            for (String s : list) {
                clone.add(s);
            }
            Collections.reverse(clone);
            ans.add(new ArrayList<>(clone));
            return;
        }

        for (String p : parents.get(word)) {
            list.add(p);
            dfs(p, beginWord, parents, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
