package johnny.algorithm.leetcode;

/**
 * Split Array Largest Sum
 * 
 * Given an array which consists of non-negative integers and an integer m, you 
 * can split the array into m non-empty continuous subarrays. Write an algorithm
 * to minimize the largest sum among these m subarrays.
 * 
 * Note:
 * If n is the length of array, assume the following constraints are satisfied:
 *   1 ≤ n ≤ 1000
 *   1 ≤ m ≤ min(50, n)
 * 
 * Examples:
 * 
 * Input:
 * nums = [7,2,5,10,8]
 * m = 2
 * 
 * Output:
 * 18
 * 
 * Explanation:
 * There are four ways to split nums into two subarrays.
 * The best way is to split it into [7,2,5] and [10,8],
 * where the largest sum among the two subarrays is only 18.
 * 
 * @author Johnny
 */
public class Solution410 {
    // binary search
    public int splitArray(int[] nums, int m) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, nums[i]);
        }
        
        if (m == 1) {
            return sum;
        }
        
        int start = max;
        int end = sum;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(nums, m, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return start;
    }
    
    private boolean isValid(int[] nums, int m, int target) {
        int count = 1;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if (total > target) {
                total = nums[i];
                count++;
                if (count > m) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public int splitArray2(int[] nums, int m) {
         int n = nums.length;
         int[] sum = new int[n + 1];
         for (int i = 0; i < n; i++) {
             sum[i + 1] = sum[i] + nums[i];
         }
         int[][] dp = new int[n + 1][m + 1];
         for (int i = 0; i <= n; i++) {
             for (int j = 0; j <= m; j++) {
                 dp[i][j] = Integer.MAX_VALUE;
             }
         }
         dp[0][0] = 0;
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= m; j++) {
                 for (int k = 0; k < i; k++) {
                     dp[i][j] = Math.min(dp[i][j], Math.max(dp[k][j - 1], sum[i] - sum[k]));
                 }
             }
         }
         return dp[n][m];
     }
    
}
