package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution622Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Design Circular Queue");

        Solution622 circularQueue = new Solution622(3); // set the size to be 3
        assertEquals(true, circularQueue.enQueue(1));
        assertEquals(true, circularQueue.enQueue(2));
        assertEquals(true, circularQueue.enQueue(3));
        assertEquals(false, circularQueue.enQueue(4));
        assertEquals(3, circularQueue.Rear());
        assertEquals(true, circularQueue.isFull());
        assertEquals(true, circularQueue.deQueue());
        assertEquals(true, circularQueue.enQueue(4));
        assertEquals(4, circularQueue.Rear());
    }
}
