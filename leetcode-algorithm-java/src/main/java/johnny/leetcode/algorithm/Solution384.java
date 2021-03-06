package johnny.leetcode.algorithm;

import java.util.Random;

/**
 * Shuffle an Array
 * <p>
 * Shuffle a set of numbers without duplicates.
 * <p>
 * Example:
 * // Init an array with set 1, 2, and 3.
 * int[] nums = {1,2,3};
 * <p>
 * Solution solution = new Solution(nums);
 * // Shuffle the array [1,2,3] and return its result. Any permutation
 * of [1,2,3] must equally likely to be returned.
 * <p>
 * solution.shuffle();
 * // Resets the array back to its original configuration [1,2,3].
 * <p>
 * solution.reset();
 * // Returns the random shuffling of array [1,2,3].
 * <p>
 * solution.shuffle();
 *
 * @author Johnny
 */
public class Solution384 {
    int[] original = null;
    Random random = null;

    public Solution384(int[] nums) {
        original = nums;
        random = new Random();
    }

    /**
     * Resets the array to its original configuration and return it.
     * @return result
     */
    public int[] reset() {
        return original;
    }

    /**
     * Returns a random shuffling of the array.
     * @return result
     */
    public int[] shuffle() {
        if (original == null || original.length <= 1) {
            return original;
        }

        int[] shuffle = original.clone();
        for (int i = 0; i < shuffle.length; i++) {
            int index = random.nextInt(shuffle.length - i) + i;
            int temp = shuffle[i];
            shuffle[i] = shuffle[index];
            shuffle[index] = temp;
        }
        return shuffle;
    }

}
