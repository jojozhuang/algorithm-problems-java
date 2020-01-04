package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Increasing Subsequences
 * <p>
 * Given an integer array, your task is to find all the different possible
 * increasing subsequences of the given array, and the length of an increasing
 * subsequence should be at least 2 .
 * <p>
 * Example:
 * Input: [4, 6, 7, 7]
 * Output: [[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7],
 * [7,7], [4,7,7]]
 * <p>
 * Note:
 * 1. The length of the given array will not exceed 15.
 * 2. The range of integer in the given array is [-100,100].
 * 3. The given array may contain duplicates, and two equal integers should
 * also be considered as a special case of increasing sequence.
 *
 * @author Johnny
 */
public class Solution491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        List<Integer> holder = new ArrayList<Integer>();
        findSequence(res, holder, 0, nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>(res);
        return result;
    }

    public void findSequence(Set<List<Integer>> res, List<Integer> holder, int index, int[] nums) {
        if (holder.size() >= 2) {
            res.add(new ArrayList<Integer>(holder));
        }
        for (int i = index; i < nums.length; i++) {
            if (holder.size() == 0 || holder.get(holder.size() - 1) <= nums[i]) {
                holder.add(nums[i]);
                findSequence(res, holder, i + 1, nums);
                holder.remove(holder.size() - 1);
            }
        }
    }
}
