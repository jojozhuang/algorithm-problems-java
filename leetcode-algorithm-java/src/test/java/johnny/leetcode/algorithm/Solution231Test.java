package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution231;

public class Solution231Test extends JunitBase {

    @Test
    public void testIsPowerOfTwo() {
        System.out.println("isPowerOfTwo");
        Solution231 instance = new Solution231();

        assertEquals(false, instance.isPowerOfTwo(0));
        assertEquals(true, instance.isPowerOfTwo(1));
        assertEquals(true, instance.isPowerOfTwo(2));
        assertEquals(false, instance.isPowerOfTwo(3));
        assertEquals(true, instance.isPowerOfTwo(4));
        assertEquals(false, instance.isPowerOfTwo(5));
        assertEquals(true, instance.isPowerOfTwo(8));
        assertEquals(true, instance.isPowerOfTwo(16));
        assertEquals(false, instance.isPowerOfTwo(17));
    }
}
