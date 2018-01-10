package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (k <= 0 || n <= 0) {
            return res;
        }
        
        int[] candidates = new int[]{1,2,3,4,5,6,7,8,9};
        Arrays.sort(candidates);
        
        List<Integer> list = new ArrayList<Integer>();
        helper(candidates, 0, k, n, list, res);  
        return res;
    }
    
    private void helper(int[] candidates, int pos, int k, int n, List<Integer> list, List<List<Integer>> res) {
        if (n <= 0 || k <= 0) {
            if (n == 0 && k == 0) {
                res.add(new ArrayList<Integer>(list));
            }
            return;
        }
        
        for (int i = pos; i < candidates.length; i++) {
            list.add(candidates[i]);
            helper(candidates, i + 1, k - 1, n - candidates[i], list, res);
            list.remove(list.size() - 1);
        }
    }
}
