package johnny.leetcode.algorithm;

import java.util.HashMap;

/**
 * Two Sum.
 * <p>
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author Johnny
 */
public class Solution001 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length < 2) {
            return res;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                res[0] = map.get(nums[i]);
                res[1] = i;
                return res;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return res;
    }
}
