package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution149;
import johnny.algorithm.leetcode.common.Point;

public class Solution149Test extends JunitBase {

    @Test
    public void testMaxPoints() {
        System.out.println("maxPoints");
        Solution149 instance = new Solution149();

        assertEquals(0, instance.maxPoints(null));

        Point[] points2 = Point.buildArray(new int[][] {{1,2},{3,2},{2,2},{1,9},{4,8}});
        assertEquals(3, instance.maxPoints(points2));

        Point[] points3 = Point.buildArray(new int[][] {{0,0}});
        assertEquals(1, instance.maxPoints(points3));

        Point[] points4 = Point.buildArray(new int[][] {{0,0},{0,0}});
        assertEquals(2, instance.maxPoints(points4));

        Point[] points5 = Point.buildArray(new int[][] {{1,1},{1,2},{2,2},{2,3},{2,8}});
        assertEquals(3, instance.maxPoints(points5));

        Point[] points6 = Point.buildArray(new int[][] {{2,3},{3,3},{-5,3}});
        assertEquals(3, instance.maxPoints(points6));
        
        Point[] points7 = Point.buildArray(new int[][] {{0,0},{94911151,94911150},{94911152,94911151}});
        assertEquals(2, instance.maxPoints(points7));
    }
}
