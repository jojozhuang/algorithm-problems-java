package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Combinations.
 * Given two integers n and k, return all possible combinations of k numbers 
 * out of 1 ... n.
 * 
 * For example,
 * If n = 4 and k = 2, a solution is:
 * 
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 * 
 * @author Johnny
 */
public class Solution077 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if (n <= 0 || k <= 0 || n < k) {
            return ans;
        }

        List<Integer> list = new ArrayList<Integer>();
        dfs(n, k, 1, list, ans);

        return ans;
    }
    
    private void dfs(int n, int k, int pos, List<Integer> list, List<List<Integer>> ans) {
        if (list.size() == k) {
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = pos; i <= n; i++) {
            list.add(i);
            dfs(n, k, i + 1, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
