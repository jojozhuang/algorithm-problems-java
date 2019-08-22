package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1128. Number of Equivalent Domino Pairs
Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a==c and b==d), or (a==d and b==c) - that is, one domino can be rotated to be equal to another domino.

Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].

 

Example 1:

Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
Output: 1
 

Constraints:

1 <= dominoes.length <= 40000
1 <= dominoes[i][j] <= 9

 * @author Johnny
 */
public class SolutionA1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < dominoes.length; i++) {
            List<Integer> domino = new ArrayList<>();
            int[] item = dominoes[i];
            if (item[0] > item[1]) {
                int temp = item[0];
                item[0] = item[1];
                item[1] = temp;
            }
            domino.add(item[0]);
            domino.add(item[1]);
            if (!map.containsKey(domino)) {
                map.put(domino, 0);
            }
            map.put(domino, map.get(domino) + 1);
        }
        
        int ans = 0;
        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                //ans += factorial(entry.getValue());
                ans += entry.getValue();
            }
        }
        
        return ans;
    }
    
    public int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
