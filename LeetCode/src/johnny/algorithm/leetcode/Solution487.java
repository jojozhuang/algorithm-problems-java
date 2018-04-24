package johnny.algorithm.leetcode;

/**
 *487. Max Consecutive Ones II
 *Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.

Example 1:
Input: [1,0,1,1,0]
Output: 4
Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
    After flipping, the maximum number of consecutive 1s is 4.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
Follow up:
What if the input numbers come in one by one as an infinite stream? In other words, you can't store all numbers coming from the stream as it's too large to hold in memory. Could you solve it efficiently?


 * @author Johnny
 */
public class Solution487 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, zero = 0, k = 1; // flip at most k zero
        for (int l = 0, h = 0; h < nums.length; h++) {
            if (nums[h] == 0)
                zero++;
            while (zero > k)
                if (nums[l++] == 0)
                    zero--;
            max = Math.max(max, h - l + 1);
        }
        return max;
    }
}
