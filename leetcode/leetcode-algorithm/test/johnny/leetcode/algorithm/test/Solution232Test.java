package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution232;

public class Solution232Test extends JunitBase {

    @Test
    public void testPush() {
        System.out.println("push");
        Solution232 queue = new Solution232();
        assertEquals(true, queue.empty());
        queue.push(1);
        queue.push(2);
        queue.push(3);

        assertEquals(false, queue.empty());
        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());
        assertEquals(false, queue.empty());
        assertEquals(3, queue.peek());
        assertEquals(3, queue.peek());
        assertEquals(false, queue.empty());
        queue.push(4);
        assertEquals(3, queue.pop());
        assertEquals(false, queue.empty());
        assertEquals(4, queue.pop());
        assertEquals(true, queue.empty());
    }
}
