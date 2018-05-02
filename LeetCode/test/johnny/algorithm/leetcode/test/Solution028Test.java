package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution028;

public class Solution028Test extends JunitBase {

    @Test
    public void testStrStr() {
        System.out.println("strStr");
        Solution028 instance = new Solution028();

        assertEquals(0, instance.strStr("", ""));
        assertEquals(0, instance.strStr("A", ""));
        assertEquals(-1, instance.strStr("abcdedf", "cf"));
        assertEquals(2, instance.strStr("abcdedf", "cd"));
        assertEquals(5, instance.strStr("1234567890", "67"));
        assertEquals(4, instance.strStr("mississippi", "issip"));
        assertEquals(2, instance.strStr("hello", "ll"));
        assertEquals(-1, instance.strStr("aaaaa", "bba"));
    }
}
