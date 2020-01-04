package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
