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
            RandomListNode newnode = new RandomListNode(curr.label);
            newnode.next = curr.next;
            curr.next = newnode;
            curr = newnode.next;
        }
        // copy random node for new node
        RandomListNode oldnode = head;
        while(oldnode != null) {
            if (oldnode.random != null) {
                oldnode.next.random = oldnode.random.next;
            }
            oldnode = oldnode.next.next;
        }
        // split out the new list from the current list
        RandomListNode newnode = head.next;
        while(newnode != null) {
            if (newnode.next != null) {
                newnode.next = newnode.next.next;
                newnode = newnode.next.next;
            } else {
                break;
            }
        }
        
        return head.next;
    }
}
