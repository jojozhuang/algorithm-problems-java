package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
