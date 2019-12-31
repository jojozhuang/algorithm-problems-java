package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution086;
import johnny.leetcode.algorithm.common.ListNode;

public class Solution086Test extends JunitBase {

    @Test
    public void testPartition() {
        System.out.println("partition");
        Solution086 instance = new Solution086();

        assertEquals(null, instance.partition(null, 0));

        ListNode head2 = ListNode.createInstance(new int[]{1,3,2});
        ListNode expect2 = ListNode.createInstance(new int[]{1,3,2});
        assertTrue(ListNode.isSame(expect2, instance.partition(head2,2)));

        ListNode head3 = ListNode.createInstance(new int[]{1,4,3,2,5,2});
        ListNode expect3 = ListNode.createInstance(new int[]{1,2,2,4,3,5});
        assertTrue(ListNode.isSame(expect3, instance.partition(head3,3)));
    }
}
