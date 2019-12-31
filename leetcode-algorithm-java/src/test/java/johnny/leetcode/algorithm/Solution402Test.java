package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution402;

public class Solution402Test extends JunitBase {

    @Test
    public void testRemoveKdigits() {
        System.out.println("removeKdigits");
        Solution402 instance = new Solution402();

        assertEquals("0", instance.removeKdigits("", 0));
        assertEquals("1", instance.removeKdigits("54321", 4));
        assertEquals("4321", instance.removeKdigits("54321", 1));
        assertEquals("0", instance.removeKdigits("54321", 5));
        assertEquals("12345", instance.removeKdigits("12345", 0));
        assertEquals("0", instance.removeKdigits("10", 1));
        assertEquals("1219", instance.removeKdigits("1432219", 3));
        assertEquals("200", instance.removeKdigits("10200", 1));
        assertEquals("0", instance.removeKdigits("10", 2));
    }
}
