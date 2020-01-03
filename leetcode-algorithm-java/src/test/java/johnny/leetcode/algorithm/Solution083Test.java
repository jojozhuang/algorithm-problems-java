package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution083;
import johnny.algorithm.common.ListNode;

public class Solution083Test extends JunitBase {

    @Test
    public void testDeleteDuplicates() {
        System.out.println("deleteDuplicates");
        Solution083 instance = new Solution083();

        assertEquals(null, instance.deleteDuplicates(null));

        ListNode head2 = ListNode.createInstance(new int[]{1,1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.deleteDuplicates(head2)));

        ListNode head3 = ListNode.createInstance(new int[]{1,1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{1,2});
        assertTrue(ListNode.isSame(expect3, instance.deleteDuplicates(head3)));

        ListNode head4 = ListNode.createInstance(new int[]{1,1,2,3,3});
        ListNode expect4 = ListNode.createInstance(new int[]{1,2,3});
        assertTrue(ListNode.isSame(expect4, instance.deleteDuplicates(head4)));

        ListNode head5 = ListNode.createInstance(new int[]{1,1,1});
        ListNode expect5 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect5, instance.deleteDuplicates(head5)));
    }
}
