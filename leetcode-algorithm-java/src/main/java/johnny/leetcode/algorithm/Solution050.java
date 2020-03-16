package johnny.leetcode.algorithm;

/**
 * Pow(x, n).
 * Implement pow(x, n).
 *
 * @author Johnny
 */
public class Solution050 {
    // iterative
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        }
        if (n == Integer.MIN_VALUE) {
            return x > 0 ? 0.0 : 1.0;
        }

        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        double ans = 1;
        for (int i = n; i > 0; i /= 2) {
            if (i % 2 == 1) {
                ans *= x;
            }
            x = x * x;
        }

        return ans;
    }

    // Recursive
    //http://www.programcreek.com/2012/12/leetcode-powx-n/
    public double myPow2(double x, int n) {
        if (n < 0) {
            return 1 / helper(x, -n);
        } else {
            return helper(x, n);
        }
    }

    private double helper(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        }

        double half = helper(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
