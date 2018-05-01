package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution264;

public class Solution264Test extends JunitBase {

    @Test
    public void testNthUglyNumber() {
        System.out.println("nthUglyNumber");
        Solution264 instance = new Solution264();

        assertEquals(0, instance.nthUglyNumber(0));
        assertEquals(1, instance.nthUglyNumber(1));
        assertEquals(2, instance.nthUglyNumber(2));
        assertEquals(3, instance.nthUglyNumber(3));
        assertEquals(4, instance.nthUglyNumber(4));
        assertEquals(5, instance.nthUglyNumber(5));
        assertEquals(6, instance.nthUglyNumber(6));
        assertEquals(8, instance.nthUglyNumber(7));
        assertEquals(9, instance.nthUglyNumber(8));
        assertEquals(10, instance.nthUglyNumber(9));
        assertEquals(12, instance.nthUglyNumber(10));
        assertEquals(15, instance.nthUglyNumber(11));
        assertEquals(402653184, instance.nthUglyNumber(1352));
    }
}
