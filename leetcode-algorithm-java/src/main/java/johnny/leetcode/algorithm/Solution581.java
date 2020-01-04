package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * Shortest Unsorted Continuous Subarray
 * <p>
 * Given an integer array, you need to find one continuous subarray that if you
 * only sort this subarray in ascending order, then the whole array will be
 * sorted in ascending order, too.
 * <p>
 * You need to find the shortest such subarray and output its length.
 * <p>
 * Example 1:
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 * <p>
 * Note:
 * 1. Then length of the input array is in range [1, 10,000].
 * 2. The input array may contain duplicates, so ascending order here means <=.
 *
 * @author Johnny
 */
public class Solution581 {
    // find min and max, two pointers, O(n)
    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])
                flag = true;
            if (flag)
                min = Math.min(min, nums[i]);
        }
        flag = false;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1])
                flag = true;
            if (flag)
                max = Math.max(max, nums[i]);
        }
        int l, r;
        for (l = 0; l < nums.length; l++) {
            if (min < nums[l])
                break;
        }
        for (r = nums.length - 1; r >= 0; r--) {
            if (max > nums[r])
                break;
        }
        return r - l < 0 ? 0 : r - l + 1;
    }

    // Sorting, nlog(n)
    public int findUnsortedSubarray2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] clone = nums.clone();
        Arrays.sort(clone);

        int start = 0;
        int end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == clone[i]) {
                start++;
            } else {
                break;
            }
        }
        for (int i = nums.length - 1; i > start; i--) {
            if (nums[i] == clone[i]) {
                end--;
            } else {
                break;
            }
        }

        return end - start + 1;
    }
}
