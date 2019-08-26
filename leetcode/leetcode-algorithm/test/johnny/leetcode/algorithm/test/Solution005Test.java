package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution005;

public class Solution005Test extends JunitBase {

    @Test
    public void testLongestPalindrome() {
        System.out.println("longestPalindrome");
        
        Solution005 instance1 = new Solution005();
        assertEquals("", instance1.longestPalindrome(""));
        
        Solution005 instance2 = new Solution005();
        String result1 = instance2.longestPalindrome("ab");
        assertTrue(result1.equals("a") || result1.equals("b"));
        
        Solution005 instance3 = new Solution005();
        assertEquals("cac", instance3.longestPalindrome("abcac"));
        
        Solution005 instance4 = new Solution005();
        assertEquals("aba", instance4.longestPalindrome("aba"));
        
        Solution005 instance5 = new Solution005();
        assertEquals("abcddcba", instance5.longestPalindrome("abcddcba"));
        
        Solution005 instance6 = new Solution005();
        assertEquals("cdzdc", instance6.longestPalindrome("abcdzdcab"));
    }
}
