/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

/**
 * Reverse Pairs
 * 
 * For an array A, if i < j, and A [i] > A [j], called (A [i], A [j]) is a 
 * reverse pair.
 * 
 * return total of reverse pairs in A.
 * 
 * Example
 * Given A = [2, 4, 1, 3, 5] , (2, 1), (4, 1), (4, 3) are reverse pairs. return 3
 * 
 * @author Johnny
 */
public class ReversePairs {
    public long reversePairs(int[] A) {
        if (A == null || A.length <= 1) {
            return 0;
        }
        
        int res = 0;
        for (int i = 1; i < A.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] > A[i]) {
                    res++;
                }
            }
        }
        
        return res;
    }
}
