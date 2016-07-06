/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 * Next Permutation.
 * Implement next permutation, which rearranges numbers into the 
 * lexicographically next greater permutation of numbers.
 * 
 * If such arrangement is not possible, it must rearrange it as the lowest 
 * possible order (ie, sorted in ascending order).
 * 
 * The replacement must be in-place, do not allocate extra memory.
 * 
 * Here are some examples. Inputs are in the left-hand column and its 
 * corresponding outputs are in the right-hand column.
 * 
 * 1,2,3 -> 1,3,2
 * 3,2,1 -> 1,2,3
 * 1,1,5 -> 1,5,1
 * 
 * @author Johnny
 */
public class Solution031 {
    //http://fisherlei.blogspot.com/2012/12/leetcode-next-permutation.html
    public void nextPermutation(int[] nums) {        
        if (nums == null || nums.length == 0) {
            return;
        }
        
        // find the partition number from right to left
        int partition = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                partition = i - 1;
                break;
            }
        }
        
        // swap
        if (partition == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
            
        int firstbig = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[partition]) {
                firstbig = i;
                break;
            }
        }
        //swap
        swap(nums, partition, firstbig);
            
        reverse(nums, partition + 1, nums.length - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        if (nums == null || nums.length == 0 || end <= start) {
            return;
        }
        
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
