package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution369;
import johnny.leetcode.algorithm.common.ListNode;

public class Solution369Test extends JunitBase {

    @Test
    public void testPlusOne() {
        System.out.println("plusOne");
        Solution369 instance = new Solution369();

        ListNode expect1 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect1, instance.plusOne(null)));

        ListNode head2 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect2 = ListNode.createInstance(new int[]{1,2,4});
        assertTrue(ListNode.isSame(expect2, instance.plusOne(head2)));

        ListNode head3 = ListNode.createInstance(new int[]{9,9,9});
        ListNode expect3 = ListNode.createInstance(new int[]{1,0,0,0});
        assertTrue(ListNode.isSame(expect3, instance.plusOne(head3)));
    }
}
