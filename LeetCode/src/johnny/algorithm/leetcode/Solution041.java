package johnny.algorithm.leetcode;

/**
 * First Missing Positive.
 * Given an unsorted integer array, find the first missing positive integer.
 * 
 * For example,
 * Given [1,2,0] return 3,
 * and [3,4,-1,1] return 2.
 * 
 * Your algorithm should run in O(n) time and uses constant space.
 * 
 * @author Johnny
 */
public class Solution041 {
    //http://www.cnblogs.com/AnnieKim/archive/2013/04/21/3034631.html
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            while (nums[i] != i + 1 && nums[i] > 0 && nums[i] < n && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        
        return n + 1;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
