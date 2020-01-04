package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All Duplicates in an Array
 * <p>
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements
 * appear twice and others appear once.
 * <p>
 * Find all the elements that appear twice in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime?
 * <p>
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * Output:
 * [2,3]
 *
 * @author Johnny
 */
public class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1) {
                if (nums[nums[i] - 1] == nums[i]) {
                    break;
                }
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
