package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.Node;

/**
 * 430. Flatten a Multilevel Doubly Linked List
 * You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.

Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.

Example:

Input:
 1---2---3---4---5---6--NULL
         |
         7---8---9---10--NULL
             |
             11--12--NULL

Output:
1-2-3-7-8-11-12-9-10-4-5-6-NULL

 * @author Johnny
 */
public class Solution430 {
    public Node flatten(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        Node dummy = new Node(0, null, null, null);
        dummy.next = head;
        
        while (head != null) {
            if (head.child == null) {
                head = head.next;
            } else {
                Node nextNode = head.next;
                Node child = flatten(head.child);
                child.prev = head;
                head.next = child;
                head.child = null;
                child.next = nextNode;
                nextNode.prev = child;
                head = nextNode;
            }
        }
        return dummy.next;
    }
}
