/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Search Insert Position.
 * Given a sorted array and a target value, return the index if the target is 
 * found. If not, return the index where it would be if it were inserted in 
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples.
 * [1,3,5,6], 5 -> 2
 * [1,3,5,6], 2 -> 1
 * [1,3,5,6], 7 -> 4
 * [1,3,5,6], 0 -> 0
 
 * @author Johnny
 */
public class Solution035 {
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0) {
            return 0;
        }
        
        int start = 0;
        int end = A.length - 1;
        int mid = 0;
        
        while(start + 1 < end) {
            mid = start + (end - start) / 2;
            if (A[mid] == target) {
                return mid;
            }
            else if (A[mid] < target) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        if (A[start] >= target){
            return 0;
        }
        
        if (A[end] < target){
            return end + 1;
        }
        else{
            return end;
        }
    }
    /*
    public int searchInsert(int[] A, int target) {
        if (A==null||A.length==0)
            return 0;
        
        int left = 0;
        int right = A.length - 1;
        int mid;
        int ret = 0;
        boolean frombig=false; //false:small->big; true:big->small
        
        if(A[0]>target)
            return 0;
        else if (A[A.length-1]<target)
            return A.length;
        else {        
            while(left<=right) {
                mid = (left+right)/2;
                if (A[mid]<target) {
                    left = mid + 1;                   
                    ret = left;
                    frombig = false;
                }
                else if(A[mid]>target) {
                    right = mid - 1;
                    if (!frombig)
                        ret = left;
                    else
                        ret = right;
                    frombig = true;
                }
                else {
                    ret = mid;
                    break;
                }
            }
        }
        
        return ret;
    }*/
}
