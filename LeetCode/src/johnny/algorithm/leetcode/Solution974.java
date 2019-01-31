package johnny.algorithm.leetcode;

/**
 * 974. Subarray Sums Divisible by K

Given an array A of integers, return the number of (contiguous, non-empty) subarrays that have a sum divisible by K.

Example 1:

Input: A = [4,5,0,-2,-3,1], K = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by K = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
 

Note:

1 <= A.length <= 30000
-10000 <= A[i] <= 10000
2 <= K <= 10000

 * @author Johnny
 */
public class Solution974 {
    public int subarraysDivByK(int[] A, int K) {
        int[] sums = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            sums[i] += A[i];
        }
        int count = 0;
        if (sums[0] % K == 0) {
            count++;
        }
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] % K == 0) {
                count++;
            }
        }
        
        return count;
    }
    // timeout
    public int subarraysDivByK2(int[] A, int K) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = A[i];
            if (sum % K == 0) {
                count++;
            }
            for (int j = i + 1; j < A.length; j++) {
                sum += A[j];
                if (sum % K == 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
