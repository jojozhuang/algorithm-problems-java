package johnny.algorithm.leetcode;

import java.util.Arrays;

/**
 * All popular sorting algorithms.
 * 1. Bubble
 * 2. Insertion
 * 3. Shell
 * 4. Selection
 * 5. Heap
 * 6. Merge
 * 7. Quick
 * @author Johnny
 */
public class AllSorting {
    public int[] bubbleSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }        
       
        for(int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        
        return nums;
    }  
    
    public int[] insertionSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        } 
        
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i;
            while (j > 0 && nums[j - 1] > key) {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = key;
        }
       
        return nums;
    }
    
    public int[] shellSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        } 
        
        for (int gap = nums.length/2; gap > 0; gap = gap/2) {
            for (int i = gap; i < nums.length; i++) {
                int temp = nums[i];
                int j;
                for (j = i; j >= gap && nums[j - gap] > temp; j = j-gap) {
                    nums[j] = nums[j - gap];
                }
                nums[j] = temp;
            }
        }
       
        return nums;
    }
    
    public int[] selectionSort(int[] nums) {
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
    
    public int[] heapSort(int nums[]) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
 
        // Build heap (rearrange array)
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            heapify(nums, nums.length, i);
        }
 
        // One by one extract an element from heap
        for (int i= nums.length-1; i>=0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
 
            heapify(nums, i, 0);
        }
        
        return nums;
    }
 
    private void heapify(int nums[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2
 
        if (l < n && nums[l] > nums[largest]) {
            largest = l;
        }
 
        if (r < n && nums[r] > nums[largest]) {
            largest = r;
        }
 
        // If largest is not root
        if (largest != i) {
            int swap = nums[i];
            nums[i] = nums[largest];
            nums[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(nums, n, largest);
        }
    }
    
    public int[] mergeSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        mergeHelper(nums, 0, nums.length - 1);
        return nums;
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
        int[] copy = Arrays.copyOf(nums, nums.length);
        
        int left = start;
        int right = mid + 1;
        for (int k = start; k <= end; k++) {
            if (left > mid) { // no item at left
                nums[k] = copy[right];
                right++;
            }
            else if(right > end) { // no item at right
                nums[k] = copy[left];
                left++;
            }
            else if (copy[left] <= copy[right]) {
                nums[k] = copy[left];
                left++;
            }
            else{
                nums[k] = copy[right];
                right++;
            }
        }
    }
    
    // less space
    private void merge2(int[] nums, int start, int mid, int end) {
        int[] copy = Arrays.copyOfRange(nums, start, end + 1);
        
        int left = start;
        int right = mid + 1;
        for (int i = start; i <= end; i++) {
            if (left > mid) { // no item at left
                nums[i] = copy[right - start];
                right++;
            }
            else if(right > end) { // no item at right
                nums[i] = copy[left - start];
                left++;
            }
            else if (copy[left - start] <= copy[right - start]) {
                nums[i] = copy[left - start];
                left++;
            }
            else{
                nums[i] = copy[right - start];
                right++;
            }
        }
    }
    
    public void merge3(int[] nums, int start, int mid, int end) {
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
    
    public int[] quickSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        quickHelper(nums, 0, nums.length - 1);
        return nums;
    }
    
    private void quickHelper(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        
        int pivot = partition(nums, start, end);
        quickHelper(nums, start, pivot - 1);
        quickHelper(nums, pivot + 1, end);
    }   
    
    // one way
    private int partition(int[] nums, int start, int end) {
        int pivot = start; // select the first as the pivot
        
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] < nums[start]) {
                pivot++;
                int temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;
            }
        }
        
        int temp = nums[pivot];
        nums[pivot] = nums[start];
        nums[start] = temp;
        return pivot;
    }
    
    // two ways
    public int Partition2(int[] nums, int start, int end) {
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
    public int[] bucketSort(int[] nums, int maxVal) {
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
}
