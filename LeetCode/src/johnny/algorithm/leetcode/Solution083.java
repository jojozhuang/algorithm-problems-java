package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.ListNode;

/**
 * Remove Duplicates from Sorted List .
 * Given a sorted linked list, delete all duplicates such that each element 
 * appear only once.
 * 
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * 
 * @author Johnny
 */
public class Solution083 {        
    public ListNode deleteDuplicates(ListNode head) {      
        ListNode curr = head;
        while(curr != null) {
            while (curr.next != null && curr.val == curr.next.val) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        
        return head;
    }
}
