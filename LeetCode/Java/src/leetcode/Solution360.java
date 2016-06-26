/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 * Sort Transformed Array.
 * Given a sorted array of integers nums and integer values a, b and c. Apply a 
 * function of the form f(x) = ax2 + bx + c to each element x in the array.
 * 
 * The returned array must be in sorted order.
 * 
 * Expected time complexity: O(n)
 * 
 * Example:
 * nums = [-4, -2, 2, 4], a = 1, b = 3, c = 5,
 * 
 * Result: [3, 9, 15, 33]
 * 
 * nums = [-4, -2, 2, 4], a = -1, b = 3, c = 5
 * 
 * Result: [-23, -5, 1, 7]
 * 
 * @author Johnny
 */
public class Solution360 {
    // o(n)
    //https://leetcode.com/discuss/108831/java-o-n-incredibly-short-yet-easy-to-understand-ac-solution
    //http://www.cnblogs.com/grandyang/p/5595614.html
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        int n = nums.length;
        int[] sorted = new int[n];
        int i = 0, j = n - 1;
        int index = a >= 0 ? n - 1 : 0;
        while (i <= j) {
            if (a >= 0) {
                sorted[index--] = quad(nums[i], a, b, c) >= quad(nums[j], a, b, c) ? quad(nums[i++], a, b, c) : quad(nums[j--], a, b, c);
            } else {
                sorted[index++] = quad(nums[i], a, b, c) >= quad(nums[j], a, b, c) ? quad(nums[j--], a, b, c) : quad(nums[i++], a, b, c);
            }
        }
        return sorted;
    }
    private int quad(int x, int a, int b, int c) {
        return a * x * x + b * x + c;
    }
    // naive, nlog(n)
    public int[] sortTransformedArray2(int[] nums, int a, int b, int c) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = a * nums[i] * nums[i] + b * nums[i] + c;
        }
        
        Arrays.sort(res);
        
        return res;
    }
    
    
}
