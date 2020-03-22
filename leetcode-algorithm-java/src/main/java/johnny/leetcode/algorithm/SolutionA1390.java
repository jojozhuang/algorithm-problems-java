package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1390. Four Divisors
 *
 * Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors.
 *
 * If there is no such integer in the array, return 0.
 *
 * Example 1:
 * Input: nums = [21,4,7]
 * Output: 32
 * Explanation:
 * 21 has 4 divisors: 1, 3, 7, 21
 * 4 has 3 divisors: 1, 2, 4
 * 7 has 2 divisors: 1, 7
 * The answer is the sum of divisors of 21 only.
 *
 * Constraints:
 *
 * 1 <= nums.length <= 10^4
 * 1 <= nums[i] <= 10^5
 */
public class SolutionA1390 {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            List<Integer> divs = helper(nums[i]);
            for (Integer v : divs) {
                sum += v;
            }
        }

        return sum;
    }

    private List<Integer> helper(int num) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                set.add(i);
                set.add(num/i);
            }
        }

        if (set.size() == 4) {
            return new ArrayList<>(set);
        } else {
            return new ArrayList<>();
        }
    }
}
