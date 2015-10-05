/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Rotate Array.
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated 
 * to [5,6,7,1,2,3,4].
 * 
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different 
 * ways to solve this problem.
 * 
 * @author Johnny
 */
public class Solution189 {
    public int[] rotate(int[] nums, int k) {
        if (nums==null||nums.length==0)
            return nums;
        
        if (k<=0 || k>=nums.length)
            return nums;
        
        int[] ret = new int[nums.length];
        
        int i=0;
        int j=k;
        while(j>0) {
            ret[i] = nums[nums.length-j];
            i++;
            j--;
        }
        
        j= 0;
        while(j<nums.length-k) {
            ret[i] = nums[j];
            i++;
            j++;
        }
        
        return ret;        
        
    }
    
    public void rotate2(int[] nums, int k) {
        if (nums==null||nums.length==0)
            return;
        
        if (k<=0 || k>=nums.length)
            return;
        
        int[] ret = new int[nums.length];
        
        int i=0;
        int j=k;
        while(j>0) {
            ret[i] = nums[nums.length-j];
            i++;
            j--;
        }
        
        j= 0;
        while(j<nums.length-k) {
            ret[i] = nums[j];
            i++;
            j++;
        }
        
        nums = ret;        
        
    }
}
