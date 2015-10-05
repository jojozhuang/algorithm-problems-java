/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;
import java.util.Stack;

/**
 * Intersection of Two Linked Lists.
 * Write a program to find the node at which the intersection of two singly 
 * linked lists begins.
 * 
 * For example, the following two linked lists:
 * 
 * A:          a1 → a2
 *                    ↘
 *                      c1 → c2 → c3
 *                    ↗            
 * B:     b1 → b2 → b3
 * begin to intersect at node c1.
 * 
 * Notes:
 * 
 * 1)If the two linked lists have no intersection at all, return null.
 * 2)The linked lists must retain their original structure after the function returns.
 * 3)You may assume there are no cycles anywhere in the entire linked structure.
 * 4)Your code should preferably run in O(n) time and use only O(1) memo
 *  
 * @author Johnny
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null)
            return null;
        
        Stack stackA = new Stack();
        Stack stackB = new Stack();
        
        ListNode common = null;
        ListNode common1 = null;
        ListNode common2 = null;
        ListNode currentA = headA;
        ListNode currentB = headB;
        while(currentA!=null) {
            stackA.push(currentA);
            currentA = currentA.next;
        }
        while(currentB!=null) {
            stackB.push(currentB);
            currentB = currentB.next;
        }
        
        while(!stackA.empty()&&!stackB.empty()) {
            common1 = (ListNode)stackA.pop();
            common2 = (ListNode)stackB.pop();
            if (common1.val != common2.val) {
                break;
            }
            else
                common = common1;
        }
        
        return common;
        
    }
}
