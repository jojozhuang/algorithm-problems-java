package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution150;

public class Solution150Test extends JunitBase {

    @Test
    public void testEvalRPN() {
        System.out.println("evalRPN");
        Solution150 instance = new Solution150();

        assertEquals(0, instance.evalRPN(null));
        assertEquals(3, instance.evalRPN(new String[]{"2", "1", "+"}));
        assertEquals(9, instance.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        assertEquals(6, instance.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        assertEquals(22, instance.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}
