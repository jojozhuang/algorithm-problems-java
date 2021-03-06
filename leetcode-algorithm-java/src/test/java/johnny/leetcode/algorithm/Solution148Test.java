package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution148Test extends JunitBase {

    @Test
    public void testSortList() {
        System.out.println("sortList");
        Solution148 instance = new Solution148();

        assertEquals(null, instance.sortList(null));

        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.sortList(head2)));

        ListNode head3 = ListNode.createInstance(new int[]{3,1});
        ListNode expect3 = ListNode.createInstance(new int[]{1,3});
        assertTrue(ListNode.isSame(expect3, instance.sortList(head3)));

        ListNode head4 = ListNode.createInstance(new int[]{3,1,2});
        ListNode expect4 = ListNode.createInstance(new int[]{1,2,3});
        assertTrue(ListNode.isSame(expect4, instance.sortList(head4)));

        ListNode head5 = ListNode.createInstance(new int[]{3,5,1});
        ListNode expect5 = ListNode.createInstance(new int[]{1,3,5});
        assertTrue(ListNode.isSame(expect5, instance.sortList(head5)));
    }
}
