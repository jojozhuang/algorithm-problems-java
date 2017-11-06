/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

/**
 * Interleaving Positive and Negative Numbers.
 * @author Johnny
 */
public class InterleavingPositiveandNegativeNumbers {
    public void rerange(int[] A) {
        // write your code here
        if (A == null || A.length <= 1) {
            return;
        }
        
        if (A.length % 2 == 0) {
            helper(A, false);
        } else {
            int positive = 0;
            int negative = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] > 0) {
                    positive++;
                } else {
                    negative++;
                }
            }
            helper(A, positive > negative);
        }
    }
    
    private void helper(int[] A, boolean positive) {
        for (int i = 0; i < A.length; i++) {
            if (!positive) {
                if ((i & 1) == 0 && A[i] > 0) {
                    int j = i + 1;
                    while (j < A.length) {
                        if (A[j] < 0) {
                            swap(A, i, j);
                            break;
                        }
                        j++;
                    }
                } else if ((i & 1) == 1 && A[i] < 0) {
                    int j = i + 1;
                    while (j < A.length) {
                        if (A[j] > 0) {
                            swap(A, i, j);
                            break;
                        }
                        j++;
                    }
                }
            } else {
                if ((i & 1) == 0 && A[i] < 0) {
                    int j = i + 1;
                    while (j < A.length) {
                        if (A[j] > 0) {
                            swap(A, i, j);
                            break;
                        }
                        j++;
                    }
                } else if ((i & 1) == 1 && A[i] > 0) {
                    int j = i + 1;
                    while (j < A.length) {
                        if (A[j] < 0) {
                            swap(A, i, j);
                            break;
                        }
                        j++;
                    }
                }
            }
        }
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
