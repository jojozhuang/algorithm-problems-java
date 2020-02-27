package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class LongestValidParenthesesTest extends JunitBase {

    /**
     * Test of longestValidParentheses method, of class LongestValidParentheses.
     */
    @Test
    public void testLongestValidParentheses() {
        System.out.println("longestValidParentheses");
        LongestValidParentheses instance = new LongestValidParentheses();

        assertEquals(2, instance.longestValidParentheses("(()"));
        assertEquals(4, instance.longestValidParentheses(")()())"));
        assertEquals(4, instance.longestValidParentheses(")()())()()("));
    }
}
