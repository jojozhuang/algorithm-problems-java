package johnny.algorithm.leetcode;

/**
 * 926. Flip String to Monotone Increasing
A string of '0's and '1's is monotone increasing if it consists of some number of '0's (possibly 0), followed by some number of '1's (also possibly 0.)

We are given a string S of '0's and '1's, and we may flip any '0' to a '1' or a '1' to a '0'.

Return the minimum number of flips to make S monotone increasing.

 

Example 1:

Input: "00110"
Output: 1
Explanation: We flip the last digit to get 00111.
Example 2:

Input: "010110"
Output: 2
Explanation: We flip to get 011111, or alternatively 000111.
Example 3:

Input: "00011000"
Output: 2
Explanation: We flip to get 00000000.
 

Note:

1 <= S.length <= 20000
S only consists of '0' and '1' characters.

 * @author Johnny
 */
public class Solution926 {
    public int minFlipsMonoIncr(String S) {
        int n = S.length();
        int[] left = new int[n + 1];  // all zero, change 1 to 0
        int[] right = new int[n + 1]; // all one, change 0 to 1
        
        left[0] = S.charAt(0) - '0';
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + (S.charAt(i) - '0');
        }
        right[n - 1] = '1' - S.charAt(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + ('1' - S.charAt(i));
        }
        
        int min = right[0];
        for (int i = 1; i <= n; i++) {
            min = Math.min(min, left[i - 1] + right[i]);
        }
        
        return min;
    }
    public int minFlipsMonoIncr2(String S) {
        int N = S.length();
        int[] P = new int[N + 1];
        for (int i = 0; i < N; ++i)
            P[i+1] = P[i] + (S.charAt(i) == '1' ? 1 : 0);

        int ans = Integer.MAX_VALUE;
        for (int j = 0; j <= N; ++j) {
            ans = Math.min(ans, P[j] + N-j-(P[N]-P[j]));
        }

        return ans;
    }
}
