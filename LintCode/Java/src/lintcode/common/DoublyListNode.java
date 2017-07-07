/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode.common;

/**
 *
 * @author i857285
 */
public class DoublyListNode {
    public int val;
    public DoublyListNode next, prev;
    public DoublyListNode(int val) {
        this.val = val;
        this.next = this.prev = null;
    }
    
    public static DoublyListNode createInstance(int[] arr) {  
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        DoublyListNode dummy = new DoublyListNode(0);
        DoublyListNode curr = dummy;
        for (int i = 0; i < arr.length; i++) {
            curr.next = new DoublyListNode(arr[i]);
            curr = curr.next;
        }
        
        curr = dummy.next;
        while (curr != null && curr.next != null) {
            curr.next.prev = curr;
            curr = curr.next;
        }
        
        return dummy.next;
    }
    
    public static boolean isSame(DoublyListNode l1, DoublyListNode l2) {
        if (l1 == null && l2 == null) {
            return true;
        }
        if (l1 == null && l2 != null) {
            return false;
        }
        if (l1 != null && l2 == null) {
            return false;
        }
        if (l1.val != l2.val) {
            return false;
        }
        
        return isSame(l1.next, l2.next);
    }
}
