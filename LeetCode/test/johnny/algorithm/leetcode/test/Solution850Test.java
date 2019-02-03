package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution850;

public class Solution850Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("rectangleArea");
        Solution850 instance = new Solution850();

        int[][] rectangles1 = new int[][]{{0,0,2,2},{1,0,2,3},{1,0,3,1}};
        assertEquals(6, instance.rectangleArea(rectangles1));

        int[][] rectangles2 = new int[][]{{0,0,1000000000,1000000000}};
        assertEquals(49, instance.rectangleArea(rectangles2));
    }
}
