package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Permutations.
 * Given a collection of numbers, return all possible permutations.
 * 
 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 * 
 * @author Johnny
 */
public class Solution046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        helper(nums, list, res);
        return res;
    }
    
    private void helper(int[] nums,List<Integer> list, List<List<Integer>> res) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<Integer>(list));
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            helper(nums, list, res);
            list.remove(list.size() - 1);
        }
    }
}
