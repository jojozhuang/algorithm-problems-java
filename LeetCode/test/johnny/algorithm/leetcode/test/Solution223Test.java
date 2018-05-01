package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution223;

public class Solution223Test extends JunitBase {

    @Test
    public void testComputeArea() {
        System.out.println("computeArea");
        Solution223 instance = new Solution223();

        assertEquals(0, instance.computeArea(0, 0, 0, 0, 0, 0, 0, 0));
        assertEquals(45, instance.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
        assertEquals(24, instance.computeArea(-3, 0, 3, 4, -3, 0, 3, 2));
    }
}
