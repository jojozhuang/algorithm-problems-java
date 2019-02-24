package johnny.algorithm.leetcode;

/**
 * 977. Squares of a Sorted Array
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Note:

1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.

 * @author Johnny
 */
public class Solution977 {
    public int[] sortedSquares(int[] A) {
        if (A == null || A.length == 0) {
            return A;
        }
        
        int pos = 0; // index of first non-negative element
        for (pos = 0; pos < A.length; pos++) {
            if (A[pos] >= 0) {
                break;
            }
        }
        
        int[] ans = new int[A.length];
        int neg = pos - 1; // index of the negative elements
        int i = 0;
        while (neg >= 0 && pos < A.length) {
            int v1 = A[neg] * A[neg];
            int v2 = A[pos] * A[pos];
            if (v1 <= v2) {
                ans[i] = v1;
                neg--;
            } else {
                ans[i] = v2;
                pos++;
            }
            i++;
        }
        
        while (neg >= 0) {
            ans[i] = A[neg] * A[neg];
            neg--;
            i++;
        }
        while (pos < A.length) {
            ans[i] = A[pos] * A[pos];
            pos++;
            i++;
        }

        return ans;
    }
}
