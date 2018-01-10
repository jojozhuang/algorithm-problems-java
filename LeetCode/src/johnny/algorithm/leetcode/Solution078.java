package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Subsets.
 * Given a set of distinct integers, S, return all possible subsets.
 * 
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,3], a solution is:
 * 
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * 
 * @author Johnny
 */
public class Solution078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null) {
            return res;
        }

        Arrays.sort(nums);// not necessary, just for unit test
        
        List<Integer> list = new ArrayList<Integer>();
        helper(nums, 0, list, res);
        return res;
    }
    
    private void helper(int[] nums, int pos, List<Integer> list, List<List<Integer>> res) {
        res.add(new ArrayList<Integer>(list));
        
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            helper(nums, i + 1, list, res);
            list.remove(list.size() - 1);
        }
    }
}
