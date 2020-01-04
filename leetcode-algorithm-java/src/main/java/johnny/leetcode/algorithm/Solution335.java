package johnny.leetcode.algorithm;

/**
 * Self Crossing.
 * <p>
 * You are given an array x of n positive numbers. You start at point (0,0) and
 * moves x[0] metres to the north, then x[1] metres to the west, x[2] metres to
 * the south, x[3] metres to the east and so on. In other words, after each move
 * your direction changes counter-clockwise.
 * <p>
 * Write a one-pass algorithm with O(1) extra space to determine, if your path
 * crosses itself, or not.
 * <p>
 * Example 1:
 * Given x = [2, 1, 1, 2],
 * ┌───┐
 * │   │
 * └───┼──>
 * │
 * <p>
 * Return true (self crossing)
 * Example 2:
 * Given x = [1, 2, 3, 4],
 * ┌──────┐
 * │      │
 * │
 * │
 * └────────────>
 * <p>
 * Return false (not self crossing)
 * Example 3:
 * Given x = [1, 1, 1, 1],
 * ┌───┐
 * │   │
 * └───┼>
 * <p>
 * Return true (self crossing)
 *
 * @author Johnny
 */
public class Solution335 {
    //https://discuss.leetcode.com/topic/38014/java-oms-with-explanation/2
    public boolean isSelfCrossing(int[] x) {
        if (x == null) {
            return false;
        }
        int n = x.length;
        if (n < 4) {
            return false;
        }

        for (int i = 3; i < n; i++) {
            //Fourth line crosses first line and onward
            if (x[i] >= x[i - 2] && x[i - 1] <= x[i - 3]) {
                return true;
            }
            // Fifth line meets first line and onward
            if (i >= 4 && x[i - 1] == x[i - 3] && (x[i] + x[i - 4]) >= x[i - 2]) {
                return true;
            }
            // Sixth line crosses first line and onward
            if (i >= 5 && x[i - 2] >= x[i - 4] && (x[i] + x[i - 4]) >= x[i - 2] && x[i - 1] <= x[i - 3] && x[i - 1] + x[i - 5] >= x[i - 3]) {
                return true;
            }
        }

        return false;
    }
}
