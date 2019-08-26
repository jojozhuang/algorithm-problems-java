package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution248;

public class Solution248Test extends JunitBase {

    @Test
    public void testStrobogrammaticInRange() {
        System.out.println("strobogrammaticInRange");
        Solution248 instance = new Solution248();

        assertEquals(0,  instance.strobogrammaticInRange("", ""));
        assertEquals(2, instance.strobogrammaticInRange("1", "8"));
        assertEquals(3, instance.strobogrammaticInRange("2", "70"));
        assertEquals(1, instance.strobogrammaticInRange("88", "88"));
        assertEquals(39, instance.strobogrammaticInRange("0", "10000"));
    }
}
