package johnny.lintcode.algorithm;

/**
 * Partition Array.
 * <p>
 * Given an array nums of integers and an int k, partition the array (i.e move the elements in "nums") such that:
 * <p>
 * All elements &lt; k are moved to the left
 * All elements &gt;= k are moved to the right
 * Return the partitioning index, i.e the first index i nums[i] &lt;= k.
 * <p>
 * Example
 * If nums = [3,2,2,1] and k=2, a valid answer is 1.
 * <p>
 * Note
 * You should do really partition in array nums instead of just counting the numbers of integers smaller than k.
 * <p>
 * If all elements in nums are smaller than k, then return nums.length
 * <p>
 * Challenge
 * Can you partition the array in-place and in O(n)?
 *
 * @author Johnny
 */
public class PartitionArray {
    // double pointers, meet
    public int partitionArray(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            while (start <= end && nums[start] < k) {
                start++;
            }
            while (end >= start && nums[end] >= k) {
                end--;
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        return start;
    }

    // double pointers, same direction
    public int partitionArray2(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        int j = -1;
        while (i < nums.length) {
            if (nums[i] < k) {
                j++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            i++;
        }

        return j + 1;
    }
}
