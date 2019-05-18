package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1021;

public class SolutionA1021Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("removeOuterParentheses");
        SolutionA1021 instance = new SolutionA1021();

        assertEquals("()()()", instance.removeOuterParentheses("(()())(())"));
        assertEquals("()()()()(())", instance.removeOuterParentheses("(()())(())(()(()))"));
        assertEquals("", instance.removeOuterParentheses("()()"));
    }
}