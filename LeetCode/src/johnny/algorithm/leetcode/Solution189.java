package johnny.algorithm.leetcode;

/**
 * Rotate Array.
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated 
 * to [5,6,7,1,2,3,4].
 * 
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different 
 * ways to solve this problem.
 * 
 * @author Johnny
 */
public class Solution189 { 
    public void rotate(int[] nums, int k) { 
        if (nums == null || nums.length <= 1) {
            return;
        }
        
        if (k >= nums.length) {
            k = k % nums.length;
        }
        
        if (k <= 0) {
            return;
        }
        
        //reverse in 3-steps
        //reverse(nums, 0, nums.length - k - 1);
        //reverse(nums, nums.length - k, nums.length - 1);
        //reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // Brute Force
    public void rotate2(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
}
