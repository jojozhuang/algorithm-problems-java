package johnny.leetcode.algorithm;

/**
 * Maximum Average Subarray I
 * Given an array consisting of n integers, find the contiguous subarray of 
 * given length k that has the maximum average value. And you need to output 
 * the maximum average value.
 * 
 * Example 1:
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 * 
 * Note:
 * 1 <= k <= n <= 30,000.
 * Elements of the given array will be in the range [-10,000, 10,000].
 * 
 * @author Johnny
 */
public class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k > nums.length) {
            return 0;
        }
        
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double res = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            res = Math.max(sum, res);
        }
        
        return res/k;
    }
}
