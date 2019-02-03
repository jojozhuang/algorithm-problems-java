package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution856;

public class Solution856Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("scoreOfParentheses");
        Solution856 instance = new Solution856();

        assertEquals(1, instance.scoreOfParentheses("()"));
        assertEquals(2, instance.scoreOfParentheses("(())"));
        assertEquals(2, instance.scoreOfParentheses("()()"));
        assertEquals(6, instance.scoreOfParentheses("(()(()))"));
    }
}
