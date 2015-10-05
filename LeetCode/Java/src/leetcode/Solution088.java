/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Merge Sorted Array.
 * 
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * Note:
 * You may assume that A has enough space (size that is greater or equal 
 * to m + n) to hold additional elements from B. The number of elements 
 * initialized in A and B are m and n respectively.
* 
 * @author Johnny
 */
public class Solution088 {
    public int[] merge2(int A[], int m, int B[], int n) {
        if(A == null || A.length == 0)
            return B;
        if(B == null || B.length == 0)
            return A;
        
        int i = m-1;
        int j = B.length-1;
        int k = m + n - 1;
        while(k>=0&&i>=0&&j>=0) {
            if (A[i]>B[j]) {
                A[k] = A[i];
                i--;
                if (k==i-1)
                    break;
            }
            else {
                A[k] = B[j];
                j--;
            }
            k--;
        }
        
        if (i<0&&j>=0) {
            for (int p = j; p>=0; p--) {
                A[k]=B[p];
                k--;
            }
        }
        
        return A;
    }
    
    public void merge(int A[], int m, int B[], int n) {
        
        int i = m-1;
        int j = B.length-1;
        int k = m + n - 1;
        while(k>=0&&i>=0&&j>=0) {
            if (A[i]>B[j]) {
                A[k] = A[i];
                i--;
                if (k==i-1)
                    break;
            }
            else {
                A[k] = B[j];
                j--;
            }
            k--;
        }
        
        if (i<0&&j>=0) {
            for (int p = j; p>=0; p--) {
                A[k]=B[p];
                k--;
            }
        }
               
    }
}
