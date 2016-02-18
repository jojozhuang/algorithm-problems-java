/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Remove Duplicates from Sorted Array II.
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * 
 * For example,
 * Given sorted array A = [1,1,1,2,2,3],
 * 
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 * 
 * @author Johnny
 */
public class Solution080 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int fast = 1;
        int slow = 0;
        int duplicate = 1;
        
        while(fast < nums.length) {
            if (nums[fast] == nums[slow]) {
                if (duplicate < 2) {  
                    slow++;
                    nums[slow] = nums[fast];                    
                }
                duplicate++;
            }
            else {
                slow++;
                nums[slow] = nums[fast];               
                duplicate = 1;                
            }
            fast++;
        }
        
        return slow + 1;
    }
}
