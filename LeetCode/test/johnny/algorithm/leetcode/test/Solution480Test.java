package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution480;

public class Solution480Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("medianSlidingWindow");
        Solution480 instance = new Solution480();

        assertArrayEquals(new double[] {1,-1,-1,3,5,6}, instance.medianSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3), 0.0);
    }
}
