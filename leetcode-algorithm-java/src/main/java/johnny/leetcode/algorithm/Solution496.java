package johnny.leetcode.algorithm;

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
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        
        return ans;
    }
    
    /* next larger at right side
       input:  [1,3, 4, 2]
       output: [3,4,-1,-1]
    */
    public int[] nextRightLarge(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<Integer>(); // keep ascending order for the elements at right side
        
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                stack.pop();
            }
           
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            
            stack.push(nums[i]);
        }
        
        return res;
    }
    
    /* next smaller at right side
       input:  [1,3, 4, 2]
       output: [-1,2,2,-1]
    */
    public int[] nextRightSmall(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<Integer>(); // keep descending order for the elements at right side
        
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] < stack.peek()) {
                stack.pop();
            }
           
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            
            stack.push(nums[i]);
        }
        
        return res;
    }
    
    /* next larger at left side
       input:  [1, 3, 4, 2]
       output: [-1,-1,-1,4]
    */
    public int[] nextLeftLarge(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<Integer>(); // keep descending order for the elements at right side
        
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                stack.pop();
            }
           
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            
            stack.push(nums[i]);
        }
        
        return res;
    }

    /* next smaller at left side
       input:  [1, 3,4,2]
       output: [-1,1,3,1]
    */
    public int[] nextLeftSmall(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<Integer>(); // keep ascending order for the elements at right side
        
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] < stack.peek()) {
                stack.pop();
            }
           
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            
            stack.push(nums[i]);
        }
        
        return res;
    }
}
