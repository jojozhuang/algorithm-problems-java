package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * 719. Find K-th Smallest Pair Distance
 * Given an integer array, return the k-th smallest distance among all the pairs. The distance of a pair (A, B) is defined as the absolute difference between A and B.
 * <p>
 * Example 1:
 * Input:
 * nums = [1,3,1]
 * k = 1
 * Output: 0
 * Explanation:
 * Here are all the pairs:
 * (1,3) -> 2
 * (1,1) -> 0
 * (3,1) -> 2
 * Then the 1st smallest distance pair is (1,1), and its distance is 0.
 * Note:
 * 2 <= len(nums) <= 10000.
 * 0 <= nums[i] < 1000000.
 * 1 <= k <= len(nums) * (len(nums) - 1) / 2.
 *
 * @author Johnny
 */
public class Solution719 {
    private int countPairs(int[] a, int mid) {
        int n = a.length, res = 0;
        for (int i = 0; i < n; ++i) {
            int j = i;
            while (j < n && a[j] - a[i] <= mid) j++;
            res += j - i - 1;
        }
        return res;
    }

    public int smallestDistancePair(int a[], int k) {
        int n = a.length;
        Arrays.sort(a);

        // Minimum absolute difference
        int low = a[1] - a[0];
        for (int i = 1; i < n - 1; i++)
            low = Math.min(low, a[i + 1] - a[i]);

        // Maximum absolute difference
        int high = a[n - 1] - a[0];

        // Do binary search for k-th absolute difference
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (countPairs(a, mid) < k)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }
}
