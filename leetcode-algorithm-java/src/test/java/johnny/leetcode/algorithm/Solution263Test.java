package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution263;

public class Solution263Test extends JunitBase {

    @Test
    public void testIsUgly() {
        System.out.println("isUgly");
        Solution263 instance = new Solution263();

        assertEquals(false, instance.isUgly(0));
        assertEquals(true, instance.isUgly(1));
        assertEquals(true, instance.isUgly(2));
        assertEquals(true, instance.isUgly(3));
        assertEquals(true, instance.isUgly(5));
        assertEquals(false, instance.isUgly(7));
        assertEquals(true, instance.isUgly(8));
        assertEquals(true, instance.isUgly(9));
        assertEquals(true, instance.isUgly(10));
        assertEquals(false, instance.isUgly(11));
    }
}
