package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution143Test extends JunitBase {

    @Test
    public void testReorderList() {
        System.out.println("reorderList");
        ListNode head = null;
        Solution143 instance = new Solution143();
        instance.reorderList(head);
        assertEquals(null, head);

        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        instance.reorderList(head2);
        assertTrue(ListNode.isSame(expect2, head2));

        ListNode head3 = ListNode.createInstance(new int[]{1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{1,2});
        instance.reorderList(head3);
        assertTrue(ListNode.isSame(expect3, head3));

        ListNode head4 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect4 = ListNode.createInstance(new int[]{1,3,2});
        instance.reorderList(head4);
        assertTrue(ListNode.isSame(expect4, head4));

        ListNode head5 = ListNode.createInstance(new int[]{1,2,3,4});
        ListNode expect5 = ListNode.createInstance(new int[]{1,4,2,3});
        instance.reorderList(head5);
        assertTrue(ListNode.isSame(expect5, head5));

        ListNode head6 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect6 = ListNode.createInstance(new int[]{1,5,2,4,3});
        instance.reorderList(head6);
        assertTrue(ListNode.isSame(expect6, head6));
    }
}
