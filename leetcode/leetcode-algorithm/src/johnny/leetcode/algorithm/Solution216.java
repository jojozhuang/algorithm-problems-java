package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Combination Sum III.
 * Find all possible combinations of k numbers that add up to a number n, given
 * that only numbers from 1 to 9 can be used and each combination should be a 
 * unique set of numbers.
 * 
 * Ensure that numbers within the set are sorted in ascending order.
 *  
 * Example 1:
 * Input: k = 3, n = 7
 * Output: [[1,2,4]]
 * 
 * Example 2:
 * Input: k = 3, n = 9
 * Output: [[1,2,6], [1,3,5], [2,3,4]]
 * 
 * @author Johnny
 */
public class Solution216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        if (k <= 0 || n <= 0) {
            return ans;
        }
        
        List<Integer> list = new ArrayList<>();
        dfs(k, n, 1, list, ans);
        return ans;
    }
    
    private void dfs(int k, int n, int pos, List<Integer> list, List<List<Integer>> ans) {
        if (n <= 0 || k <= 0) {
            if (n == 0 && k == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        
        for (int i = pos; i <= 9; i++) {
            if (i > n) { 
                break;
            }
            list.add(i);
            dfs(k-1, n - i, i + 1, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
