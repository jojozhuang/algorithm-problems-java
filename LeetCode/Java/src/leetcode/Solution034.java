/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Search for a Range.
 * Given a sorted array of integers, find the starting and ending position of 
 * a given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 * 
 * @author Johnny
 */
public class Solution034 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                res[0] = mid;
                res[1] = mid;
                // find the same value on the left side
                while(res[0] > 0) {
                    if (nums[res[0] - 1] != nums[res[0]]) {
                        break;
                    }
                    res[0]--;                    
                }
                // find the same value on the right side
                while(res[1] < nums.length - 1) {
                    if (nums[res[1]] != nums[res[1] + 1]) {
                        break;
                    }
                    res[1]++;
                }
                return res;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (nums[start] == target) {
            res[0] = start;
            res[1] = start;
        }
        
        if (nums[end] == target) {
            res[1] = end;
            if (res[0] == -1) {
                res[0] = end;
            }
        }
        
        return res;
    }
}
