/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.ListNode;

/**
 * Palindrome Linked List.
 * 
 * Given a singly linked list, determine if it is a palindrome.
 * 
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 * 
 * @author Johnny
 */
public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        
        if (head.next == null) {
            return true;
        }
        
        ListNode fast = head.next;
        ListNode slow = head;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode right = slow.next;
        slow.next = null;
       
        right = reverse(right);
        
        while (head != null) {
            if (right == null) {
                return true;
            }
            if (head.val != right.val) {
                return false;
            }
            else {
                head = head.next;
                right = right.next;
            }
        }
        
        return true;        
    }
    
    private ListNode reverse(ListNode head) {        
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}
