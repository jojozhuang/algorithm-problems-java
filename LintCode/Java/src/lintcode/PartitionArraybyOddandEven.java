/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

/**
 * Partition Array by Odd and Even.
 * 
 * Partition an integers array into odd number first and even number second.
 * 
 * Example
 * Given [1, 2, 3, 4], return [1, 3, 2, 4]
 * 
 * Challenge
 * Do it in-place.
* 
 * @author Johnny
 */
public class PartitionArraybyOddandEven {
    public void partitionArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end) {
            if (nums[start] % 2 == 1) {
                start++;
                continue;
            }
            if (nums[end] % 2 == 0) {
                end--;
                continue;
            }
            if (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }
}
