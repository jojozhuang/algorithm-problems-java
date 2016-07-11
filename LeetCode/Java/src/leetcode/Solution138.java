/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.RandomListNode;

/**
 * Copy List with Random Pointer.
 * A linked list is given such that each node contains an additional random 
 * pointer which could point to any node in the list or null.
 * 
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
        // create each new node behind its old node
        while(curr != null) {
            RandomListNode copy = new RandomListNode(curr.label);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }
        // copy random node for new node
        curr = head;
        while(curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        // restore and split out the new list from the current list
        RandomListNode dummy = new RandomListNode(0);
        curr = head;
        RandomListNode copy, next, copyIter = dummy;
        while (curr != null) {
            next = curr.next.next;

            // extract the copy
            copy = curr.next;
            copyIter.next = copy;
            copyIter = copy;

            // restore the original list
            curr.next = next;

            curr = next;
        }

        return dummy.next;
    }
}
