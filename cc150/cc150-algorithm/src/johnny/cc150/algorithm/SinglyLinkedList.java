package johnny.cc150.algorithm;

import johnny.cc150.algorithm.common.ListNode;

/**
 *
 * @author Johnny
 */
public class SinglyLinkedList {    
    public ListNode findMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        
        // define fast and slow
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next; // two steps for each pace
            slow = slow.next;      // one step for each pace
        }
        
        return slow;
    }
}
