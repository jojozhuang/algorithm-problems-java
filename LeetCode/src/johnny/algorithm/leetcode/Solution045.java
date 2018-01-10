package johnny.algorithm.leetcode;

/**
 * Jump Game II.
 * Given an array of non-negative integers, you are initially positioned at the 
 * first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that position.
 * 
 * Your goal is to reach the last index in the minimum number of jumps.
 * 
 * For example:
 * Given array A = [2,3,1,1,4]
 * The minimum number of jumps to reach the last index is 2. (Jump 1 step from
 * index 0 to 1, then 3 steps to the last index.)
 * 
 * @author Johnny
 */
public class Solution045 {
    // Greedy
    //https://discuss.leetcode.com/category/53/jump-game-ii
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MAX_VALUE;
        }
        
        int step_count = 0;
        int last_jump_max = 0;
        int current_jump_max = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            current_jump_max = Math.max(current_jump_max, i + nums[i]);
            if(i == last_jump_max) {
                step_count++;
                last_jump_max = current_jump_max;
            } 
        }
        if (last_jump_max < nums.length - 1) {
            return Integer.MAX_VALUE;
        }
        return step_count;
    }
    /*
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MAX_VALUE;
        }
        
        int[] minSteps = new int[nums.length];
        minSteps[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            minSteps[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (minSteps[j] != Integer.MAX_VALUE && nums[j] + j >= i) {
                    minSteps[i] = minSteps[j] + 1;
                    break;
                }
            }
        }
        
        return minSteps[minSteps.length - 1];
    }
    */
}
