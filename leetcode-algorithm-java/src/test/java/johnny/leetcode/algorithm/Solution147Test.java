package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution147;
import johnny.leetcode.algorithm.common.ListNode;

public class Solution147Test extends JunitBase {

    @Test
    public void testInsertionSortList() {
        System.out.println("insertionSortList");
        Solution147 instance = new Solution147();

        assertEquals(null, instance.insertionSortList(null));

        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.insertionSortList(head2)));

        ListNode head3 = ListNode.createInstance(new int[]{3,1});
        ListNode expect3 = ListNode.createInstance(new int[]{1,3});
        assertTrue(ListNode.isSame(expect3, instance.insertionSortList(head3)));

        ListNode head4 = ListNode.createInstance(new int[]{3,1,2});
        ListNode expect4 = ListNode.createInstance(new int[]{1,2,3});
        assertTrue(ListNode.isSame(expect4, instance.insertionSortList(head4)));

        ListNode head5 = ListNode.createInstance(new int[]{3,5,1});
        ListNode expect5 = ListNode.createInstance(new int[]{1,3,5});
        assertTrue(ListNode.isSame(expect5, instance.insertionSortList(head5)));
    }
}
