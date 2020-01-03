package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution025;
import johnny.algorithm.common.ListNode;

public class Solution025Test extends JunitBase {

    @Test
    public void testReverseKGroup() {
        System.out.println("reverseKGroup");
        Solution025 instance = new Solution025();

        assertEquals(null, instance.reverseKGroup(null, 0));

        ListNode head2 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect2 = ListNode.createInstance(new int[]{2,1,4,3,5});
        assertTrue(ListNode.isSame(expect2, instance.reverseKGroup(head2,2)));

        ListNode head3 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect3 = ListNode.createInstance(new int[]{3,2,1,4,5});
        assertTrue(ListNode.isSame(expect3, instance.reverseKGroup(head3,3)));
    }
}
