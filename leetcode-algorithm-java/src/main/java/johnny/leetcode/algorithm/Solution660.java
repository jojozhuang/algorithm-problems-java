package johnny.leetcode.algorithm;

/**
 * 660. Remove 9 My SubmissionsBack to Contest
 * User Accepted: 200
 * User Tried: 386
 * Total Accepted: 203
 * Total Submissions: 744
 * Difficulty: Hard
 * Start from integer 1, remove any integer that contains 9 such as 9, 19, 29...
 * <p>
 * So now, you will have a new integer sequence: 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, ...
 * <p>
 * Given a positive integer n, you need to return the n-th integer after removing. Note that 1 will be the first integer.
 * <p>
 * Example 1:
 * Input: 9
 * Output: 10
 * Hint: n will not exceed 9 x 10^8.
 *
 * @author Johnny
 */
public class Solution660 {
    public int newInteger(int n) {
        return Integer.parseInt(Integer.toString(n, 9));
    }

    public int newInteger2(int n) {
        int ans = 0;
        int base = 1;

        while (n > 0) {
            ans += n % 9 * base;
            n /= 9;
            base *= 10;
        }
        return ans;
    }
}
