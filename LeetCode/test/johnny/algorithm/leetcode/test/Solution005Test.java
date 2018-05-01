package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution005;

public class Solution005Test extends JunitBase {

    @Test
    public void testLongestPalindrome() {
        System.out.println("longestPalindrome");
        Solution005 instance = new Solution005();

        assertEquals("", instance.longestPalindrome(""));
        assertEquals("b", instance.longestPalindrome("ab"));
        assertEquals("cac", instance.longestPalindrome("abcac"));
        assertEquals("aba", instance.longestPalindrome("aba"));
        assertEquals("abcddcba", instance.longestPalindrome("abcddcba"));
        assertEquals("cdzdc", instance.longestPalindrome("abcdzdcab"));
    }
}
