/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Remove Duplicates from Sorted Array.
 * Given a sorted array, remove the duplicates in place such that each element 
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place 
 * with constant memory.
 * For example,
 * Given input array A = [1,1,2],
 * 
 * Your function should return length = 2, and A is now [1,2].
 * 
 * @author Johnny
 */
public class Solution026 {
    public int removeDuplicates(int[] A) {
        if (A==null||A.length==0)
            return 0;
        
        if (A.length==1)
            return 1;
        
        int i=1;
        int j=0;
        
        while(i<A.length) {
            if (A[i]!=A[j]) {
                j++;
                A[j]=A[i];                                
            }
            i++;
        }
        
        return j+1;
    }
}
