package johnny.leetcode.algorithm;

import johnny.algorithm.common.RandomListNode;

/**
 * Copy List with Random Pointer.
 * A linked list is given such that each node contains an additional random
 * pointer which could point to any node in the list or null.
 * <p>
 * Return a deep copy of the list.
 *
 * @author Johnny
 */
public class Solution138 {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return head;
        }

        RandomListNode curr = head;
        while (curr != null) {
            RandomListNode next = curr.next;
            curr.next = new RandomListNode(curr.label);
            curr.next.next = next;
            if (curr.random != null) {
                curr.next.random = curr.random;
            }
            curr = curr.next.next;
        }

        curr = head;
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode newCurr = dummy;
        while (curr != null) {
            RandomListNode next = curr.next.next;
            newCurr.next = curr.next;
            newCurr = newCurr.next;
            curr.next = next;
            curr = curr.next;
        }

        return dummy.next;
    }

    public RandomListNode copyRandomList2(RandomListNode head) {
        if (head == null) {
            return head;
        }

        RandomListNode curr = head;
        // create each new node behind its old node
        while (curr != null) {
            RandomListNode copy = new RandomListNode(curr.label);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }
        // copy random node for new node
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        // restore and split out the new list from the current list
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode copyCurr = dummy;
        curr = head;
        while (curr != null) {
            RandomListNode next = curr.next.next;

            // extract the copy
            copyCurr.next = curr.next;
            copyCurr = copyCurr.next;

            // restore the original list
            curr.next = next;

            curr = curr.next;
        }

        return dummy.next;
    }
}
