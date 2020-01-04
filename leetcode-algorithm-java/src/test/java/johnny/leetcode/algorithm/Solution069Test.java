package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution069Test extends JunitBase {

    @Test
    public void testSqrt() {
        System.out.println("sqrt");
        Solution069 instance = new Solution069();

        assertEquals(0, instance.mySqrt(0));
        assertEquals(0, instance.mySqrt(-1));
        assertEquals(1, instance.mySqrt(1));
        assertEquals(2, instance.mySqrt(4));
        assertEquals(1, instance.mySqrt(3));
        assertEquals(2, instance.mySqrt(8));
        assertEquals(3, instance.mySqrt(9));
        assertEquals(3, instance.mySqrt(10));
        assertEquals(3, instance.mySqrt(15));
        assertEquals(4, instance.mySqrt(16));
        assertEquals(10, instance.mySqrt(100));
        assertEquals(15, instance.mySqrt(255));
        assertEquals(16, instance.mySqrt(256));
        assertEquals(46339, instance.mySqrt(2147395599));
    }
}
