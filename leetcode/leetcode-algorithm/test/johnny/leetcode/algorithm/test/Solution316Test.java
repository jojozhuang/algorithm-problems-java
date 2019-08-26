package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution316;

public class Solution316Test extends JunitBase {

    @Test
    public void testRemoveDuplicateLetters() {
        System.out.println("removeDuplicateLetters");
        Solution316 instance = new Solution316();

        assertEquals("", instance.removeDuplicateLetters(""));
        assertEquals("abc", instance.removeDuplicateLetters("bcabc"));
        assertEquals("acdb", instance.removeDuplicateLetters("cbacdcbc"));
    }
}
