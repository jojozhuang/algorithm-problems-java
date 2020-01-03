package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution817;
import johnny.algorithm.common.ListNode;

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

        ListNode head4 = ListNode.createInstance(new int[]{0,1,2,3,4});
        assertEquals(2, instance.numComponents(head4, new int[] {0, 2, 1, 4}));

        ListNode head5 = ListNode.createInstance(new int[]{0,2,3,1,4});
        assertEquals(2, instance.numComponents(head5, new int[] {0, 2, 1, 4}));

        ListNode head6 = ListNode.createInstance(new int[]{3,2,0,1,4});
        assertEquals(1, instance.numComponents(head6, new int[] {0, 2, 1, 4}));
        
        ListNode head7 = ListNode.createInstance(new int[]{4,2,0,1,3});
        assertEquals(1, instance.numComponents(head7, new int[] {0, 2, 1, 4}));
    }
}
