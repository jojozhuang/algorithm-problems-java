package johnny.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 *548. Split Array with Equal Sum
 *Given an array with n integers, you need to find if there are triplets (i, j, k) which satisfies following conditions:

0 < i, i + 1 < j, j + 1 < k < n - 1
Sum of subarrays (0, i - 1), (i + 1, j - 1), (j + 1, k - 1) and (k + 1, n - 1) should be equal.
where we define that subarray (L, R) represents a slice of the original array starting from the element indexed L to the element indexed R.
Example:
Input: [1,2,1,2,1,2,1]
Output: True
Explanation:
i = 1, j = 3, k = 5. 
sum(0, i - 1) = sum(0, 0) = 1
sum(i + 1, j - 1) = sum(2, 2) = 1
sum(j + 1, k - 1) = sum(4, 4) = 1
sum(k + 1, n - 1) = sum(6, 6) = 1
Note:
1 <= n <= 2000.
Elements in the given array will be in range [-1,000,000, 1,000,000].
 * @author Johnny
 */
public class Solution548 {
    // Hashset, O(n^2)
    public boolean splitArray(int[] nums) {
        if (nums == null || nums.length < 7) {
            return false;
        }
        
        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i-1] + nums[i];
        }
        
        // j is the middle cut, if all four parts are same, then the sum of first two parts are same with the sum of last two parts
        for (int j = 1; j < n - 3; j++) {
            Set<Integer> set = new HashSet<>();
            // left
            for (int i = 1; i < j - 1; i++) {
                if (sum[i - 1] == sum[j - 1] - sum[i]) {
                    set.add(sum[i - 1]);
                }
            }
            
            // right
            for (int k = j + 2; k < n - 1; k++) {
                if (sum[k - 1] - sum[j] == sum[n - 1] - sum[k] && set.contains(sum[n - 1] - sum[k])) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    // brute force, pre sum, O(n^3)
    public boolean splitArray2(int[] nums) {
        if (nums == null || nums.length < 7) {
            return false;
        }
        
        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i-1] + nums[i];
        }
        
        for (int i = 1; i < n - 5; i++) {
            for (int j = i + 2; j < n - 3; j++) {
                if (sum[i - 1] == sum[j - 1] - sum[i]) {
                    for (int k = j + 2; k < n - 1; k++) {
                        if (sum[i - 1] == sum[k - 1] - sum[j] &&
                            sum[i - 1] == sum[n - 1] - sum[k]) {
                            return true;
                        }
                    }
                }
            }
        }
        
        return false;
    }
}
