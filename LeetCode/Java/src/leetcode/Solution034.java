/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Search for a Range.
 * Given a sorted array of integers, find the starting and ending position of 
 * a given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 * 
 * @author Johnny
 */
public class Solution034 {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }
        
        int startIndex = -1;
        int endIndex = -1;
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        
        while(start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                startIndex = mid;
                endIndex = mid;
                // find the same value on the left side
                while(startIndex > 0) {
                    if (nums[startIndex - 1] == nums[startIndex]) {
                        startIndex--;
                    }
                    else {
                        break;
                    }
                }
                // find the same value on the right side
                while(endIndex < nums.length - 1) {
                    if (nums[endIndex] == nums[endIndex + 1]) {
                        endIndex++;
                    }
                    else {
                        break;
                    }
                }
                return new int[] { startIndex, endIndex };
            }
            else if (nums[mid] < target) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        if (nums[start] == target) {
            startIndex = start;
            endIndex = start;
        }
        
        if (nums[end] == target) {
            endIndex = end;
            if (startIndex == -1) {
                startIndex = end;
            }
        }
        
        return new int[] { startIndex, endIndex };
        
    }
    /*
    public int[] searchRange(int[] A, int target) {
        int start = -1;
        int end = -1;
        
        if (A==null||A.length==0)
            return new int[]{start,end};
        
        if (A.length == 1) {
            if (A[0]==target)
                return new int[]{0,0};
            else
                return new int[]{start,end};
        }
        
        int left=0;
        int right=A.length-1;
        int mid;
        int i;
        
        while(left<=right) {
            mid = (left+right)/2;
            if (A[mid]<target) {
                left = mid + 1;
            }
            else if(A[mid]>target) {
                right = mid - 1;
            }
            else {                
                start = mid;
                end = mid;
                i = mid-1;
                while(i>=0) {
                    if (A[i]==target) {
                        start = i;
                        i--;
                    }
                    else
                        break;
                }
                i = mid + 1;
                while(i<A.length) {
                    if (A[i]==target) {
                        end = i;
                        i++;
                    }
                    else
                        break;
                }
                break;
            }
        }
        
        if (start>-1 && end >-1)
            return new int[]{start,end};
        else if (start>-1 && end ==-1)
            return new int[]{start,start};
        else if (start==-1 && end >-1)
            return new int[]{end,end};
        else
            return new int[]{start,end};
    }*/
}
