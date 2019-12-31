package johnny.leetcode.algorithm;

import java.util.List;

/**
 *469. Convex Polygon
 *Given a list of points that form a polygon when joined sequentially, find if this polygon is convex (Convex polygon definition).

Note:

There are at least 3 and at most 10,000 points.
Coordinates are in the range -10,000 to 10,000.
You may assume the polygon formed by given points is always a simple polygon (Simple polygon definition). In other words, we ensure that exactly two edges intersect at each vertex, and that edges otherwise don't intersect each other.
Example 1:

[[0,0],[0,1],[1,1],[1,0]]

Answer: True

Explanation:
Example 2:

[[0,0],[0,10],[10,10],[10,0],[5,5]]

Answer: False

Explanation:
 * @author Johnny
 */
public class Solution469 {
    public boolean isConvex(List<List<Integer>> points) {
        int flag = 0;
        for (int i = 0; i < points.size(); i++) {
            int angle = getAngle(points, i);
            if (angle == 0) continue;
            if (flag == 0) flag = angle > 0 ? 1 : -1;
            else if (flag > 0 != angle > 0) return false;
        }
        return true;
    }
    
    private int getAngle(List<List<Integer>> points, int i) {
        List<Integer> c = points.get(i % points.size());
        List<Integer> b = points.get((i + 1) % points.size());
        List<Integer> a = points.get((i + 2) % points.size());
        return (a.get(1) - b.get(1)) * (b.get(0) - c.get(0)) - (b.get(1) - c.get(1)) * (a.get(0) - b.get(0));
    }
}
