package johnny.lintcode.algorithm;

/**
 * Set Mismatch.
 * The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.
 *
 * Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.
 *
 * Example
 * Example 1:
 *
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 * Explanation:
 * 2 is the number occurs twice, 3 is the missing number.
 * Example 2:
 *
 * Input: nums = [1,3,3,4]
 * Output: [3,2]
 * Explanation:
 * 3 is the number occurs twice, 2 is the missing number.
 * Notice
 * 1.The given array size will in the range [2, 10000].
 * 2.The given array's numbers won't have any order.
 *
 * @author Johnny
 */
public class SetMismatch {
    /**
     * @param nums: an array
     * @return: the number occurs twice and the number that is missing
     */
    public int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                int pos = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[]{nums[i], i + 1};
            }
        }

        return new int[]{};
    }
}
