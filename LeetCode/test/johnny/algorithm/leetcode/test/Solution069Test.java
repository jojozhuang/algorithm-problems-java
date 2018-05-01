package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution069;

public class Solution069Test extends JunitBase {

    @Test
    public void testSqrt() {
        System.out.println("sqrt");
        Solution069 instance = new Solution069();

        assertEquals(0, instance.sqrt(0));
        assertEquals(0, instance.sqrt(-1));
        assertEquals(1, instance.sqrt(1));
        assertEquals(2, instance.sqrt(4));
        assertEquals(1, instance.sqrt(3));
        assertEquals(3, instance.sqrt(9));
        assertEquals(3, instance.sqrt(10));
        assertEquals(3, instance.sqrt(15));
        assertEquals(4, instance.sqrt(16));
        assertEquals(10, instance.sqrt(100));
        assertEquals(15, instance.sqrt(255));
        assertEquals(16, instance.sqrt(256));
        assertEquals(46339, instance.sqrt(2147395599));
    }
}
