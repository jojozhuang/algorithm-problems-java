package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

/**
 * Plus One Linked List.
 * 
 * Given a non-negative number represented as a singly linked list of digits, 
 * plus one to the number.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list.
 * 
 * Example:
 * Input:
 * 1->2->3
 * 
 * Output:
 * 1->2->4
 * 
 * @author Johnny
 */
public class Solution369 {
    //http://www.cnblogs.com/grandyang/p/5626389.html
    //https://discuss.leetcode.com/topic/49551/java-elegant-backtracking-o-n-time-o-n-stack-space-with-comments
    public ListNode plusOne(ListNode head) {
        if (plusOneHelper(head) == 0) {
            return head;
        }
        //need additional node
        ListNode newHead = new ListNode(1);
        newHead.next = head;
        return newHead;
    }

    // plus one for the rest of the list starting from node and return carry
    //because last node.next is null, let null return 1 and it is equivalent to  "plus one" to the least significant digit
    private int plusOneHelper(ListNode node) {
        if (node == null) {
            return 1;
        }
        int sum = node.val + plusOneHelper(node.next);
        node.val = sum % 10;
        return sum / 10;
    }

    public ListNode plusOne2(ListNode head) {
        if (head == null) {
            return new ListNode(1);
        }
        
        ListNode tail = reverse(head);
        ListNode rev = tail;
        int carry = 1;
        while (rev != null) {
            if (carry == 0) {
                break;
            }
            
            int sum = rev.val + carry;
            if (sum >= 10) {
                rev.val = sum % 10;
                carry = 1;
                if (rev.next == null) {
                    rev.next = new ListNode(1);
                    break;
                } else {
                    rev = rev.next;
                }
            } else {
                rev.val = sum;
                carry = 0;
                break;
            }
        }
        
        return reverse(tail);
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
