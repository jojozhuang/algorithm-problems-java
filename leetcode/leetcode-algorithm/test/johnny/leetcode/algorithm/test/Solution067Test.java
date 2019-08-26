package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution067;

public class Solution067Test extends JunitBase {

    @Test
    public void testAddBinary() {
        System.out.println("addBinary");
        Solution067 instance = new Solution067();

        assertEquals("", instance.addBinary("", ""));
        assertEquals("1", instance.addBinary("", "1"));
        assertEquals("1", instance.addBinary("1", "0"));
        assertEquals("10", instance.addBinary("1", "1"));
        assertEquals("100", instance.addBinary("1", "11"));
        assertEquals("110", instance.addBinary("11", "11"));
        assertEquals("101", instance.addBinary("1", "100"));
        assertEquals("10000", instance.addBinary("1111", "1"));
    }
}
