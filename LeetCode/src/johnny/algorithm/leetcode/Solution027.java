package johnny.algorithm.leetcode;

/**
 * Remove Element.
 * Given an array and a value, remove all instances of that value in place and 
 * return the new length.
 * The order of elements can be changed. It doesn't matter what you leave 
 * beyond the new length.
 * 
 * @author Johnny
 */
public class Solution027 {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}
