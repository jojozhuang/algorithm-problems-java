/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Next Greater Element I
 * 
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s
 * elements are subset of nums2. Find all the next greater numbers for nums1's 
 * elements in the corresponding places of nums2.
 * 
 * The Next Greater Number of a number x in nums1 is the first greater number 
 * to its right in nums2. If it does not exist, output -1 for this number.
 * 
 * Example 1:
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * Output: [-1,3,-1]
 * Explanation:
 *  For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
 *  For number 1 in the first array, the next greater number for it in the second array is 3.
 *  For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
 * 
 * Example 2:
 * Input: nums1 = [2,4], nums2 = [1,2,3,4].
 * Output: [3,-1]
 * Explanation:
 *  For number 2 in the first array, the next greater number for it in the second array is 3.
 *  For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
 * 
 * Note:
 * 1. All elements in nums1 and nums2 are unique.
 * 2. The length of both nums1 and nums2 would not exceed 1000.
 * 
 * @author Johnny
 */
public class Solution496 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        if (findNums == null || findNums.length == 0 ||
            nums == null || nums.length == 0 || findNums.length > nums.length) {
            return new int[]{};
        }
        
        Map<Integer, Integer> greaterMap = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                greaterMap.put(nums[i], -1);
            } else {
                greaterMap.put(nums[i], stack.peek());
            }
            
            stack.push(nums[i]);
        }
        
        int[] res = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            res[i] = greaterMap.get(findNums[i]);
        }
        
        return res; 
    }  
}
