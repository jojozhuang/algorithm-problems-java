package johnny.algorithm.leetcode;

import java.util.Arrays;

/**
 *801. Minimum Swaps To Make Sequences Increasing
We have two integer sequences A and B of the same non-zero length.

We are allowed to swap elements A[i] and B[i].  Note that both elements are in the same index position in their respective sequences.

At the end of some number of swaps, A and B are both strictly increasing.  (A sequence is strictly increasing if and only if A[0] < A[1] < A[2] < ... < A[A.length - 1].)

Given A and B, return the minimum number of swaps to make both sequences strictly increasing.  It is guaranteed that the given input always makes it possible.

Example:
Input: A = [1,3,5,4], B = [1,2,3,7]
Output: 1
Explanation: 
Swap A[3] and B[3].  Then the sequences are:
A = [1, 3, 5, 7] and B = [1, 2, 3, 4]
which are both strictly increasing.
Note:

A, B are arrays with the same length, and that length will be in the range [1, 1000].
A[i], B[i] are integer values in the range [0, 2000].
 * @author Johnny
 */
public class Solution801 {
    // optimized DP, time: O(n), space: O(1)
    public int minSwap(int[] A, int[] B) {
        // k: keep, s: swap
        int k1 = 0, s1 = 1;
        for (int i = 1; i < A.length; ++i) {
            int k2 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
            if (A[i] > A[i - 1] && B[i] > B[i - 1]) {
                k2 = k1;
                s2 = s1 + 1;
            }
            if (A[i] > B[i - 1] && B[i] > A[i - 1]) {
                k2 = Math.min(k2, s1);
                s2 = Math.min(s2, k1 + 1);
            }
            k1 = k2;
            s1 = s2;
        }
        return Math.min(k1, s1);
    }
    
    // dp, time: O(n), space: O(n)
    public int minSwap2(int[] A, int[] B) {
        int n = A.length;
        int[] keep = new int[n];
        Arrays.fill(keep, Integer.MAX_VALUE);
        int[] swap = new int[n];
        Arrays.fill(swap, Integer.MAX_VALUE);
        
        keep[0] = 0;
        swap[0] = 1;
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1] && B[i] > B[i - 1]) {
                keep[i] = keep[i - 1];
                swap[i] = swap[i - 1] + 1;
            }
            if (A[i] > B[i - 1] && B[i] > A[i - 1]) {
                keep[i] = Math.min(keep[i], swap[i - 1]);
                swap[i] = Math.min(swap[i], keep[i - 1] + 1);
            }
        }
        return Math.min(keep[n-1], swap[n-1]);
    }
    
    // dfs, TLE
    public int minSwap3(int[] A, int[] B) {
        int[] ans = new int[] {Integer.MAX_VALUE};
        dfs(A, B, 1, 0, ans);
        return ans[0];
    }
    
    private void dfs(int[] A, int[] B, int i, int curr, int[] ans) {
        if (curr >= ans[0]) {
            return;
        }
        
        if (i == A.length) {
            ans[0] = curr;
            return;
        }
        
        if (A[i] > A[i - 1] && B[i] > B[i - 1]) {
            dfs(A, B, i + 1, curr, ans);
        }
        
        if (A[i] > B[i - 1] && B[i] > A[i - 1]) {
            swap(A, B, i);
            dfs(A, B, i + 1, curr + 1, ans);
            swap(A, B, i);
        }
    }
    
    private void swap(int[] A, int[] B, int i) {
        int temp = A[i];
        A[i] = B[i];
        B[i] = temp;
     }
}
