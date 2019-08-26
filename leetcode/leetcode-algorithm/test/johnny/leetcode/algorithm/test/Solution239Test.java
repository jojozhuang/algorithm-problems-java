package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution239;

public class Solution239Test extends JunitBase {

    @Test
    public void testMaxSlidingWindow() {
        System.out.println("maxSlidingWindow");
        Solution239 instance = new Solution239();

        assertArrayEquals(new int[]{}, instance.maxSlidingWindow(null, 0));
        assertArrayEquals(new int[]{1}, instance.maxSlidingWindow(new int[]{1}, 1));
        assertArrayEquals(new int[]{3,3,5,5,6,7}, instance.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
        assertArrayEquals(new int[]{7,7,8}, instance.maxSlidingWindow(new int[]{1, 2, 7, 7, 8}, 3));
        assertArrayEquals(new int[]{3,3,2,5}, instance.maxSlidingWindow(new int[]{1, 3, 1, 2, 0, 5}, 3));
    }
}
