package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution225Test extends JunitBase {

    @Test
    public void testStack() {
        System.out.println("testStack");
        Solution225 stack = new Solution225();

        assertEquals(true, stack.empty());
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(false, stack.empty());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(false, stack.empty());
        assertEquals(1, stack.top());
        assertEquals(1, stack.top());
        assertEquals(false, stack.empty());
        stack.push(4);
        assertEquals(4, stack.pop());
        assertEquals(false, stack.empty());
        assertEquals(1, stack.pop());
        assertEquals(true, stack.empty());
    }
}
