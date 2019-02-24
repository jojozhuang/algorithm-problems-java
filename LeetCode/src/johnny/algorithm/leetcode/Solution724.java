package johnny.algorithm.leetcode;

/**
*724. Find Pivot Index
Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

Example 1:
Input: 
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.
Example 2:
Input: 
nums = [1, 2, 3]
Output: -1
Explanation: 
There is no index that satisfies the conditions in the problem statement.
Note:

The length of nums will be in the range [0, 10000].
Each element nums[i] will be an integer in the range [-1000, 1000].
 * @author Johnny
 */
public class Solution724 {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int[] sum1 = new int[nums.length];
        int[] sum2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum1[i] += nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            sum2[i] += nums[i];
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (sum1[left] < sum2[right]) {
                left++;
            } else if (sum1[left] > sum2[right]) {
                right--;
            } else {
                if (right - left == 2) {
                    return left + 1;
                }
                left++;
                right--;
            }
        }
        
        return -1;
    }
    
    public int pivotIndex2(int[] nums) {
        if (nums == null || nums.length < 3) {
            return -1;
        }
        
        int len = nums.length;
        
        int[] left = new int[len];
        left[0] = nums[0];
        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] + nums[i];
        }
        int[] right = new int[len];
        right[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i];
        }
        
        for (int i = 0; i < len; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }
        return -1;
    }
}
