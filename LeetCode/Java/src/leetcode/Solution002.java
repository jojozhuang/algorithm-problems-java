/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;

/**
 * Add Two Numbers.
 * You are given two linked lists representing two non-negative numbers. The 
 * digits are stored in reverse order and each of their nodes contain a single 
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *  
 * @author Johnny
 */
public class Solution002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        return addTwoNumbers(l1, l2, 0);
        
    }
    
    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        
        ListNode node = new ListNode(0);
        
        if (l1 == null && l2 == null)
            if (carry == 0)
                return null;
            else
                node = new ListNode(carry);
        else if (l1 != null && l2 == null)
            if (carry == 0)
                return l1;
            else {
                l1.val = l1.val + carry;
                if (l1.val < 10) {
                    node = new ListNode(l1.val);
                    node.next = addTwoNumbers(l1.next, null, 0);
                }
                else {
                    node = new ListNode(l1.val - 10);
                    node.next = addTwoNumbers(l1.next, null, 1);
                }
            }
        else if (l1 == null && l2 != null)
            if (carry == 0)
                return l2;
            else {
                l2.val = l2.val + carry;
                if (l2.val < 10) {
                    node = new ListNode(l2.val);
                    node.next = addTwoNumbers(null, l2.next, 0);
                }
                else {
                    node = new ListNode(l2.val - 10);
                    node.next = addTwoNumbers(null, l2.next, 1);
                }
            }
        else {
            int sum = l1.val + l2.val + carry;
            if (sum < 10) {
                node = new ListNode(sum);
                node.next = addTwoNumbers(l1.next, l2.next, 0);
            }
            else {
                node = new ListNode(sum - 10);
                node.next = addTwoNumbers(l1.next, l2.next, 1);
            }
        }
        
        return node;
    }       
}
