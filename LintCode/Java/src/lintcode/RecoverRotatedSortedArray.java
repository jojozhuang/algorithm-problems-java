/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import java.util.ArrayList;

/**
 * Recover Rotated Sorted Array.
 * Given a rotated sorted array, recover it to sorted array in-place.
 * Clarification
 * What is rotated array?
 * 
 * For example, the orginal array is [1,2,3,4], The rotated array of it can 
 * be [1,2,3,4], [2,3,4,1], [3,4,1,2], [4,1,2,3]
 * 
 * Example
 * [4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]
 * 
 * Challenge
 * In-place, O(1) extra space and O(n) time.
 * 
 * @author Johnny
 */
public class RecoverRotatedSortedArray {
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
       if (nums == null || nums.size() == 0) {
           return;
       }
       
       int pivot = -1;
       int min = Integer.MAX_VALUE;
       for (int i = 0; i < nums.size(); i++) {
           if (nums.get(i) < min) {
               min = nums.get(i);
               pivot = i;
           }
       }
       // Rotate left part
       rotate(nums, 0, pivot - 1);
       // Rotate right part
       rotate(nums, pivot, nums.size() - 1);
       // Rotate all
       rotate(nums, 0, nums.size() - 1);
    }
    private void rotate(ArrayList<Integer> nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    private void swap(ArrayList<Integer> nums, int first, int second) {
        int temp = nums.get(first);
        nums.set(first, nums.get(second));
        nums.set(second, temp);
    }
}
