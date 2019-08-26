package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution338;

public class Solution338Test extends JunitBase {

    @Test
    public void testCountBits() {
        System.out.println("countBits");
        Solution338 instance = new Solution338();

        assertArrayEquals(new int[1], instance.countBits(0));
        assertArrayEquals(new int[]{0,1,1,2,1,2,2,3}, instance.countBits(7));
    }
}
