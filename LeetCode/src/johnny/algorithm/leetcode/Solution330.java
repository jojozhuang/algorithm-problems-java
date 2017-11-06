/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Patching Array.
 * 
 * Given a sorted positive integer array nums and an integer n, add/patch elements
 * to the array such that any number in range [1, n] inclusive can be formed by
 * the sum of some elements in the array. Return the minimum number of patches required.
 * 
 * Example 1:
 * nums = [1, 3], n = 6
 * Return 1. 
 * Combinations of nums are [1], [3], [1,3], which form possible sums of: 1, 3, 4.
 * Now if we add/patch 2 to nums, the combinations are: [1], [2], [3], [1,3], [2,3], [1,2,3].
 * Possible sums are 1, 2, 3, 4, 5, 6, which now covers the range [1, 6].
 * So we only need 1 patch.
 * 
 * Example 2:
 * nums = [1, 5, 10], n = 20
 * Return 2.
 * The two patches can be [2, 4].
 * 
 * Example 3:
 * nums = [1, 2, 2], n = 5
 * Return 0.
 * 
 * @author Johnny
 */
public class Solution330 {
    //https://www.hrwhisper.me/leetcode-patching-array/
    //http://www.cnblogs.com/grandyang/p/5165821.html
    public int minPatches2(int[] nums, int n) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int res = 0;
        int i = 0;
        for(long known_sum = 1; known_sum <= n;){
            if(i < nums.length && known_sum >= nums[i]){
                known_sum += nums[i++];
            }else{
                known_sum <<= 1;
                res++;
            }
        }
        return res;
    }
    public int minPatches(int[] nums, int n) {
        if (nums == null) {
            return 0;
        }
        
        int res = 0;
        long miss = 1; //must be long, overflow
        int i = 0;
        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                miss += nums[i++];
            } else {
                miss <<= 1;
                res++;
            }
        }
        return res;
    }
}
