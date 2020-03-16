package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1249Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minRemoveToMakeValid");
        SolutionA1249 instance = new SolutionA1249();

        assertEquals("lee(t(c)o)de", instance.minRemoveToMakeValid("lee(t(c)o)de)"));
        assertEquals("ab(c)d", instance.minRemoveToMakeValid("a)b(c)d"));
        assertEquals("", instance.minRemoveToMakeValid("))(("));
        assertEquals("a(b(c)d)", instance.minRemoveToMakeValid("(a(b(c)d)"));
    }
}
