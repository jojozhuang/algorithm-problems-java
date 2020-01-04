package johnny.leetcode.algorithm;

/**
 * Remove Duplicates from Sorted Array.
 * Given a sorted array, remove the duplicates in place such that each element
 * appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place
 * with constant memory.
 * For example,
 * Given input array A = [1,1,2],
 * <p>
 * Your function should return length = 2, and A is now [1,2].
 *
 * @author Johnny
 */
public class Solution026 {
    // Two pointers
    public int removeDuplicates9(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 1;
        int j = 0;

        while (i < nums.length) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
            i++;
        }

        return j + 1;
    }

    // no duplicate
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int n : nums) {
            if (i == 0 || n > nums[i - 1]) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }

    // only one duplicate allowed
    public int removeDuplicates2(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }

    // two duplicates allowed
    public int removeDuplicates3(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int i = 0;
        for (int n : nums) {
            if (i < 3 || n > nums[i - 3]) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}
