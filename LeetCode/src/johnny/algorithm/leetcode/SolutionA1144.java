package johnny.algorithm.leetcode;

/**
 *
 * @author Johnny
 */
public class SolutionA1144 {
    public int movesToMakeZigzag(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // case 1: first one is smaller than the second
        int steps1 = 0;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 1 && nums[i] < prev) {
                int diff = prev - nums[i] + 1;
                steps1 += diff;
                prev = nums[i];
            } else if (i % 2 == 0 && nums[i] > prev) {
                int diff = nums[i] - prev + 1;
                steps1 += diff;
                prev = nums[i] - diff;
            } else {
                prev = nums[i];
            }
        }
        // case 2: first one is larger than the second
        int steps2 = 0;
        prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 1 && nums[i] > prev) {
                int diff = nums[i] - prev + 1;
                steps2 += diff;
                prev = nums[i] - diff;
            } else if (i % 2 == 0 && nums[i] < prev) {
                int diff = prev - nums[i] + 1;
                steps2 += diff;
                prev = nums[i];
            } else {
                prev = nums[i];
            }
        }
        
        return Math.min(steps1, steps2);
    }
}
