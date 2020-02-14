package johnny.company.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Max Of Min Altitudes
 *
 * Given a matrix with r rows and c columns, find the maximum score of a path starting at [0, 0] and ending at [r-1, c-1]. The score of a path is the minimum value in that path. For example, the score of the path 8 → 4 → 5 → 9 is 4.
 *
 * Don't include the first or final entry. You can only move either down or right at any point in time.
 *
 * Example 1:
 *
 * Input:
 * [[5, 1],
 *  [4, 5]]
 *
 * Output: 4
 * Explanation:
 * Possible paths:
 * 5 → 1 → 5 => min value is 1
 * 5 → 4 → 5 => min value is 4
 * Return the max value among minimum values => max(4, 1) = 4.
 * Example 2:
 *
 * Input:
 * [[1, 2, 3]
 *  [4, 5, 1]]
 *
 * Output: 4
 * Explanation:
 * Possible paths:
 * 1-> 2 -> 3 -> 1
 * 1-> 2 -> 5 -> 1
 * 1-> 4 -> 5 -> 1
 * So min of all the paths = [2, 2, 4]. Note that we don't include the first and final entry.
 * Return the max of that, so 4.
 * Related problems:
 *
 * https://leetcode.com/problems/minimum-path-sum/
 * https://leetcode.com/problems/unique-paths-ii/
 * https://leetcode.com/problems/path-with-maximum-minimum-value (premium) is a different problem. In this problem we can only move in 2 directions.
 *
 * https://leetcode.com/discuss/interview-question/383669/
 */
public class MaxOfMinAltitudes {
    public int maxMinPath(int[][] matrix) {
        int[] max = new int[1];
        dfs(matrix, 0, 0, new ArrayList<>(), max);
        return max[0];
    }

    private void dfs(int[][] matrix, int r, int c, List<Integer> list, int[] max) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (r >= m || c >= n) {
            return;
        }

        if (r == m - 1 && c == n - 1) {
            int min = list.get(1);
            for (int i = 2; i < list.size(); i++) {
                if (list.get(i) < min) {
                    min = list.get(i);
                }
            }
            max[0] = Math.max(max[0], min);
        }

        list.add(matrix[r][c]);
        dfs(matrix, r + 1, c, list, max);
        dfs(matrix, r, c + 1, list, max);
        list.remove(list.size() - 1);
    }
}
