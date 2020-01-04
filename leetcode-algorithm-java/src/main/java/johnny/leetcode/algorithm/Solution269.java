package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Alien Dictionary.
 * There is a new alien language which uses the latin alphabet. However, the
 * order among letters are unknown to you. You receive a list of words from the
 * dictionary, wherewords are sorted lexicographically by the rules of this
 * new language. Derive the order of letters in this language.
 * <p>
 * For example,
 * Given the following words in dictionary,
 * <p>
 * [
 * "wrt",
 * "wrf",
 * "er",
 * "ett",
 * "rftt"
 * ]
 * The correct order is: "wertf".
 * <p>
 * Note:
 * <p>
 * You may assume all letters are in lowercase.
 * If the order is invalid, return an empty string.
 * There may be multiple valid order of letters, return any one of them is fine.
 *
 * @author Johnny
 */
public class Solution269 {
    public String alienOrder(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        // build graph
        Map<Character, List<Character>> graph = new HashMap<>();
        for (int i = 1; i < words.length; i++) {
            String s1 = words[i - 1];
            String s2 = words[i];
            for (int j = 0; j < Math.min(s1.length(), s2.length()); j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    if (!graph.containsKey(s1.charAt(j))) {
                        graph.put(s1.charAt(j), new ArrayList<Character>());
                    }
                    graph.get(s1.charAt(j)).add(s2.charAt(j));
                    break;
                }
            }
        }

        // calculate indegree
        //Map<Character, Integer> degree = new HashMap<>();
        int[] degree = new int[26];
        Arrays.fill(degree, -1); // -1: no apprearance, 0: indegree = 0; 1 or larger: has indegree
        // if character appears, set count to 0;
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                degree[c - 'a'] = 0;
            }
        }
        // if character is after other characters
        for (List<Character> list : graph.values()) {
            for (Character c : list) {
                degree[c - 'a']++;
            }
        }

        // BFS
        // add character whose indegree is zero to queue
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 0) {
                queue.offer((char) (i + 'a'));
            }
        }

        // search
        String ans = "";
        while (!queue.isEmpty()) {
            Character c = queue.poll();
            ans = ans + String.valueOf(c);
            if (graph.containsKey(c)) {
                for (Character next : graph.get(c)) {
                    degree[next - 'a']--;
                    if (degree[next - 'a'] == 0) {
                        queue.offer(next);
                    }
                }
            }
        }

        // 
        for (int d : degree) {
            if (d > 0) {
                return "";
            }
        }

        return ans;
    }

    //http://www.cnblogs.com/jcliBlogger/p/4758761.html
    //https://segmentfault.com/a/1190000003795463
    public String alienOrder2(String[] words) {
        Map<Character, Set<Character>> map = new HashMap<Character, Set<Character>>();
        Map<Character, Integer> degree = new HashMap<Character, Integer>();
        String result = "";
        if (words == null || words.length == 0) return result;
        for (String s : words) {
            for (char c : s.toCharArray()) {
                degree.put(c, 0);
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            String cur = words[i];
            String next = words[i + 1];
            int length = Math.min(cur.length(), next.length());
            for (int j = 0; j < length; j++) {
                char c1 = cur.charAt(j);
                char c2 = next.charAt(j);
                if (c1 != c2) {
                    Set<Character> set = new HashSet<Character>();
                    if (map.containsKey(c1)) set = map.get(c1);
                    if (!set.contains(c2)) {
                        set.add(c2);
                        map.put(c1, set);
                        degree.put(c2, degree.get(c2) + 1);
                    }
                    break;
                }
            }
        }
        Queue<Character> q = new LinkedList<Character>();
        for (char c : degree.keySet()) {
            if (degree.get(c) == 0) q.add(c);
        }
        while (!q.isEmpty()) {
            char c = q.remove();
            result += c;
            if (map.containsKey(c)) {
                for (char c2 : map.get(c)) {
                    degree.put(c2, degree.get(c2) - 1);
                    if (degree.get(c2) == 0) q.add(c2);
                }
            }
        }
        if (result.length() != degree.size()) return "";
        return result;
    }
}
