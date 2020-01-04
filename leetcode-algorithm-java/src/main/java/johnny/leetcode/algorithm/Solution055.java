package johnny.leetcode.algorithm;

/**
 * Jump Game.
 * Given an array of non-negative integers, you are initially positioned at the
 * first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Determine if you are able to reach the last index.
 * <p>
 * For example:
 * A = [2,3,1,1,4], return true.
 * <p>
 * A = [3,2,1,0,4], return false.
 *
 * @author Johnny
 */
public class Solution055 {
    // Greedy, top to bottom
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int farthest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i <= farthest && nums[i] + i > farthest) {
                farthest = nums[i] + i;
            }
            if (farthest >= nums.length - 1) {
                return true;
            }
        }
        return farthest >= nums.length - 1;
    }
    /*
    DP
    
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        
        boolean[] states = new boolean[nums.length];
        states[0] = true;
        
        for(int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (states[j] && nums[j] + j >= i) {
                    states[i] = true;
                    break;
                }
            }
        }
        
        return states[states.length - 1];
    }*/
}
