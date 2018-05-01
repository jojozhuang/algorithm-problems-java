package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution166;

public class Solution166Test extends JunitBase {

    @Test
    public void testFractionToDecimal() {
        System.out.println("fractionToDecimal");
        Solution166 instance = new Solution166();

        assertEquals("", instance.fractionToDecimal(0, 0));
        assertEquals("0.5", instance.fractionToDecimal(1, 2));
        assertEquals("2", instance.fractionToDecimal(2, 1));
        assertEquals("0.(6)", instance.fractionToDecimal(2, 3));
        assertEquals("0.(3)", instance.fractionToDecimal(1, 3));
        assertEquals("-0.(6)", instance.fractionToDecimal(-2, 3));
        assertEquals("0.(142857)", instance.fractionToDecimal(1, 7));
    }
}
