package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
