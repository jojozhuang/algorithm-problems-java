package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution707;

public class Solution707Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("myLinkedList");
        Solution707 myLinkedList = new Solution707();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);         // linked list becomes 1->2->3
        assertEquals(2, myLinkedList.get(1));  // returns 2
        myLinkedList.deleteAtIndex(1);         // now the linked list is 1->3
        assertEquals(3, myLinkedList.get(1));  // returns 3
        myLinkedList.addAtHead(4);             // linked list becomes 4->1->3
        assertEquals(1, myLinkedList.get(1));  // returns 1
        myLinkedList.addAtTail(9);             // linked list becomes 4->1->3->9
        assertEquals(9, myLinkedList.get(3));  // returns 9
    }
    
    @Test
    public void testOfficialCase() {
        System.out.println("myLinkedList-official test case");
        Solution707 myLinkedList = new Solution707();
        myLinkedList.addAtHead(5);
        myLinkedList.addAtHead(2);             // linked list becomes 2->5
        myLinkedList.deleteAtIndex(1);         // linked list becomes 2
        myLinkedList.addAtIndex(1, 9);         // linked list becomes 2->9
        myLinkedList.addAtHead(4);             // linked list becomes 4->2->9
        myLinkedList.addAtHead(9);             // linked list becomes 9->4->2->9
        myLinkedList.addAtHead(8);             // linked list becomes 8->9->4->2->9
        assertEquals(2, myLinkedList.get(3));  // returns 2
        myLinkedList.addAtTail(1);             // linked list becomes 8->9->4->2->9->1
        myLinkedList.addAtIndex(3, 6);         // linked list becomes 8->9->4->6->2->9->1
        myLinkedList.addAtHead(3);             // linked list becomes 3->8->9->4->6->2->9->1
        assertEquals(4, myLinkedList.get(3));  // returns 4
    }
}
