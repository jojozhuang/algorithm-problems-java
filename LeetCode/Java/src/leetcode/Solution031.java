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
    public int[] nextPermutation(int[] num) {
        //http://fisherlei.blogspot.com/2012/12/leetcode-next-permutation.html
        if (num==null||num.length==0)
            return num;
        
        int partitionindex = -1;
        int changeindex = -1;
        int i = num.length - 1;
        //find partition number which is the first descending number
        while(i>0) {
            if (num[i]>num[i-1]) {
                partitionindex = i-1;
                break;
            }
            i--;
        }
        if (partitionindex==-1) {
            return reverse(num, 0, num.length - 1);
        }
        //find the first number which is bigger than partition number
        i = num.length - 1;
        while(i>0) {
            if (num[i]>num[partitionindex]) {
                changeindex = i;
                break;
            }
            i--;
        }
        //swap
        swap(num, partitionindex, changeindex);
        //int[] leftpart = Arrays.copyOfRange(num, 0, partitionindex);
        //int[] rightpart = Arrays.copyOfRange(num, partitionindex+1, num.length - 1);
        
        return reverse(num, partitionindex+1, num.length - 1);
    }
    
    private void swap (int[] num, int i, int j) {
        int t = num[i];
        num[i] = num[j];
        num[j] = t;
      }
    
    private int[] reverse(int[] nums, int start, int end) {
        if (nums==null||nums.length==0)
            return nums;       
        
        while(start<=end) {
            swap(nums, start, end);
            start++;
            end--;
        }
        return nums;
    }
}
