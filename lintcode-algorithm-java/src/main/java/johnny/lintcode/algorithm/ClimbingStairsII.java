package johnny.lintcode.algorithm;

/**
 * Climbing Stairs II
 * <p>
 * A child is running up a staircase with n steps, and can hop either 1 step,
 * 2 steps, or 3 steps at a time. Implement a method to count how many possible
 * ways the child can run up the stairs.
 * <p>
 * n=3
 * 1+1+1=2+1=1+2=3=3
 * <p>
 * return 4
 *
 * @author Johnny
 */
public class ClimbingStairsII {
    public int climbStairs2(int n) {
        if (n <= 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int[] f = new int[n];
        f[0] = 1;
        f[1] = 2;
        f[2] = 4;
        int i = 3;
        while (i < n) {
            f[i] = f[i - 1] + f[i - 2] + f[i - 3];
            i++;
        }
        return f[n - 1];
    }
}
