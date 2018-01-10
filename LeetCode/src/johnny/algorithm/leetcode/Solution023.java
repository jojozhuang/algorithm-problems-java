package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.ListNode;

/**
 * Merge k Sorted Lists.
 * Merge k sorted linked lists and return it as one sorted list. Analyze and 
 * describe its complexity.
 * 
 * @author Johnny
 */
public class Solution023 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }        
        
        ListNode res = lists[0];
        for (int i = 1; i < lists.length; i++) {
            res = mergeTwoLists(res, lists[i]);
        }
        
        return res;
    }
    
    // in place
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy; 
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }            
            curr = curr.next;
        }
        if (l1 != null) {
            curr.next = l1;
        }
        if (l2 != null) {
            curr.next = l2;
        }
        
        return dummy.next;
    }
    
    // half merge, recursion
    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }        
        
        return helper(lists, 0, lists.length - 1);
    }
    
    private ListNode helper(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        } else if (start + 1 == end) {
            return mergeTwoLists(lists[start], lists[end]);
        }
        
        ListNode left = helper(lists, start, (start + (end - start)) / 2);
        ListNode right = helper(lists, (start + (end - start)) / 2 + 1, end);
        
        return mergeTwoLists(left, right);
    }
}
