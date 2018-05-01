package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution024;
import johnny.algorithm.leetcode.common.ListNode;

public class Solution024Test extends JunitBase {

    @Test
    public void testSwapPairs() {
        System.out.println("swapPairs");
        Solution024 instance = new Solution024();

        assertEquals(null, instance.swapPairs(null));

        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.swapPairs(head2)));

        ListNode head3 = ListNode.createInstance(new int[]{1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{2,1});
        assertTrue(ListNode.isSame(expect3, instance.swapPairs(head3)));

        ListNode head4 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect4 = ListNode.createInstance(new int[]{2,1,3});
        assertTrue(ListNode.isSame(expect4, instance.swapPairs(head4)));

        ListNode head5 = ListNode.createInstance(new int[]{1,2,3,4,5,6});
        ListNode expect5 = ListNode.createInstance(new int[]{2,1,4,3,6,5});
        assertTrue(ListNode.isSame(expect5, instance.swapPairs(head5)));
    }
}
