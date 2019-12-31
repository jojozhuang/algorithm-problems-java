package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution214;

public class Solution214Test extends JunitBase {

    @Test
    public void testShortestPalindrome() {
        System.out.println("shortestPalindrome");
        Solution214 instance = new Solution214();

        assertEquals("", instance.shortestPalindrome(""));
        assertEquals("aaacecaaa", instance.shortestPalindrome("aacecaaa"));
        assertEquals("dcbabcd", instance.shortestPalindrome("abcd"));
        assertEquals("cabbac", instance.shortestPalindrome("abbac"));
        assertEquals("aba", instance.shortestPalindrome("ba"));
        assertEquals("bbabb", instance.shortestPalindrome("abb"));
        assertEquals("abbaabba", instance.shortestPalindrome("aabba"));
    }
}
