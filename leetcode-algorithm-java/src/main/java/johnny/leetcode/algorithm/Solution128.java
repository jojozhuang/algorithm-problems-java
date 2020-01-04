package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Longest Consecutive Sequence.
 * Given an unsorted array of integers, find the length of the longest
 * consecutive elements sequence.
 * <p>
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * <p>
 * Your algorithm should run in O(n) complexity.
 *
 * @author Johnny
 */
public class Solution128 {
    //http://www.geeksforgeeks.org/longest-consecutive-subsequence/
    public int longestConsecutive2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            // check if the current one is the head
            if (!set.contains(nums[i] - 1)) { // no smaller, so it is head
                int j = 1;
                // find the sequence
                while (set.contains(nums[i] + j)) {
                    j++;
                }

                if (j >= n) {
                    return n;
                }

                max = Math.max(max, j);
            }
        }

        return max;
    }

    // Stack
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    currentStreak += 1;
                } else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        return Math.max(longestStreak, currentStreak);
    }
}
