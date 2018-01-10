package johnny.algorithm.leetcode;

/**
 * Range Sum Query - Immutable.
 * 
 * Given an integer array nums, find the sum of the elements between 
 * indices i and j (i ≤ j), inclusive.
 * 
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * 
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * Note:
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 * 
 * @author Johnny
 */
public class Solution303 {
    private int[] sum;
    public Solution303(int[] nums) {
        if (nums == null || nums.length == 0) {
            sum = new int[] {0, 0};            
        } else {
            sum = new int[nums.length + 1];
            sum[0] = 0;
            for (int i = 0; i < nums.length; i++) {
                sum[i + 1] = sum[i] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if (i < 0 || j > sum.length - 2 || i > j) {
            return 0;
        }
        
        return sum[j + 1] - sum[i];       
    }
}
