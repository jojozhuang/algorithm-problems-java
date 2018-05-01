package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution020;

public class Solution020Test extends JunitBase {

    @Test
    public void testIsValid() {
        System.out.println("isValid");
        Solution020 instance = new Solution020();

        assertEquals(true, instance.isValid(""));
        assertEquals(true, instance.isValid("()"));
        assertEquals(false, instance.isValid("("));
        assertEquals(true, instance.isValid("()[]{}"));
        assertEquals(false, instance.isValid("(]"));
        assertEquals(false, instance.isValid("([)]"));
        assertEquals(false, instance.isValid(")}{({))[{{[}"));
        assertEquals(false, instance.isValid("(("));
    }
}
