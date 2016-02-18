/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 * All popular sorting algorithms.
 * 1. Bubble
 * 2. Insertion
 * 3. Selection
 * 4. Shell
 * 5. Heap
 * 6. Merge
 * 7. Quick
 * @author Johnny
 */
public class AllSorting {
    public int[] BubbleSort(int[] nums) {
        if (nums==null||nums.length==0)
            return nums;
        
        int[] ret;
        int i;
        int j;
        int temp;
        
        //small to big
        for(i=0; i<nums.length; i++) {
            for (j=nums.length-1; j>i; j--) { //find the smallest one
                if (nums[j]<nums[j-1]) {
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        
        ret = nums;
        
        return ret;
    }  
    
    public int[] InsertSort(int[] nums) {
        if (nums==null||nums.length<2)
            return nums;
        
        int[] ret;
        int i;
        int j;
        int key;
        for (i=1; i<nums.length; i++) {
            key = nums[i];
            j = i;
            while(j>0&&nums[j-1]>key) {
                nums[j] = nums[j-1];
                j--;
            }
            nums[j]=key;
        }
        
        ret=nums;
        
        return ret;
    }
    
    public int[] SelectionSort(int[] nums) {
        if (nums==null||nums.length<2)
            return nums;
        
        int[] ret;
        int min;
        for(int i=0; i<nums.length; i++) {
            min = i;
            for (int j=i+1; j<nums.length; j++) {
                if (nums[j]<nums[min]) {
                    min = j;
                }
            }
            
            if (min > i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
        
        ret = nums;
        
        return ret;        
    }
    
    public int[] MergeSort(int[] nums, int start, int end) {
        if (nums == null || nums.length < 2 || start >= end) {
            return nums;
        }
        
        int mid = 0;
        
        mid = start + (end - start) / 2;
        nums = MergeSort(nums, start, mid);
        nums = MergeSort(nums, mid + 1, end);
        nums = Merge(nums, start, mid, end);
        
        return nums;
    }
    
    private int[] Merge(int[] nums, int start, int mid, int end) {
        int left = mid - start + 1;
        int right = end - mid;
        
        int[] ret;
        int[] leftNums = Arrays.copyOfRange(nums, start, mid+1);
        int[] rightNums = Arrays.copyOfRange(nums, mid+1, end+1);
        
        int i=0;
        int j=0;
        for (int k = start; k <= end; k++) {
            if (i >= left) {
                nums[k] = rightNums[j];
                j++;
            }
            else if(j >= right) {
                nums[k] = leftNums[i];
                i++;
            }
            else if (leftNums[i] <= rightNums[j]) {
                nums[k] = leftNums[i];
                i++;
            }
            else{
                nums[k] = rightNums[j];
                j++;
            }                
        }
        
        ret = nums;
        return ret;
    }    
    
    public int[] QuickSort(int[] nums, int start, int end) {
        if (nums == null || nums.length < 2 || start >= end) {
            return nums;
        }
        
        int pivot = Partition(nums, start, end);
        nums = QuickSort(nums, start, pivot - 1);
        nums = QuickSort(nums, pivot + 1, end);

        return nums;
    }   
    
    private int Partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        
        int i = start - 1;
        int j;
        int temp;
        for (j = start; j < end; j++) {
            if (nums[j] <= pivot) {
                i = i + 1;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        temp = nums[i + 1];
        nums[i + 1] = pivot;
        nums[end] = temp;
        return i + 1;
    }    
}
