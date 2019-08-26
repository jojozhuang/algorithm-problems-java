package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution151;

public class Solution151Test extends JunitBase {

    @Test
    public void testReverseWords() {
        System.out.println("reverseWords");
        Solution151 instance = new Solution151();

        assertEquals("", instance.reverseWords(""));
        assertEquals("vc", instance.reverseWords(" vc "));
        assertEquals("aa", instance.reverseWords(" aa "));
        assertEquals("the blue", instance.reverseWords("   blue   the  "));
        assertEquals("the sky is blue", instance.reverseWords("blue is sky the"));
    }
}
