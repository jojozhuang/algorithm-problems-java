package johnny.algorithm.leetcode;

import java.util.Arrays;

/**
 *
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
