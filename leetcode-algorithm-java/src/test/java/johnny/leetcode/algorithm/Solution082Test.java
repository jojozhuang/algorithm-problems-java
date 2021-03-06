package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution082Test extends JunitBase {

    @Test
    public void testDeleteDuplicates() {
        System.out.println("deleteDuplicates");
        Solution082 instance = new Solution082();

        assertEquals(null, instance.deleteDuplicates(null));

        ListNode head2 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect2 = ListNode.createInstance(new int[]{1,2,3});
        assertTrue(ListNode.isSame(expect2, instance.deleteDuplicates(head2)));

        ListNode head3 = ListNode.createInstance(new int[]{1,1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{2});
        assertTrue(ListNode.isSame(expect3, instance.deleteDuplicates(head3)));

        ListNode head4 = ListNode.createInstance(new int[]{1,1,1,2,3});
        ListNode expect4 = ListNode.createInstance(new int[]{2,3});
        assertTrue(ListNode.isSame(expect4, instance.deleteDuplicates(head4)));

        ListNode head5 = ListNode.createInstance(new int[]{1,2,3,3,4,4,5});
        ListNode expect5 = ListNode.createInstance(new int[]{1,2,5});
        assertTrue(ListNode.isSame(expect5, instance.deleteDuplicates(head5)));
    }
}
