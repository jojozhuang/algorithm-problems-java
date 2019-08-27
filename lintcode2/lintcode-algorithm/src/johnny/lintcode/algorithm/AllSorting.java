package johnny.lintcode.algorithm;

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
    
    public int[] MergeSort(int[] nums, int from, int to) {
        if (nums==null||nums.length<2)
            return nums;
        
        if (from == to)
            return nums;
        
        int[] ret;
        int mid = 0;
        
        if (from < to) {
            mid = (from + to) / 2;
            nums = MergeSort(nums, from, mid);
            nums = MergeSort(nums, mid+1, to);
            nums = Merge(nums, from, mid, to);
        }
        
        ret = nums;
        return ret;
    }
    
    private int[] Merge(int[] nums, int from, int mid, int to) {
        int left = mid - from + 1;
        int right = to - mid;
        
        int[] ret;
        int[] leftNums = Arrays.copyOfRange(nums, from, mid+1);
        int[] rightNums = Arrays.copyOfRange(nums, mid+1, to+1);
        
        int i=0;
        int j=0;
        int k=0;
        for (k=from; k<=to; k++) {
            if (i>=left) {
                nums[k] = rightNums[j];
                j++;
            }
            else if(j>=right) {
                nums[k] = leftNums[i];
                i++;
            }
            else if (leftNums[i]<=rightNums[j]) {
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
    
    public int[] QuickSort(int[] nums, int from, int to) {
        if (nums==null||nums.length<2)
            return nums;
        
        if (from>=to)
            return nums;
        
        int[] ret;
        int q;
        if (from<to) {
            q = Partition(nums, from, to);
            nums = QuickSort(nums, from, q-1);
            nums = QuickSort(nums, q+1, to);
        }
        
        ret = nums;
        return ret;
    }   
    
    private int Partition(int[] nums, int from, int to) {
        int pivot = nums[to];
        
        int i=from-1;
        int j;
        int temp;
        for (j=from; j<to; j++) {
            if (nums[j]<=pivot) {
                i=i+1;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        temp = nums[i+1];
        nums[i+1] = pivot;
        nums[to] = temp;
        return i+1;
    }    
}
