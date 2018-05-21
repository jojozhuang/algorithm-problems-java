package johnny.algorithm.leetcode;

/**
*713. Subarray Product Less Than K
*Your are given an array of positive integers nums.

Count and print the number of (contiguous) subarrays where the product of all the elements in the subarray is less than k.

Example 1:
Input: nums = [10, 5, 2, 6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are: [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6].
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
Note:

0 < nums.length <= 50000.
0 < nums[i] < 1000.
0 <= k < 10^6.

 
 * @author Johnny
 */
public class Solution713 {
    // Sliding Window, O(n)
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return 0;
        }
        int res = 0;
        int product = 1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k && left <= right) { // keep removing the left element if product is larger than k
                product /= nums[left];
                left++;
            }
            res += right - left + 1;
        }
        return res;
    }

    // Naive, O(n^2)
    public int numSubarrayProductLessThanK2(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return 0;
        }
        
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k) {
                continue;
            }
            long product = nums[i];
            res++;
            for (int j = i + 1; j < nums.length; j++) {
                product *= nums[j];
                if (product < k) {
                    res++;
                } else {
                    break;
                }
            }
        }
        
        return res;
    }
}