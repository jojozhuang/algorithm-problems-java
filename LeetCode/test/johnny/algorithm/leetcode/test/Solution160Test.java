package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution160;
import johnny.algorithm.leetcode.common.ListNode;

public class Solution160Test extends JunitBase {

    @Test
    public void testGetIntersectionNode() {
        System.out.println("getIntersectionNode");
        Solution160 instance = new Solution160();

        assertEquals(null, instance.getIntersectionNode(null, null));

        ListNode headA1 = ListNode.createInstance(new int[]{1});
        ListNode headB1 = ListNode.createInstance(new int[]{1});
        ListNode expect1 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect1, instance.getIntersectionNode(headA1, headB1)));

        ListNode headA2 = ListNode.createInstance(new int[]{1});
        ListNode headB2 = ListNode.createInstance(new int[]{1,2});
        ListNode expect2 = null;
        assertTrue(ListNode.isSame(expect2, instance.getIntersectionNode(headA2, headB2)));

        ListNode headA3 = ListNode.createInstance(new int[]{1,2,11,12,13});
        ListNode headB3 = ListNode.createInstance(new int[]{3,4,5,11,12,13});
        ListNode expect3 = ListNode.createInstance(new int[]{11,12,13});
        assertTrue(ListNode.isSame(expect3, instance.getIntersectionNode(headA3, headB3)));
    }
}
