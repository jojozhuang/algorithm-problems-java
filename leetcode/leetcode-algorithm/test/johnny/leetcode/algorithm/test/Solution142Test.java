package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution142;
import johnny.leetcode.algorithm.common.ListNode;

public class Solution142Test extends JunitBase {

    @Test
    public void testDetectCycle() {
        System.out.println("detectCycle");
        Solution142 instance = new Solution142();

        //Input: 1 -> 2 -> 3
        ListNode head2 = ListNode.createInstance(new int[]{1,2,3});
        assertEquals(null, instance.detectCycle(head2));

        //Input: 1 -> 2 -> 3, 3 -> head 1
        ListNode head3 = ListNode.createInstance(new int[]{1,2,3});
        head3.next.next.next = head3;
        assertEquals(head3, instance.detectCycle(head3));
    }
}
