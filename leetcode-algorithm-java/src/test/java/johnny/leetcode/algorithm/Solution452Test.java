package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution452Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMinArrowShots");
        Solution452 instance = new Solution452();

        int[][] points1 = new int[][] {{10,16}, {2,8}, {1,6}, {7,12}};
        assertEquals(2, instance.findMinArrowShots(points1));

        int[][] points2 = new int[][] {{1,2},{3,4},{5,6},{7,8}};
        assertEquals(4, instance.findMinArrowShots(points2));

        int[][] points3 = new int[][] {{1,2},{2,3},{3,4},{4,5}};
        assertEquals(2, instance.findMinArrowShots(points3));

        int[][] points4 = new int[][] {{1,2}};
        assertEquals(1, instance.findMinArrowShots(points4));

        int[][] points5 = new int[][] {{2,3},{2,3}};
        assertEquals(1, instance.findMinArrowShots(points5));

        int[][] points6 = new int[][] {{-2147483646,-2147483645},{2147483646,2147483647}};
        assertEquals(2, instance.findMinArrowShots(points6));

    }
}
