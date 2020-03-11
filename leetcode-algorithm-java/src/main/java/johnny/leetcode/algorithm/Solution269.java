package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
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
    // Topological Sorting
    public String alienOrder(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        // initialize degree
        Map<Character, Integer> indegree = new HashMap<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                indegree.put(c, 0);
            }
        }

        Map<Character, List<Character>> graph = new HashMap<>();
        for (int i = 1; i < words.length; i++) {
            String word1 = words[i - 1];
            String word2 = words[i];
            for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);
                if (c1 != c2) {
                    if (!graph.containsKey(c1)) {
                        graph.put(c1, new ArrayList<>());
                    }
                    graph.get(c1).add(c2);
                    indegree.put(c2, indegree.get(c2) + 1);
                    break;
                }
            }
        }

        // use PriorityQueue instead of LinkedList for case "zy","zx" -> "yxz"
        Queue<Character> queue = new PriorityQueue<>();
        for (char c : indegree.keySet()) {
            if (indegree.get(c) == 0) {
                queue.offer(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            char c = queue.poll();
            sb.append(c);
            if (graph.containsKey(c)) {
                for (char nextchar : graph.get(c)) {
                    indegree.put(nextchar, indegree.get(nextchar) - 1);
                    if (indegree.get(nextchar) == 0) {
                        queue.offer(nextchar);
                    }
                }
            }
        }

        return sb.length() == indegree.size() ? sb.toString() : "";
    }

    public String alienOrder4(String[] words) {
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
    public String alienOrder444(String[] words) {
        Map<Character, Set<Character>> map = new HashMap<>();
        Map<Character, Integer> degree = new HashMap<>();
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
                    Set<Character> set = new HashSet<>();
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
        Queue<Character> q = new LinkedList<>();
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

    public String alienOrder444555(String[] words) {
        Map<Character, Set<Character>> graph = constructGraph(words);
        return topologicalSorting(graph);
    }


    private Map<Character, Set<Character>> constructGraph(String[] words) {
        Map<Character, Set<Character>> graph = new HashMap<>();

        // create nodes
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                if (!graph.containsKey(c)) {
                    graph.put(c, new HashSet<Character>());
                }
            }
        }

        // create edges
        for (int i = 0; i <  words.length - 1; i++) {
            int index = 0;
            while (index < words[i].length() && index < words[i + 1].length()) {
                if (words[i].charAt(index) != words[i + 1].charAt(index)) {
                    graph.get(words[i].charAt(index)).add(words[i + 1].charAt(index));
                    break;
                }
                index++;
            }
        }

        return graph;
    }

    private Map<Character, Integer> getIndegree(Map<Character, Set<Character>> graph) {
        Map<Character, Integer> indegree = new HashMap<>();
        for (Character u : graph.keySet()) {
            indegree.put(u, 0);
        }

        for (Character u : graph.keySet()) {
            for (Character v : graph.get(u)) {
                indegree.put(v, indegree.get(v) + 1);
            }
        }

        return indegree;
    }

    private String topologicalSorting(Map<Character, Set<Character>> graph) {
        Map<Character, Integer> indegree = getIndegree(graph);
        // as we should return the topo order with lexicographical order
        // we should use PriorityQueue instead of a FIFO Queue
        Queue<Character> queue = new PriorityQueue<>();

        for (Character u : indegree.keySet()) {
            if (indegree.get(u) == 0) {
                queue.offer(u);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Character head = queue.poll();
            sb.append(head);
            for (Character neighbor : graph.get(head)) {
                indegree.put(neighbor, indegree.get(neighbor) - 1);
                if (indegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (sb.length() != indegree.size()) {
            return "";
        }
        return sb.toString();
    }
}
