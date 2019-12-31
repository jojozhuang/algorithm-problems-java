package johnny.leetcode.algorithm;

/**
 * 908. Smallest Range I
Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].

After this process, we have some array B.

Return the smallest possible difference between the maximum value of B and the minimum value of B.

 

Example 1:

Input: A = [1], K = 0
Output: 0
Explanation: B = [1]
Example 2:

Input: A = [0,10], K = 2
Output: 6
Explanation: B = [2,8]
Example 3:

Input: A = [1,3,6], K = 3
Output: 0
Explanation: B = [3,3,3] or B = [4,4,4]
 

Note:

1 <= A.length <= 10000
0 <= A[i] <= 10000
0 <= K <= 10000

 * @author Johnny
 */
public class Solution908 {
    public int smallestRangeI(int[] A, int K) {
        if (A == null || A.length == 0) {
            return 0;
        }
        
        if (A.length == 1) {
            return 0;
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < A.length; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        
        double diff = (double)(min + max) / 2;
        if (diff - min <= K) {
            return 0;
        } else {
            return (int)((diff - min - K) * 2);
        }
    }
}
