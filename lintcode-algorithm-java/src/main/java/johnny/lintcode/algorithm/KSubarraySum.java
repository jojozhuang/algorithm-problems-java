package johnny.lintcode.algorithm;

import java.util.ArrayList;

/**
 * Subarray Sum K.
 * <p>
 * Given an nonnegative integer array, find a subarray where the sum of numbers is k.
 * Your code should return the index of the first number and the index of the last number.
 * <p>
 * Example
 * Given [1, 4, 20, 3, 10, 5], sum k = 33, return [2, 4].
 * <p>
 * http://algorithm.yuanbin.me/zh-hans/integer_array/subarray_sum_k.html
 *
 * @author Johnny
 */
public class KSubarraySum {
    // two pointers
    public ArrayList<Integer> subarraySum2(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        ArrayList<Integer> ret = new ArrayList<Integer>();

        int slow = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum == k) {
                ret.add(slow);
                ret.add(i);
                break;
            } else if (sum < k) {
                continue;
            } else {
                //move slow ahead
                while (sum > k) {
                    sum = sum - nums[slow];
                    slow = slow + 1;
                }
                if (sum == k) {
                    ret.add(slow);
                    ret.add(i);
                    break;
                }
            }
        }

        return ret;
    }
}
