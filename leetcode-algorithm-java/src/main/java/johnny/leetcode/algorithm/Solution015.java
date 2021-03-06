package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum.
 * Given an array S of n integers, are there elements a, b, c in S such that
 * a + b + c = 0? Find all unique triplets in the array which gives the sum of
 * zero.
 * <p>
 * Note:
 * 1. Elements in a triplet (a,b,c) must be in non-descending order.
 * (ie, a ≤ b ≤ c)
 * 2. The solution set must not contain duplicate triplets.
 * For example, given array S = {-1 0 1 2 -1 -4},
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 *
 * @author Johnny
 */
public class Solution015 {
    //http://www.programcreek.com/2012/12/leetcode-3sum/
    //List<List<Integer>>, O(n^2)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (nums == null || nums.length < 3) {
            return res;
        }

        //sort array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            //avoid duplicate solutions
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                long sum = (long) nums[start] + (long) nums[end] + (long) nums[i];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));

                    start++;
                    end--;
                    //avoid duplicate solutions
                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return res;
    }
}
