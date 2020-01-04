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
    public int partitionArray(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        int slow = 0;
        while (i < nums.length) {
            if (nums[i] >= k) {
                i++;
            } else {
                if (i > slow) {
                    int temp = nums[i];
                    nums[i] = nums[slow];
                    nums[slow] = temp;
                    i++;
                    slow++;
                } else {
                    i++;
                    slow++;
                }
            }
        }
        return slow;
    }
}
