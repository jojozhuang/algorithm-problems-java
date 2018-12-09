package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution641;

public class Solution641Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Design Circular Deque");

        Solution641 circularDeque = new Solution641(3); // set the size to be 3
        assertEquals(true, circularDeque.insertLast(1));
        assertEquals(true, circularDeque.insertLast(2));
        assertEquals(true, circularDeque.insertFront(3)); //[3,1,2]
        assertEquals(false, circularDeque.insertFront(4));
        assertEquals(2, circularDeque.getRear());
        assertEquals(true, circularDeque.isFull());
        assertEquals(true, circularDeque.deleteLast());  //[3,1]
        assertEquals(true, circularDeque.insertFront(4));//[4,3,1]
        assertEquals(4, circularDeque.getFront());
        
        Solution641 circularDeque2 = new Solution641(8); // set the size to be 8
        assertEquals(true, circularDeque2.insertFront(5));
        assertEquals(5, circularDeque2.getFront());
        assertEquals(false, circularDeque2.isEmpty());
        assertEquals(true, circularDeque2.deleteFront());
        assertEquals(true, circularDeque2.insertLast(3)); //[3]
        assertEquals(3, circularDeque2.getRear());
        assertEquals(true, circularDeque2.insertLast(7)); //[3,7]
        assertEquals(true, circularDeque2.insertFront(7)); //[7,3,7]
        assertEquals(true, circularDeque2.deleteLast()); //[7,3]
        assertEquals(true, circularDeque2.insertLast(4)); //[3,7,4]
        assertEquals(false, circularDeque2.isEmpty());
    }
}
