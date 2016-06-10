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
        if (nums == null || nums.length == 0) {
            return nums;
        }        
       
        //small to big
        for(int i = 0; i < nums.length; i++) {
            for (int j = nums.length -1 ; j > i; j--) { //find the smallest one
                if (nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        
        return nums;
    }  
    
    public int[] InsertSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        } 
        
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i;
            while(j > 0 && nums[j-1] > key) {
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = key;
        }
       
        return nums;
    }
    
    public int[] SelectionSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        
        for(int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            
            if (min > i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
      
        return nums;        
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

        int[] copy = Arrays.copyOf(nums, nums.length);
        
        int i = start;
        int j = mid + 1;
        for (int k = start; k <= end; k++) {
            if (i > mid) { // no item in left
                nums[k] = copy[j];
                j++;
            }
            else if(j > end) { // no item in right
                nums[k] = copy[i];
                i++;
            }
            else if (copy[i] <= copy[j]) {
                nums[k] = copy[i];
                i++;
            }
            else{
                nums[k] = copy[j];
                j++;
            }                
        }
        
        return nums;
    }    
    
    public int[] QuickSort(int[] nums, int start, int end) {
        if (nums == null || nums.length < 2 || start >= end) {
            return nums;
        }
        
        int pivot = Partition2(nums, start, end);
        nums = QuickSort(nums, start, pivot - 1);
        nums = QuickSort(nums, pivot + 1, end);

        return nums;
    }   
    
    // one way
    private int Partition(int[] nums, int start, int end) {       
        int m = start; //index of the last less value
        
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] < nums[start]) {
                m++;
                int temp = nums[m];
                nums[m] = nums[i];
                nums[i] = temp;
            }
        }
        
        int temp = nums[m];
        nums[m] = nums[start];
        nums[start] = temp;
        return m;
    }    
    
    // two ways
    private int Partition2(int[] nums, int start, int end) {
        int left = start + 1;
        int right = end;
       
        while(left < right) {
            while(left <= right && nums[left] < nums[start]) {
                left++;
            }
            while(left <= right && nums[right] > nums[start]) {
                right--;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }            
        }
        
        int temp = nums[right];
        nums[right] = nums[start];
        nums[start] = temp;
        return right;
    }  
    
    //http://www.geeksforgeeks.org/bucket-sort-2/
    //http://www.javacodex.com/Sorting/Bucket-Sort
    public int[] BucketSort(int[] nums, int maxVal) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        
        int [] bucket = new int[maxVal+1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i]]++;
        }

        int outPos=0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                nums[outPos++] = i;
            }
        }
        
        return nums;
    }
    
    public void QuickSort2(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        
        helper(nums, 0, nums.length - 1);        
    }
    
    private void helper(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = Partition3(nums, start, end);
        helper(nums, start, pivot - 1);
        helper(nums, pivot + 1, end);
    }
    
    private int Partition3(int[] nums, int start, int end) {
        int pivot = start;
        for (int i = start; i <= end; i++) {
            if (nums[i] < nums[start]) {
                pivot++;
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
            }
        }
        
        int temp = nums[start];
        nums[start] = nums[pivot];
        nums[pivot] = temp;
        
        return pivot;
    }
    
    public void MergeSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        
        mergeHelper(nums, 0, nums.length - 1);
    }
    
    private void mergeHelper(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        
        int mid = start + (end - start) / 2;
        mergeHelper(nums, start, mid);
        mergeHelper(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }
    
    private void merge(int[] nums, int start, int mid, int end) {
        int[] mergeArr = new int[nums.length];
        for (int i = start; i <= end; i++) {
            mergeArr[i] = nums[i];
        }
        
        int i = start;
        int j = mid + 1;
        int k = start;
        while (i <= mid && j <= end) {
            if (mergeArr[i] <= mergeArr[j]) {
                nums[k] = mergeArr[i];
                i++;
            } else {
                nums[k] = mergeArr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            nums[k] = mergeArr[i];
            k++;
            i++;
        }
        
        while (j <= end) {
            nums[k] = mergeArr[j];
            k++;
            j++;
        }
    }
}
