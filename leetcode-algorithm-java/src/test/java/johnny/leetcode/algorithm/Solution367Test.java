package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution367Test extends JunitBase {

    @Test
    public void testIsPerfectSquare() {
        System.out.println("isPerfectSquare");
        Solution367 instance = new Solution367();

        assertEquals(true, instance.isPerfectSquare(0));
        assertEquals(true, instance.isPerfectSquare(1));
        assertEquals(false, instance.isPerfectSquare(2));
        assertEquals(false, instance.isPerfectSquare(3));
        assertEquals(true, instance.isPerfectSquare(4));
        assertEquals(false, instance.isPerfectSquare(6));
        assertEquals(true, instance.isPerfectSquare(9));
        assertEquals(false, instance.isPerfectSquare(10));
        assertEquals(true, instance.isPerfectSquare(100));
        assertEquals(true, instance.isPerfectSquare(808201));
    }
}
