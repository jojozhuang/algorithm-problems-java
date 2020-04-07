package johnny.lintcode.algorithm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tree Longest Path With Same Value
 * We consider an undirected tree with N nodes, numbered from 1 to N, Additionally, each node also has a label
 * attached to it and the label is an integer value. Note that different nodes can have identical labels.
 * You need to write a function , that , given a zero-indexed array A of length N, where A[J] is the label
 * value of the (J + 1)-th node in the tree, and a zero-indexed array E of length K = (N - 1) * 2 in which
 * the edges of the tree are described (for every 0 <= j <= N -2 values E[2 * J] and E[2 * J + 1] represents
 * and edge connecting node E[2 * J] with node E[2 * J + 1])， returns the length of the longest path such
 * that all the nodes on that path have the same label. Then length of a path if defined as the number of edges
 * in that path.
 *
 * Assume that: 1 <= N <= 1000
 *
 * Example
 * Example1
 * Input: A = [1, 1, 1 ,2, 2] and E = [1, 2, 1, 3, 2, 4, 2, 5]
 * Output: 2
 * Explanation:
 * described tree appears as follows:
 * ​```
 *                    1 （value = 1）
 *                  /   \
 *     (value = 1) 2     3 (value = 1)
 *                /  \
 *  (value = 2)  4     5 (value = 2)
 * ​```
 * The longest path (in which all nodes have the save value of 1) is (2 -> 1 -> 3). The number of edges on this path is 2, thus, that is the answer.
 *
 * Example2
 * Input: A = [1, 2, 1 ,2, 2] and E = [1, 2, 1, 3, 2, 4, 2, 5]
 * Output: 2
 * Explanation:
 * described tree appears as follows:
 * ​```
 *                    1 （value = 1）
 *                  /   \
 *     (value = 2) 2     3 (value = 1)
 *                /  \
 *  (value = 2)  4     5 (value = 2)
 * ​```
 * The longest path (in which all nodes have the save value of 2) is (4 -> 2 -> 5). The number of edges on this path is 2, thus, that is the answer.
 *
 */
public class TreeLongestPathWithSameValue {
    public int LongestPathWithSameValue(int[] A, int[] E) {
        BigDecimal b1, b2;

        b1 = new BigDecimal("1.001");
        b2 = new BigDecimal("1.002");

        if (b1.intValue() == b2.intValue()) {
            System.out.println(b1 + " and " + b2 + " are equal.");
        } else {
            System.out.println(b1 + " and " + b2 + " are not equal.");
        }

        // build gragh
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < E.length; i+=2) {
            if (!map.containsKey(E[i])) {
                map.put(E[i], new ArrayList<>());
            }
            if (!map.containsKey(E[i+1])) {
                map.put(E[i+1], new ArrayList<>());
            }
            map.get(E[i]).add(E[i+1]);
            map.get(E[i+1]).add(E[i]);
        }

        int[] max = new int[1]; // count of vertex with same value
        for (int i = 1; i <= A.length; i++) {
            boolean[] visited = new boolean[A.length];
            helper(A, i, 1, visited, map, max);
        }

        return max[0] - 1; // edges = vertex - 1
    }

    // dfs
    private void helper(int[] A, int vertex, int count, boolean[] visited, Map<Integer, List<Integer>> map, int[] max) {
        if (visited[vertex - 1]) {
            max[0] = Math.max(max[0], count - 1); // count - 1
            return;
        }

        visited[vertex - 1] = true;
        for (Integer neighbor : map.get(vertex)) {
            if (A[neighbor - 1] == A[vertex - 1]) {
                helper(A, neighbor, count + 1, visited, map, max);
            } else {
                max[0] = Math.max(max[0], count);
            }
        }
        visited[vertex - 1] = false;
    }
}
