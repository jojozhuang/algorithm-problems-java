package johnny.leetcode.algorithm;

/**
 * Missing Number.
 * 
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
 * the one that is missing from the array.
 * 
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * 
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement 
 * it using only constant extra space complexity?
 * 
* 
 * @author Johnny
 */
public class Solution268 {
    // swap, check position
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                continue;
            }
            int index = i;
            while (nums[index] != i && nums[index] < nums.length) {
                int temp = nums[nums[index]];
                nums[nums[index]] = nums[index];
                nums[index] = temp;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        
        return nums[nums.length-1] + 1;
    }
    
    // sum, math formula
    public int missingNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        return len * (len + 1) / 2 - sum;
    }
    
    // xor
    public int missingNumber3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= (i + 1) ^ nums[i];
        }
        return res;
    }
}
