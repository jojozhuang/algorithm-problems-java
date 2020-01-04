package johnny.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Single Number.
 * Given an array of integers, every element appears twice except for one.
 * Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 *
 * @author Johnny
 */
public class Solution136 {
    // Bit Manipulation 
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }

    // Math
    // 2∗(a+b+c)−(a+a+b+b+c)=c
    public int singleNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<Integer>();
        int sum = 0;
        for (int i : nums) {
            set.add(i);
            sum += i;
        }
        int uniSum = 0;
        for (Integer unique : set) {
            uniSum += unique;
        }

        return 2 * uniSum - sum;
    }
}
