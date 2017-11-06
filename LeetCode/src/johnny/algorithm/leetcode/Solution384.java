/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.Random;

/**
 * Shuffle an Array
 * 
 * Shuffle a set of numbers without duplicates.
 * 
 * Example:
 * // Init an array with set 1, 2, and 3.
 * int[] nums = {1,2,3};
 * 
 * Solution solution = new Solution(nums);
 * // Shuffle the array [1,2,3] and return its result. Any permutation 
 * of [1,2,3] must equally likely to be returned.
 * 
 * solution.shuffle();
 * // Resets the array back to its original configuration [1,2,3].
 * 
 * solution.reset();
 * // Returns the random shuffling of array [1,2,3].
 * 
 * solution.shuffle();
 * @author Johnny
 */
public class Solution384 {
    int[] original = null;
    Random random = null;
    public Solution384(int[] nums) {
        original = nums;
        random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original;
    }
    
    /** Returns a random shuffling of the array. */
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
