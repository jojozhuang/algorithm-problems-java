package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1042. Flower Planting With No Adjacent
 * You have N gardens, labelled 1 to N.  In each garden, you want to plant one of 4 types of flowers.
 * <p>
 * paths[i] = [x, y] describes the existence of a bidirectional path from garden x to garden y.
 * <p>
 * Also, there is no garden that has more than 3 paths coming into or leaving it.
 * <p>
 * Your task is to choose a flower type for each garden such that, for any two gardens connected by a path, they have different types of flowers.
 * <p>
 * Return any such a choice as an array answer, where answer[i] is the type of flower planted in the (i+1)-th garden.  The flower types are denoted 1, 2, 3, or 4.  It is guaranteed an answer exists.
 * <p>
 * Example 1:
 * Input: N = 3, paths = [[1,2],[2,3],[3,1]]
 * Output: [1,2,3]
 * <p>
 * Example 2:
 * Input: N = 4, paths = [[1,2],[3,4]]
 * Output: [1,2,1,2]
 * <p>
 * Example 3:
 * Input: N = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
 * Output: [1,2,3,4]
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= N <= 10000
 * 0 <= paths.size <= 20000
 * No garden has 4 or more paths coming into or leaving it.
 * It is guaranteed an answer exists.
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1042 {
    public int[] gardenNoAdj(int N, int[][] paths) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < N; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int[] p : paths) {
            graph.get(p[0] - 1).add(p[1] - 1);
            graph.get(p[1] - 1).add(p[0] - 1);
        }

        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            int[] colors = new int[5];
            for (int j : graph.get(i))
                colors[res[j]] = 1;
            for (int c = 4; c > 0; --c)
                if (colors[c] == 0)
                    res[i] = c;
        }
        return res;
    }
}
