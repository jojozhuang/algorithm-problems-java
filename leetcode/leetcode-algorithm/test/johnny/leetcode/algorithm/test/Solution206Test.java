package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution206;
import johnny.leetcode.algorithm.common.ListNode;

public class Solution206Test extends JunitBase {

    @Test
    public void testReverseList() {
        System.out.println("reverseList");
        Solution206 instance = new Solution206();

        assertEquals(null, instance.reverseList(null));

        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.reverseList(head2)));

        ListNode head3 = ListNode.createInstance(new int[]{1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{2,1});
        assertTrue(ListNode.isSame(expect3, instance.reverseList(head3)));

        ListNode head4 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect4 = ListNode.createInstance(new int[]{5,4,3,2,1});
        assertTrue(ListNode.isSame(expect4, instance.reverseList(head4)));
    }
}
