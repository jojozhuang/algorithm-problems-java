package johnny.algorithm.leetcode;

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
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (k <= 0 || n <= 0) {
            return res;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        helper(1, k, n, list, res);
        return res;
    }
    
    private void helper(int pos, int k, int n, List<Integer> list, List<List<Integer>> res) {
        if (list.size() == k && n == 0) {
            List<Integer> li = new ArrayList<Integer>(list);
            res.add(li);
            return;
        }
        
        for (int i = pos; i <= 9; i++) {
            list.add(i);
            helper(i + 1, k, n - i, list, res);
            list.remove(list.size() - 1);
        }
    }
}
