package johnny.lintcode.algorithm;

/**
 * Search Insert Position.
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume NO duplicates in the array.
 * <p>
 * Example
 * [1,3,5,6], 5 → 2
 * <p>
 * [1,3,5,6], 2 → 1
 * <p>
 * [1,3,5,6], 7 → 4
 * <p>
 * [1,3,5,6], 0 → 0
 * <p>
 * Challenge
 * O(log(n)) time
 *
 * @author Johnny
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (nums[start] >= target) {
            if (start == 0) {
                return 0;
            } else {
                return start - 1;
            }
        } else if (nums[start] < target && nums[end] >= target) {
            return end;
        } else {
            return end + 1;
        }
    }
}
