package johnny.leetcode.algorithm;

/**
 * Minimum Moves to Equal Array Elements
 * <p>
 * Given a non-empty integer array of size n, find the minimum number of moves
 * required to make all array elements equal, where a move is incrementing
 * n - 1 elements by 1.
 * <p>
 * Example:
 * <p>
 * Input:
 * [1,2,3]
 * <p>
 * Output:
 * 3
 * <p>
 * Explanation:
 * Only three moves are needed (remember each move increments two elements):
 * <p>
 * {@code [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]}
 *
 * @author Johnny
 */
public class Solution453 {
    //https://leetcode.com/problems/minimum-moves-to-equal-array-elements/#/solutions
    //let's define sum as the sum of all the numbers, before any moves; minNum as the min number int the list; n is the length of the list;
    //After, say m moves, we get all the numbers as x , and we will get the following equation
    // sum + m * (n - 1) = x * n
    //and actually,
    //  x = minNum + m
    //and finally, we will get
    //  sum - minNum * n = m
    //So, it is clear and easy now.
    public int minMoves(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        long sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(min, nums[i]);
        }

        return (int) (sum - min * nums.length);
    }
}
