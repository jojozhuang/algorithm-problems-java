package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution817;
import johnny.algorithm.leetcode.common.ListNode;

public class Solution817Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numComponents");
        Solution817 instance = new Solution817();

        ListNode head1 = ListNode.createInstance(new int[]{0,1,2,3});
        assertEquals(2, instance.numComponents(head1, new int[] {0, 1, 3}));

        ListNode head2 = ListNode.createInstance(new int[]{0,1,2,3,4});
        assertEquals(2, instance.numComponents(head2, new int[] {0, 3, 1, 4}));

        ListNode head3 = ListNode.createInstance(new int[]{0,1,2,3,4,5,6,7});
        assertEquals(4, instance.numComponents(head3, new int[] {0, 2, 3, 5, 7}));
    }
}
