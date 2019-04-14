package johnny.algorithm.leetcode;

import java.util.Arrays;

/**
 * 1005. Maximize Sum Of Array After K Negations

Given an array A of integers, we must modify the array in the following way: we choose an i and replace A[i] with -A[i], and we repeat this process K times in total.  (We may choose the same index i multiple times.)

Return the largest possible sum of the array after modifying it in this way.

 

Example 1:

Input: A = [4,2,3], K = 1
Output: 5
Explanation: Choose indices (1,) and A becomes [4,-2,3].
Example 2:

Input: A = [3,-1,0,2], K = 3
Output: 6
Explanation: Choose indices (1, 2, 2) and A becomes [3,1,0,2].
Example 3:

Input: A = [2,-3,-1,5,-4], K = 2
Output: 13
Explanation: Choose indices (1, 4) and A becomes [2,3,-1,5,4].
 

Note:

1 <= A.length <= 10000
1 <= K <= 10000
-100 <= A[i] <= 100

 * @author Johnny
 */
public class SolutionA1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int neg = 0;
        int zero = 0;
        int biggestNeg = Integer.MIN_VALUE;
        int smallestPos = Integer.MAX_VALUE;
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                neg++;
            } else if (A[i] == 0) {
                zero++;
            }
            
            if (A[i] < 0) {
                if (A[i] > biggestNeg) {
                    biggestNeg = A[i];
                    index1 = i;
                }
            }
            if (A[i] > 0) {
                if (A[i] < smallestPos) {
                    smallestPos = A[i];
                    index2 = i;
                }
            }
        }
        
        int i = 0;
        if (K > 0 && neg > 0) {
            int steps = Math.min(K, neg);
            for (i = 0; i < A.length; i++) {
                if (steps > 0) {
                    A[i] = -A[i];
                    steps--;
                    K--;
                } else {
                    break;
                }
            }
        }
        
        if (K > 0) {
            if (zero > 0 || K % 2 == 0) {
                
            } else {
                if (biggestNeg == Integer.MIN_VALUE) {
                    A[index2] = -A[index2];
                } else if (smallestPos == Integer.MAX_VALUE) {
                    A[index1] = -A[index1];
                } else {
                    if (-biggestNeg >= smallestPos) {
                        A[index2] = -A[index2];
                    } else {
                        A[index1] = -A[index1];
                    }
                }
            }
        }
        
        int ans = 0;
        for (int num : A) {
            ans += num;
        }
        
        return ans;
    }
}
