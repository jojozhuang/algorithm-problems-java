package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution405;

public class Solution405Test extends JunitBase {

    @Test
    public void testToHex() {
        System.out.println("toHex");
        Solution405 instance = new Solution405();

        assertEquals("0", instance.toHex(0));
        assertEquals("1", instance.toHex(1));
        assertEquals("a", instance.toHex(10));
        assertEquals("f", instance.toHex(15));
        assertEquals("1a", instance.toHex(26));
        assertEquals("400", instance.toHex(1024));
        assertEquals("7fffffff", instance.toHex(2147483647));
        assertEquals("ffffffff", instance.toHex(-1));
        assertEquals("fffffffe", instance.toHex(-2));
        assertEquals("80000000", instance.toHex(-2147483648));
    }
}
