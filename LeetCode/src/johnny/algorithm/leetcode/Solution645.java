package johnny.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Set Mismatch
 * The set S originally contains numbers from 1 to n. But unfortunately, due to 
 * the data error, one of the numbers in the set got duplicated to another 
 * number in the set, which results in repetition of one number and loss of another number.
 * 
 * Given an array nums representing the data status of this set after the error. 
 * Your task is to firstly find the number occurs twice and then find the number 
 * that is missing. Return them in the form of an array.
 * 
 * Example 1:
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 * 
 * Note:
 * The given array size will in the range [2, 10000].
 * The given array's numbers won't have any order.
 * 
 * @author Johnny
 */
public class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int[] bucket = new int[nums.length];
        int dup = -1;
        int missing = -1;
        for (int num : nums) {
            if (bucket[num - 1] != 0) {
                dup = num;
            }
            bucket[num - 1] = num;
        }
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] == 0) {
                missing = i + 1;
            }
        }
        
        return new int[]{dup, missing};
    }
    
    public int[] findErrorNums2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[2];
        }
        
        int len = nums.length;
        int duplicate = 0;
        int sum = 0;
        
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if (set.contains(nums[i])) {
                duplicate = nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        
        int delta = len * (len + 1) / 2 - sum;
                
        return new int[]{duplicate, duplicate + delta};
    }
}
