package johnny.algorithm.leetcode;

import java.util.Stack;
import johnny.algorithm.leetcode.common.ListNode;

/**
 * Add Two Numbers II
 * 
 * You are given two non-empty linked lists representing two non-negative 
 * integers. The most significant digit comes first and each of their nodes 
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the 
 * number 0 itself.
 * 
 * Follow up:
 * What if you cannot modify the input lists? In other words, reversing the 
 * lists is not allowed.
 * 
 * Example:
 * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 8 -> 0 -> 7
 * 
 * @author Johnny
 */
public class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        ListNode head1 = l1;
        while (head1 != null) {
            stack1.push(head1.val);
            head1 = head1.next;
        }
        
        ListNode head2 = l2;
        while (head2 != null) {
            stack2.push(head2.val);
            head2 = head2.next;
        }
        
        int carry = 0;
        ListNode dummy = new ListNode(0);
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int val1 = stack1.isEmpty() ? 0 : stack1.pop();
            int val2 = stack2.isEmpty() ? 0 : stack2.pop();
            int sum = val1 + val2 + carry;
            ListNode curr = new ListNode(sum % 10);
            ListNode next = dummy.next;
            dummy.next = curr;
            curr.next = next;
            carry = sum / 10;
        }
        
        return dummy.next;
    }
}
