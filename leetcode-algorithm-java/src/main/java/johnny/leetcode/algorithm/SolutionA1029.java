package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1029. Two City Scheduling
 * There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].
 * <p>
 * Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
 * <p>
 * Example 1:
 * Input: [[10,20],[30,200],[400,50],[30,20]]
 * Output: 110
 * Explanation:
 * The first person goes to city A for a cost of 10.
 * The second person goes to city A for a cost of 30.
 * The third person goes to city B for a cost of 50.
 * The fourth person goes to city B for a cost of 20.
 * <p>
 * The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= costs.length <= 100
 * It is guaranteed that costs.length is even.
 * 1 <= costs[i][0], costs[i][1] <= 1000
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1029 {
    // Suppose we have [a, b], [c, d], if we select 'a' to make the cost minimal, then a + d < b + c. a - b < c - d
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> {
           return (a[0]-a[1]) - (b[0]-b[1]);
        });

        int cost = 0;
        for (int i = 0; i < costs.length; i++) {
            if (i < costs.length / 2) {
                cost += costs[i][0];
            } else {
                cost += costs[i][1];
            }
        }

        return cost;
    }

    public int twoCitySchedCost2(int[][] costs) {
        int n = costs.length;
        List<int[]> list1 = new ArrayList<>();
        List<int[]> list2 = new ArrayList<>();
        for (int[] cost : costs) {
            if (cost[0] < cost[1]) {
                list1.add(cost);
            } else {
                list2.add(cost);
            }
        }

        int sum = 0;
        if (list1.size() < list2.size()) {
            Collections.sort(list2, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));

            for (int[] cost : list1) {
                sum += cost[0];
            }
            int i = 0;
            for (int[] cost : list2) {
                if (i < n / 2 - list1.size()) {
                    sum += cost[0];
                } else {
                    sum += cost[1];
                }
                i++;
            }
        } else if (list1.size() > list2.size()) {
            Collections.sort(list1, (a, b) -> (a[1] - a[0]) - (b[1] - b[0]));

            for (int[] cost : list2) {
                sum += cost[1];
            }
            int i = 0;
            for (int[] cost : list1) {
                if (i < n / 2 - list2.size()) {
                    sum += cost[1];
                } else {
                    sum += cost[0];
                }
                i++;
            }
        } else {
            for (int[] cost : list1) {
                sum += cost[0];
            }
            for (int[] cost : list2) {
                sum += cost[1];
            }
        }

        return sum;
    }
}
