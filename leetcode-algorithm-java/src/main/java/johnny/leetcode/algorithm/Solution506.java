package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Relative Ranks
 * <p>
 * Given scores of N athletes, find their relative ranks and the people with
 * the top three highest scores, who will be awarded medals: "Gold Medal",
 * "Silver Medal" and "Bronze Medal".
 * <p>
 * Example 1:
 * Input: [5, 4, 3, 2, 1]
 * Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * Explanation: The first three athletes got the top three highest scores,
 * so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 * For the left two athletes, you just need to output their relative ranks
 * according to their scores.
 * <p>
 * Note:
 * 1. N is a positive integer and won't exceed 10,000.
 * 2. All the scores of athletes are guaranteed to be unique.
 *
 * @author Johnny
 */
public class Solution506 {
    public String[] findRelativeRanks(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new String[]{};
        }

        int n = nums.length;
        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> (nums[b] - nums[a]));
        //nums:  {3,2,1,4,5}
        //index: {4,3,0,1,2}
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans[index[i]] = "Gold Medal";
            } else if (i == 1) {
                ans[index[i]] = "Silver Medal";
            } else if (i == 2) {
                ans[index[i]] = "Bronze Medal";
            } else {
                ans[index[i]] = String.valueOf(i + 1);
            }
        }

        return ans;
    }
}
