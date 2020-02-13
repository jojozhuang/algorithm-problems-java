package johnny.company.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Two Sum - Unique Pairs
 * Given an int array nums and an int target, find how many unique pairs in the array such that their sum is equal to target. Return the number of pairs.
 *
 * Example 1:
 *
 * Input: nums = [1, 1, 2, 45, 46, 46], target = 47
 * Output: 2
 * Explanation:
 * 1 + 46 = 47
 * 2 + 45 = 47
 * Example 2:
 *
 * Input: nums = [1, 1], target = 2
 * Output: 1
 * Explanation:
 * 1 + 1 = 2
 * Example 3:
 *
 * Input: nums = [1, 5, 1, 5], target = 6
 * Output: 1
 * Explanation:
 * [1, 5] and [5, 1] are considered the same.
 * Related problems:
 *
 * https://leetcode.com/problems/two-sum
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 *
 * https://leetcode.com/discuss/interview-question/372434
 */
public class TwoSumUniquePairs {
    public int uniquePairs(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int ans = 0;
        Set<Integer> seen = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(target - nums[i]);
            } else {
                if (!seen.contains(nums[i]) && !seen.contains(target - nums[i])) {
                    ans++;
                    seen.add(nums[i]);
                    seen.add(target - nums[i]);
                }
            }
        }

        return ans;
    }
}
