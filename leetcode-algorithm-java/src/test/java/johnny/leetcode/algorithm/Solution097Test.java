package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution097Test extends JunitBase {

    @Test
    public void testIsInterleave() {
        System.out.println("isInterleave");
        Solution097 instance = new Solution097();

        assertEquals(true, instance.isInterleave("", "", ""));
        assertEquals(true, instance.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        assertEquals(false, instance.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }
}
