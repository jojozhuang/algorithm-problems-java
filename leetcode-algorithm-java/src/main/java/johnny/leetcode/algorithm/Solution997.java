package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 997. Find the Town Judge
 * In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
 * <p>
 * If the town judge exists, then:
 * <p>
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
 * <p>
 * If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
 * <p>
 * Example 1:
 * Input: N = 2, trust = [[1,2]]
 * Output: 2
 * <p>
 * Example 2:
 * Input: N = 3, trust = [[1,3],[2,3]]
 * Output: 3
 * <p>
 * Example 3:
 * Input: N = 3, trust = [[1,3],[2,3],[3,1]]
 * Output: -1
 * <p>
 * Example 4:
 * Input: N = 3, trust = [[1,2],[2,3]]
 * Output: -1
 * <p>
 * Example 5:
 * Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
 * Output: 3
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= N <= 1000
 * trust.length <= 10000
 * trust[i] are all different
 * trust[i][0] != trust[i][1]
 * 1 <= trust[i][0], trust[i][1] <= N
 * }</pre>
 *
 * @author Johnny
 */
public class Solution997 {
    public int findJudge(int N, int[][] trust) {
        if (trust == null || trust.length == 0 || trust[0].length == 0) {
            return N;
        }
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] pair : trust) {
            set.add(pair[0]);
            if (map.containsKey(pair[0])) {
                map.remove(pair[0]);
            }
            if (!set.contains(pair[1])) {
                map.put(pair[1], map.getOrDefault(pair[1], 0) + 1);
            }
        }

        if (map.size() != 1 || set.size() != N - 1) {
            return -1;
        }

        int ans = 0;
        for (Integer i : map.keySet()) {
            ans = i;
        }

        if (map.get(ans) == N - 1) {
            return ans;
        }

        return -1;
    }
}
