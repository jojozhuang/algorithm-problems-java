package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution076;

public class Solution076Test extends JunitBase {

    @Test
    public void testMinWindow() {
        System.out.println("minWindow");
        Solution076 instance = new Solution076();

        assertEquals("", instance.minWindow("", ""));
        assertEquals("a", instance.minWindow("a", "a"));
        assertEquals("BANC", instance.minWindow("ADOBECODEBANC", "ABC"));
    }
}
