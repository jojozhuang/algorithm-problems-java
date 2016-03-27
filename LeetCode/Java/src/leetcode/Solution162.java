/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Find Peak Element.
 * A peak element is an element that is greater than its neighbors.
 * 
 * Given an input array where num[i] ≠ num[i+1], find a peak element and 
 * return its index.
 * 
 * The array may contain multiple peaks, in that case return the index to any 
 * one of the peaks is fine.
 * 
 * You may imagine that num[-1] = num[n] = -∞.
 * 
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function 
 * should return the index number 2.
 * 
 * click to show spoilers.
 * 
 * Note:
 * Your solution should be in logarithmic complexity.
 * 
 * @author Johnny
 */
public class Solution162 {
    public int findPeakElement(int[] num) {
        if (num == null || num.length == 0) {
            return -1;
        }
        
        int start = 0;
        int end = num.length - 1;
        
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (num[mid] > num[mid - 1] && num[mid] > num[mid + 1]) {
                return mid;
            } else if (num[mid] < num[mid - 1]){
                end = mid;
            } else {
                start = mid;
            }
        }
        
        return num[start] > num[end] ? start : end;
    }
}
