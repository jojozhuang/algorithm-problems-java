package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution032;

public class Solution032Test extends JunitBase {

    @Test
    public void testLongestValidParentheses() {
        System.out.println("longestValidParentheses");
        Solution032 instance = new Solution032();

        assertEquals(0, instance.longestValidParentheses(""));
        assertEquals(2, instance.longestValidParentheses("(()"));
        assertEquals(4, instance.longestValidParentheses(")()())"));
        assertEquals(2, instance.longestValidParentheses("()(()"));
    }
}
