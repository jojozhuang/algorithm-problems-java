package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1377. Frog Position After T Seconds
 *
 * Given an undirected tree consisting of n vertices numbered from 1 to n. A frog starts jumping from the vertex 1. In one second, the frog jumps from its current vertex to another unvisited vertex if they are directly connected. The frog can not jump back to a visited vertex. In case the frog can jump to several vertices it jumps randomly to one of them with the same probability, otherwise, when the frog can not jump to any unvisited vertex it jumps forever on the same vertex.
 *
 * The edges of the undirected tree are given in the array edges, where edges[i] = [fromi, toi] means that exists an edge connecting directly the vertices fromi and toi.
 *
 * Return the probability that after t seconds the frog is on the vertex target.
 *
 * Example 1:
 * Input: n = 7, edges = [[1,2],[1,3],[1,7],[2,4],[2,6],[3,5]], t = 2, target = 4
 * Output: 0.16666666666666666
 * Explanation: The figure above shows the given graph. The frog starts at vertex 1, jumping with 1/3 probability to the vertex 2 after second 1 and then jumping with 1/2 probability to vertex 4 after second 2. Thus the probability for the frog is on the vertex 4 after 2 seconds is 1/3 * 1/2 = 1/6 = 0.16666666666666666.
 *
 * Example 2:
 * Input: n = 7, edges = [[1,2],[1,3],[1,7],[2,4],[2,6],[3,5]], t = 1, target = 7
 * Output: 0.3333333333333333
 * Explanation: The figure above shows the given graph. The frog starts at vertex 1, jumping with 1/3 = 0.3333333333333333 probability to the vertex 7 after second 1.
 *
 * Example 3:
 * Input: n = 7, edges = [[1,2],[1,3],[1,7],[2,4],[2,6],[3,5]], t = 20, target = 6
 * Output: 0.16666666666666666
 *
 * Constraints:
 *
 * 1 <= n <= 100
 * edges.length == n-1
 * edges[i].length == 2
 * 1 <= edges[i][0], edges[i][1] <= n
 * 1 <= t <= 50
 * 1 <= target <= n
 * Answers within 10^-5 of the actual value will be accepted as correct.
 */
public class SolutionA1377 {
    public double frogPosition(int n, int[][] edges, int t, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            if (edge[0] < edge[1]) {
                if (!map.containsKey(edge[0])) {
                    map.put(edge[0], new ArrayList<>());
                }
                map.get(edge[0]).add(edge[1]);
            } else {
                if (!map.containsKey(edge[1])) {
                    map.put(edge[1], new ArrayList<>());
                }
                map.get(edge[1]).add(edge[0]);
            }
        }
        List<Integer> branch = new ArrayList<>();
        if (dfs(map, 1, target, t, branch)) {
            int mul = 1;
            for (int i : branch) {
                mul *= i;
            }

            return (double)1/mul;
        }
        return 0.0;
    }

    private boolean dfs(Map<Integer, List<Integer>> map, int vertex, int target, int t, List<Integer> branch) {
        if (vertex == target) {
            return true;
        }
        if (!map.containsKey(vertex)) {
            return false;
        }
        if (t == 0) {
            return false;
        }

        List<Integer> children = map.get(vertex);
        branch.add(children.size());
        for (int i = 0; i < children.size(); i++) {
            if (dfs(map, children.get(i), target, t - 1, branch)) {
                return true;
            }
        }
        branch.remove(branch.size() - 1);

        return false;
    }
}
