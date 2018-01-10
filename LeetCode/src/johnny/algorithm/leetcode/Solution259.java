package johnny.algorithm.leetcode;

import java.util.Arrays;

/**
 * 3Sum Smaller.
 * Given an array of n integers nums and a target, find the number of 
 * index triplets i, j, k with 0 <= i < j < k < n that satisfy the 
 * condition nums[i] + nums[j] + nums[k] < target.
 * 
 * For example, given nums = [-2, 0, 1, 3], and target = 2.
 * 
 * Return 2. Because there are two triplets which sums are less than 2:
 *  
 * @author Johnny
 */
public class Solution259 {
    //https://segmentfault.com/a/1190000003794736
    public int threeSumSmaller(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] >= target) {
                break;
            }
            int diff = target - nums[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                if (nums[left] + nums[right] < diff) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return count;
    }
}
