package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1029. Two City Scheduling
There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].

Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.

 

Example 1:

Input: [[10,20],[30,200],[400,50],[30,20]]
Output: 110
Explanation: 
The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.

The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
 

Note:

1 <= costs.length <= 100
It is guaranteed that costs.length is even.
1 <= costs[i][0], costs[i][1] <= 1000
 * @author Johnny
 */
public class SolutionA1029 {
    public int twoCitySchedCost(int[][] costs) {
        List<int[]> list1 = new ArrayList<>();
        List<int[]> list2 = new ArrayList<>();
        for (int i = 0; i < costs.length; i++) {
            int[] cost = costs[i];
            if (cost[0] < cost[1]) {
                list1.add(cost);
            } else {
                list2.add(cost);
            }
        }
        
        if (list1.size() == list2.size()) {
            int sum = 0;
            for (int i = 0; i < list1.size(); i++) {
                sum += list1.get(i)[0];
            }
            for (int i = 0; i < list2.size(); i++) {
                sum += list2.get(i)[1];
            }
            return sum;
        }
        
        
        if (list1.size() < list2.size()) {
            Collections.sort(list2, (a,b)->(a[0]-a[1]) - (b[0]-b[1]));
            
            int sum = 0;
            for (int i = 0; i < list1.size(); i++) {
                sum += list1.get(i)[0];
            }
            for (int i = 0; i < list2.size(); i++) {
                if (i < costs.length / 2 - list1.size()) {
                    sum += list2.get(i)[0];
                } else {
                    sum += list2.get(i)[1];
                }
            }
            return sum;
        } else {
            Collections.sort(list1, (a,b)->(a[1]-a[0]) - (b[1]-b[0]));
            
            int sum = 0;
            for (int i = 0; i < list2.size(); i++) {
                sum += list2.get(i)[1];
            }
            for (int i = 0; i < list1.size(); i++) {
                if (i < costs.length / 2 - list2.size()) {
                    sum += list1.get(i)[1];
                } else {
                    sum += list1.get(i)[0];
                }
            }
            return sum;
        }
    }
}
