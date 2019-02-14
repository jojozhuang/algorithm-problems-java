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
    // recursive, like dfs
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        
        Node[] children = helper(head);
        
        return children[0];
    }
    private Node[] helper(Node head) {
        Node curr = head;
        Node tail = head;
        while (curr != null) {
            tail = curr;
            if (curr.child == null) {
                curr = curr.next;
            } else {
                Node next = curr.next;
                Node[] children = helper(curr.child);
                curr.next = children[0];
                children[0].prev = curr;
                tail = children[1];
                tail.next = next;
                if (next != null) {
                    next.prev = tail;
                }
                curr.child = null;
                curr = curr.next;
            }
        }
        
        return new Node[] {head, tail};
    }
    
    // straight forward
    public Node flatten3(Node head) {
        if (head == null || (head.next == null && head.child == null)) {
            return head;
        }
        
        Node curr = head;
        while (curr != null) {
            if (curr.child == null) {
                curr = curr.next;
            } else {
                Node next = curr.next;
                Node child = flatten(curr.child);
                curr.next = child;
                child.prev = curr;
                Node tail = child;
                while (tail != null && tail.next != null) {
                    tail = tail.next;
                }
                tail.next = next;
                if (next != null) {
                    next.prev = tail;
                }
                curr.child = null;
                curr = curr.next;
            }
        }
        
        return head;
    }
    
    // like bfs
    public Node flatten2(Node head) {
        if (head == null) {
            return head;
        }
        
        Node curr = head;
        while (curr != null) {
            if (curr.child == null) {
                curr = curr.next;
            } else {
                Node nextNode = curr.next;
                Node[] children = getChild(curr.child);
                curr.next = children[0];
                children[0].prev = curr;
                children[1].next = nextNode;
                if (nextNode != null) {
                    nextNode.prev = children[1];
                }
                curr.child = null;
                curr = curr.next;
            }
        }
        return head;
    }
    
    private Node[] getChild(Node child) {
        Node head = child;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        Node tail = curr;
        return new Node[]{head, tail};
    }
}
