package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1381Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("customStack");
        SolutionA1381 customStack = new SolutionA1381(3);

        customStack.push(1);                          // stack becomes [1]
        customStack.push(2);                          // stack becomes [1, 2]
        assertEquals(2, customStack.pop());     // return 2 --> Return top of the stack 2, stack becomes [1]
        customStack.push(2);                          // stack becomes [1, 2]
        customStack.push(3);                          // stack becomes [1, 2, 3]
        customStack.push(4);                          // stack still [1, 2, 3], Don't add another elements as size is 4
        customStack.increment(5, 100);            // stack becomes [101, 102, 103]
        customStack.increment(2, 100);            // stack becomes [201, 202, 103]
        assertEquals(103, customStack.pop());   // return 103 --> Return top of the stack 103, stack becomes [201, 202]
        assertEquals(202, customStack.pop());   // return 202 --> Return top of the stack 102, stack becomes [201]
        assertEquals(201, customStack.pop());   // return 201 --> Return top of the stack 101, stack becomes []
        assertEquals(-1, customStack.pop());    // return -1 --> Stack is empty return -1.

    }
}
