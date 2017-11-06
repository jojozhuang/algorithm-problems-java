/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

import java.util.ArrayList;

/**
 * Continuous Subarray Sum.
 * @author Johnny
 */
public class ContinuousSubarraySum {
    public ArrayList<Integer> continuousSubarraySum(int[] A) {
        // Write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (A == null || A.length == 0) {
            return res;
        }

        int max = Integer.MIN_VALUE;
        int minSum = 0;
        int sum = 0;
        int end = A.length - 1;
        
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum - minSum > max) {
                max = sum - minSum;
                end = i;
            }
            minSum = Math.min(minSum, sum);
        }
        
        int start = end;
        while (max != A[start]) {
            max -= A[start];
            start--;
        }

        res.add(start);
        res.add(end);

        return res;
    }
}
