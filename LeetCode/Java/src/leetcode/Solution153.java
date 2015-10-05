/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Find Minimum in Rotated Sorted Array.
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * 
 * You may assume no duplicate exists in the array.
 * 
 * @author Johnny
 */
public class Solution153 {
    public int findMin(int[] num) {
        if (num == null || num.length == 0) {
            return -1;
        }
        
        int start = 0;
        int end = num.length - 1;
        int mid = 0;
        
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (num[mid] > num[end]) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        if (num[start] > num[end]) {
            return num[end];
        }
        else {
            return num[start];
        }        
    }
}
