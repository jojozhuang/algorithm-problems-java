package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution716Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("MaxStack");
        Solution716 stack = new Solution716();

        stack.push(5);
        stack.push(1);
        stack.push(5);
        assertEquals(5, stack.top());
        assertEquals(5, stack.popMax());
        assertEquals(1, stack.top());
        assertEquals(5, stack.peekMax());
        assertEquals(1, stack.pop());
        assertEquals(5, stack.top());
        
        Solution716 stack2 = new Solution716();
        stack2.push(5);
        stack2.push(1);
        stack2.push(-5);
        assertEquals(5, stack2.popMax());
        assertEquals(1, stack2.popMax());
        assertEquals(-5, stack2.top());
    }
}
