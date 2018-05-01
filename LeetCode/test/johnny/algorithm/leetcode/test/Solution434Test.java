package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution434;

public class Solution434Test extends JunitBase {

    @Test
    public void testCountSegments() {
        System.out.println("countSegments");
        Solution434 instance = new Solution434();

        assertEquals(0, instance.countSegments(""));
        assertEquals(1, instance.countSegments("a"));
        assertEquals(2, instance.countSegments(" a b "));
        assertEquals(5, instance.countSegments("Hello, my name is John"));
        assertEquals(0, instance.countSegments("   "));
        assertEquals(6, instance.countSegments(", , , ,        a, eaefa"));
    }
}
