package johnny.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class SolutionA3062 {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        Set<Integer> set = new HashSet<>();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!set.contains(i)) {
                int dis = 4000001;
                int index = 0;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        int temp = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                        if (temp < dis) {
                            dis = temp;
                            index = j;
                        }
                    }
                }
                if (dis < 4000001) {
                    ans += dis;
                    set.add(i);
                    set.add(index);
                }
            }

        }

        return ans;
    }
}
