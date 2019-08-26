package johnny.leetcode.algorithm;

/**
 * Next Permutation.
 * Implement next permutation, which rearranges numbers into the 
 * lexicographically next greater permutation of numbers.
 * 
 * If such arrangement is not possible, it must rearrange it as the lowest 
 * possible order (ie, sorted in ascending order).
 * 
 * The replacement must be in-place, do not allocate extra memory.
 * 
 * Here are some examples. Inputs are in the left-hand column and its 
 * corresponding outputs are in the right-hand column.
 * 
 * 1,2,3 -> 1,3,2
 * 3,2,1 -> 1,2,3
 * 1,1,5 -> 1,5,1
 * 
 * @author Johnny
 */
public class Solution031 {
    //http://fisherlei.blogspot.com/2012/12/leetcode-next-permutation.html
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }
    public void nextPermutation2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        // find the partition number from right to left
        int partition = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                partition = i - 1;
                break;
            }
        }
        
        // swap
        if (partition == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
            
        int firstbig = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[partition]) {
                firstbig = i;
                break;
            }
        }
        //swap
        swap(nums, partition, firstbig);
            
        reverse(nums, partition + 1, nums.length - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        int i = start, j = end;
        while(i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
