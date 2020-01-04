package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution161Test extends JunitBase {

    @Test
    public void testIsOneEditDistance() {
        System.out.println("isOneEditDistance");
        Solution161 instance = new Solution161();

        assertEquals(false, instance.isOneEditDistance("", ""));

        assertEquals(true, instance.isOneEditDistance("", "a"));
        assertEquals(true, instance.isOneEditDistance("a", ""));
        assertEquals(true, instance.isOneEditDistance("b", "a"));
        assertEquals(false, instance.isOneEditDistance("a", "a"));
        assertEquals(false, instance.isOneEditDistance("", "ab"));
        assertEquals(true, instance.isOneEditDistance("abc", "abcd"));
        assertEquals(true, instance.isOneEditDistance("aab", "acb"));
        assertEquals(false, instance.isOneEditDistance("abcd", "abbb"));
        assertEquals(false, instance.isOneEditDistance("ac", "abcde"));
    }
}
