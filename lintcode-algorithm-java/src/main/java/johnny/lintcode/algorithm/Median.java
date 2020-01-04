package johnny.lintcode.algorithm;

/**
 * Median.
 * Given a unsorted array with integers, find the median of it.
 * <p>
 * A median is the middle number of the array after it is sorted.
 * <p>
 * If there are even numbers in the array, return the N/2-th number after sorted.
 * <p>
 * Example
 * Given [4, 5, 1, 2, 3], return 3
 * <p>
 * Given [7, 9, 4, 5], return 5
 * <p>
 * Challenge
 * O(n) time.
 *
 * @author Johnny
 */
public class Median {
    public int median(int[] nums) {
        if (nums == null) {
            return -1;
        }
        // like the quick sort, find the pivot, then check whether the left length is same with the right length(or size)
        return helper(nums, 0, nums.length - 1, (nums.length + 1) / 2);
    }

    private int helper(int[] nums, int start, int end, int size) {
        if (start >= end) {
            return nums[start];
        }

        //take the first element as pivot
        int pivot = start;

        int temp;

        //find the pivot in the range of (start, end)
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] < nums[start]) {
                pivot++;
                temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
            }
        }

        //put pivot in its position
        temp = nums[pivot];
        nums[pivot] = nums[start];
        nums[start] = temp;

        if (pivot - start + 1 == size) {
            return nums[pivot];
        } else if (pivot - start + 1 > size) {
            return helper(nums, start, pivot - 1, size);
        } else {
            return helper(nums, pivot + 1, end, size - (pivot - start + 1));
        }
    }
}
