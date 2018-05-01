package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution328;
import johnny.algorithm.leetcode.common.ListNode;

public class Solution328Test extends JunitBase {

    @Test
    public void testOddEvenList() {
        System.out.println("oddEvenList");
        Solution328 instance = new Solution328();

        assertEquals(null, instance.oddEvenList(null));

        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.oddEvenList(head2)));

        ListNode head3 = ListNode.createInstance(new int[]{1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{1,2});
        assertTrue(ListNode.isSame(expect3, instance.oddEvenList(head3)));

        ListNode head4 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect4 = ListNode.createInstance(new int[]{1,3,2});
        assertTrue(ListNode.isSame(expect4, instance.oddEvenList(head4)));

        ListNode head5 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect5 = ListNode.createInstance(new int[]{1,3,5,2,4});
        assertTrue(ListNode.isSame(expect5, instance.oddEvenList(head5)));
    }
}
