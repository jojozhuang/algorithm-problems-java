package johnny.lintcode.algorithm;

import java.util.List;

/**
 * Previous Permutation.
 * <p>
 * Given a list of integers, which denote a permutation.
 * <p>
 * Find the previous permutation in ascending order.
 * <p>
 * Example
 * For [1,3,2,3], the previous permutation is [1,2,3,3]
 * <p>
 * For [1,2,3,4], the previous permutation is [4,3,2,1]
 *
 * @author Johnny
 */
public class PreviousPermutation {
    public List<Integer> previousPermuation(List<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return nums;
        }

        // find the partition number from right to left
        int partition = -1;
        for (int i = nums.size() - 1; i > 0; i--) {
            if (nums.get(i - 1) > nums.get(i)) {
                partition = i - 1;
                break;
            }
        }

        // swap
        if (partition == -1) {
            reverse(nums, 0, nums.size() - 1);
            return nums;
        }

        int firstsmall = -1;
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) < nums.get(partition)) {
                firstsmall = i;
                break;
            }
        }
        //swap
        swap(nums, partition, firstsmall);

        reverse(nums, partition + 1, nums.size() - 1);

        return nums;
    }

    private void reverse(List<Integer> nums, int start, int end) {
        if (nums == null || nums.size() == 0 || end <= start) {
            return;
        }

        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(List<Integer> nums, int first, int second) {
        int temp = nums.get(first);
        nums.set(first, nums.get(second));
        nums.set(second, temp);
    }
}
