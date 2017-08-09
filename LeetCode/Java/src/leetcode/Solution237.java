/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;

/**
 * Delete Node in a Linked List.
 * 
 * Write a function to delete a node (except the tail) in a singly linked list, 
 * given only access to that node.
 * 
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third 
 * node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
* 
 * @author Johnny
 */
public class Solution237 {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }
        
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
