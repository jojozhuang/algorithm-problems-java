package johnny.algorithm.leetcode;

import java.util.Arrays;

/**
 *
 * @author Johnny
 */
public class SolutionA1006 {
    public int clumsy(int N) {
        if (N <= 0) {
            return 0;
        }
        
        int ans = 0;
        boolean first = true;
        while (N > 0) {
            int sum = N;
            int j = 0;
            for (int i = N - 1; i >= N - 2 && i > 0; i--) {
                if (j == 0) {
                    sum *= i;
                } else if (j == 1) {
                    sum /= i;
                }
                j++;
            }
    
            if (first) {
                ans += sum;
                first = false;
            } else {
                ans -= sum;
            }
            if (N - 3 > 0) {
                ans += N - 3;
            }
            N = N - 4;
        }
        
        return ans;
    }
}
