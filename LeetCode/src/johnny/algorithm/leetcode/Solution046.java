package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) {
            return ret;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        helper(ret, list, nums);
        return ret;
    }
    
    private void helper(List<List<Integer>> ret, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            ret.add(new ArrayList<Integer>(list));
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            helper(ret, list, nums);
            list.remove(list.size() - 1);
        }
    }
}
