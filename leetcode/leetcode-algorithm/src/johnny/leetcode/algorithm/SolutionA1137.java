package johnny.leetcode.algorithm;

/**
 * 1137. N-th Tribonacci Number
The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.

 

Example 1:

Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
Example 2:

Input: n = 25
Output: 1389537
 

Constraints:

0 <= n <= 37
The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
 * @author Johnny
 */
public class SolutionA1137 {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int t3 = 2;
        for (int i = 3; i <= n; i++) {
            t3 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }

        return t3;
    }

    public int tribonacci2(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2] + nums[i - 3];
        }

        return nums[n];
    }
}
