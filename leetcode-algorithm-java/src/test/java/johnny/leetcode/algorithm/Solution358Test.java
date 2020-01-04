package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution358Test extends JunitBase {

    @Test
    public void testRearrangeString() {
        System.out.println("rearrangeString");
        Solution358 instance = new Solution358();

        assertEquals("", instance.rearrangeString("", 0));

        assertTrue(instance.rearrangeString("aabbcc", 3).equals("abcabc")||instance.rearrangeString("aabbcc", 3).equals("acbacb"));
        //assertEquals("abcabc", instance.rearrangeString("aabbcc", 3));
        assertEquals("", instance.rearrangeString("aaabc", 3));
        assertTrue(instance.rearrangeString("aaadbbcc", 2).equals("abacabcd")||instance.rearrangeString("aaadbbcc", 2).equals("abcabcad"));
        //assertEquals("abacabcd", instance.rearrangeString("aaadbbcc", 2));
    }
}
