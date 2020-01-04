package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All Numbers Disappeared in an Array
 * <p>
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once.
 * <p>
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime? You may assume the
 * returned list does not count as extra space.
 * <p>
 * Example:
 * <p>
 * Input:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * Output:
 * [5,6]
 *
 * @author Johnny
 */
public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return ans;
        }

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1) {
                if (nums[i] == nums[nums[i] - 1]) {
                    break;
                }
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res.add(i + 1);
            }
        }

        return res;
    }
}
