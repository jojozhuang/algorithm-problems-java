package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1049. Last Stone Weight II
We have a collection of rocks, each rock has a positive integer weight.

Each turn, we choose any two rocks and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the smallest possible weight of this stone (the weight is 0 if there are no stones left.)

 

Example 1:

Input: [2,7,4,1,8,1]
Output: 1
Explanation: 
We can combine 2 and 4 to get 2 so the array converts to [2,7,1,8,1] then,
we can combine 7 and 8 to get 1 so the array converts to [2,1,1,1] then,
we can combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we can combine 1 and 1 to get 0 so the array converts to [1] then that's the optimal value.
 

Note:

1 <= stones.length <= 30
1 <= stones[i] <= 100

 * @author Johnny
 */
public class SolutionA1049 {
    public int lastStoneWeightII(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int s : stones) {
            list.add(s);
        }
        boolean flag = false;
        while (list.size() > 1) {
            Collections.sort(list);
            List<Integer> next = new ArrayList<>();
            if (!flag) {
                int start = 0;
                int end = list.size() - 1;
                while (start < end) {
                    if (start == end) {
                        next.add(list.get(start));
                    } else {
                        int diff = list.get(end) - list.get(start);
                        if (diff != 0) {
                            next.add(diff);
                        }
                    }
                    start++;
                    end--;
                }
            } else {
                for (int i = list.size() - 1; i >= 1; i=i-2) {
                    int diff = list.get(i) - list.get(i-1);
                    if (diff != 0) {
                        next.add(diff);
                    }
                }
                if (list.size() % 2 == 1) {
                    next.add(list.get(0));
                }
            }
            list = next;
            flag = !flag;
        }
        
        if (list.size() == 0) {
            return 0;
        } else {
            return list.get(0);
        }
    }
}
