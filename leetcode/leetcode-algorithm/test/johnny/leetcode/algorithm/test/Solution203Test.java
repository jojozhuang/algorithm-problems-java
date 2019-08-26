package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution203;
import johnny.leetcode.algorithm.common.ListNode;

public class Solution203Test extends JunitBase {

    @Test
    public void testRemoveElements() {
        System.out.println("removeElements");
        Solution203 instance = new Solution203();

        assertEquals(null, instance.removeElements(null, 0));

        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.removeElements(head2, 2)));

        ListNode head3 = ListNode.createInstance(new int[]{1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{2});
        assertTrue(ListNode.isSame(expect3, instance.removeElements(head3, 1)));

        ListNode head4 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect4 = ListNode.createInstance(new int[]{1,3});
        assertTrue(ListNode.isSame(expect4, instance.removeElements(head4, 2)));

        ListNode head5 = ListNode.createInstance(new int[]{1,5,5,4,5,6});
        ListNode expect5 = ListNode.createInstance(new int[]{1,4,6});
        assertTrue(ListNode.isSame(expect5, instance.removeElements(head5, 5)));
    }
}
