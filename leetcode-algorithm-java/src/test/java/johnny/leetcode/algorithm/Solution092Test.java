package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution092Test extends JunitBase {

    @Test
    public void testReverseBetween() {
        System.out.println("reverseBetween");
        Solution092 instance = new Solution092();

        assertEquals(null, instance.reverseBetween(null, 0, 0));

        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.reverseBetween(head2,1,1)));

        ListNode head3 = ListNode.createInstance(new int[]{1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{2,1});
        assertTrue(ListNode.isSame(expect3, instance.reverseBetween(head3,1,2)));

        ListNode head4 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect4 = ListNode.createInstance(new int[]{1,4,3,2,5});
        assertTrue(ListNode.isSame(expect4, instance.reverseBetween(head4,2,4)));
    }
}
