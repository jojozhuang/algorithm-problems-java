package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
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
