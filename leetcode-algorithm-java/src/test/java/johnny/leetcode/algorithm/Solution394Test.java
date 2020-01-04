package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution394Test extends JunitBase {

    @Test
    public void testDecodeString() {
        System.out.println("decodeString");
        Solution394 instance = new Solution394();

        assertEquals("", instance.decodeString(""));
        assertEquals("aaabcbc", instance.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", instance.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", instance.decodeString("2[abc]3[cd]ef"));
    }
}
