package johnny.algorithm.leetcode;

/**
 * 944. Delete Columns to Make Sorted
We are given an array A of N lowercase letter strings, all of the same length.

Now, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.

For example, if we have a string "abcdef" and deletion indices {0, 2, 3}, then the final string after deletion is "bef".

Suppose we chose a set of deletion indices D such that after deletions, each remaining column in A is in non-decreasing sorted order.

Formally, the c-th column is [A[0][c], A[1][c], ..., A[A.length-1][c]]

Return the minimum possible value of D.length.

 

Example 1:

Input: ["cba","daf","ghi"]
Output: 1
Example 2:

Input: ["a","b"]
Output: 0
Example 3:

Input: ["zyx","wvu","tsr"]
Output: 3
 

Note:

1 <= A.length <= 100
1 <= A[i].length <= 1000

 * @author Johnny
 */
public class Solution944 {
    public int minDeletionSize(String[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        
        int len = A[0].length();
        int count = 0;
        for (int col = 0; col < len; col++) {
            for (int row = 1; row < A.length; row++) {
                if (A[row].charAt(col) < A[row - 1].charAt(col)) {
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }
}
