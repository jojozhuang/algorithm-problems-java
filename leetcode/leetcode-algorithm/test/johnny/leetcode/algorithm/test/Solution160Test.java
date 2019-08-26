package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution160;
import johnny.leetcode.algorithm.common.ListNode;

public class Solution160Test extends JunitBase {

    @Test
    public void testGetIntersectionNode() {
        System.out.println("getIntersectionNode");
        Solution160 instance = new Solution160();

        assertEquals(null, instance.getIntersectionNode(null, null));

        ListNode tail1 = ListNode.createInstance(new int[]{1});
        ListNode headA1 = tail1;
        ListNode headB1 = tail1;
        assertTrue(ListNode.isSame(tail1, instance.getIntersectionNode(headA1, headB1)));

        ListNode tail2 = ListNode.createInstance(new int[]{2});
        ListNode headA2 = tail2;
        ListNode headB2 = ListNode.createInstance(new int[]{1});
        headB2.next = tail2;
        assertTrue(ListNode.isSame(tail2, instance.getIntersectionNode(headA2, headB2)));

        ListNode tail3 = ListNode.createInstance(new int[]{1,2,11,12,13});
        ListNode headA3 = ListNode.createInstance(new int[]{1,2});
        headA3.next = tail3;
        ListNode headB3 = ListNode.createInstance(new int[]{3,4,5});
        headB3.next = tail3;
        assertTrue(ListNode.isSame(tail3, instance.getIntersectionNode(headA3, headB3)));
    }
}
