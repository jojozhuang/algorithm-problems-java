package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution141Test extends JunitBase {

    @Test
    public void testHasCycle() {
        System.out.println("hasCycle");
        Solution141 instance = new Solution141();

        //Input: 1 -> 2 -> 3
        ListNode head2 = ListNode.createInstance(new int[]{1,2,3});
        assertEquals(false, instance.hasCycle(head2));

        //Input: 1 -> 2 -> 3, 3 -> head 1
        ListNode head3 = ListNode.createInstance(new int[]{1,2,3});
        head3.next.next.next = head3;
        assertEquals(true, instance.hasCycle(head3));
    }
}
