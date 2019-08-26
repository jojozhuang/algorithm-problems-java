package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution014;

public class Solution014Test extends JunitBase {

    @Test
    public void testLongestCommonPrefix() {
        System.out.println("longestCommonPrefix");
        Solution014 instance = new Solution014();

        assertEquals("", instance.longestCommonPrefix(null));
        assertEquals("a", instance.longestCommonPrefix(new String[]{"a"}));
        assertEquals("", instance.longestCommonPrefix(new String[]{"", "abc", "abb"}));
        assertEquals("", instance.longestCommonPrefix(new String[]{"a", "b", "c"}));
        assertEquals("a", instance.longestCommonPrefix(new String[]{"a", "a", "a"}));
        assertEquals("ab", instance.longestCommonPrefix(new String[]{"abc", "ab", "ab"}));
        assertEquals("ab", instance.longestCommonPrefix(new String[]{"abcdef", "abc", "abb"}));
        assertEquals("abc", instance.longestCommonPrefix(new String[]{"abcdef", "abce", "abc123"}));
    }
}
