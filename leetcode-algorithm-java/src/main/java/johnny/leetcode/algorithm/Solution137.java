package johnny.leetcode.algorithm;

/**
 * Single Number II.
 * Given an array of integers, every element appears three times except for one.
 * Find that single one.
 * 
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement 
 * it without using extra memory?
 * 
 * @author Johnny
 */
public class Solution137 {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for(int j = 0; j < nums.length; j++) {
                sum += (nums[j] >> i) & 1;
            }
            result |= (sum % 3) << i;
        }
        
        return result;
    }
    //http://fisherlei.blogspot.com/2013/11/leetcode-single-number-ii-solution.html
    public int singleNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int[] count = new int[32];
        int result = 0;
        for (int i = 0; i < 32; i++) {
            for(int j = 0; j < nums.length; j++) {
                count[i] += (nums[j] >> i) & 1;
            }
            result |= (count[i] % 3) << i;
        }
        
        return result;
    }
}
