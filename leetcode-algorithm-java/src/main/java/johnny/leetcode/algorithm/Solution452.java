package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * Minimum Number of Arrows to Burst Balloons
 * <p>
 * There are a number of spherical balloons spread in two-dimensional space. For
 * each balloon, provided input is the start and end coordinates of the
 * horizontal diameter. Since it's horizontal, y-coordinates don't matter and
 * hence the x-coordinates of start and end of the diameter suffice. Start is
 * always smaller than end. There will be at most 104 balloons.
 * <p>
 * An arrow can be shot up exactly vertically from different points along the
 * x-axis. A balloon with xstart and xend bursts by an arrow shot at x if
 * xstart≤ x ≤ xend. There is no limit to the number of arrows that can be shot.
 * An arrow once shot keeps travelling up infinitely. The problem is to find the
 * minimum number of arrows that must be shot to burst all balloons.
 * <p>
 * Example:
 * <p>
 * Input:
 * [[10,16], [2,8], [1,6], [7,12]]
 * <p>
 * Output:
 * 2
 * <p>
 * Explanation:
 * One way is to shoot one arrow for example at x = 6 (bursting the balloons
 * [2,8] and [1,6]) and another arrow at x = 11 (bursting the other two
 * balloons).
 *
 * @author Johnny
 */
public class Solution452 {
    public int findMinArrowShots(int[][] points) {
        // edge cases
        if (points == null) return 0;
        if (points.length <= 1) return points.length;
        // proper sort by diameter end
        Arrays.sort(points, (int[] a, int[] b) -> a[1] > b[1] ? 1 : -1);
        // 1 arrow for first baloon
        int arrows = 1;
        int shotDiameter = points[0][1];
        for (int i = 1; i < points.length; i++) {
            int[] baloon = points[i];
            // if balloon diameter start is in bounds of shot - just move to next
            if (baloon[0] <= shotDiameter) continue;
            // else add one more arrow and change shot diameter to end at current baloon end
            arrows++;
            shotDiameter = baloon[1];
        }
        return arrows;
    }

    public int findMinArrowShots2(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> a[1] - b[1]);
        long arrowPos = points[0][1];
        long arrowCnt = 1;
        for (int i = 1; i < points.length; i++) {
            if (arrowPos >= points[i][0]) {
                continue;
            }
            arrowCnt++;
            arrowPos = points[i][1];
        }
        return (int)arrowCnt;
    }
}
