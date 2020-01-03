package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution021;
import johnny.algorithm.common.ListNode;

public class Solution021Test extends JunitBase {

    @Test
    public void testMergeTwoLists() {
        System.out.println("mergeTwoLists");
        Solution021 instance = new Solution021();

        assertEquals(null, instance.mergeTwoLists(null, null));

        //{1,2,4},{1,3,4}
        ListNode l21 = ListNode.createInstance(new int[]{1,2,4});
        ListNode l22 = ListNode.createInstance(new int[]{1,3,4});
        ListNode expect2 = ListNode.createInstance(new int[]{1,1,2,3,4,4});
        assertTrue(ListNode.isSame(expect2, instance.mergeTwoLists(l21, l22)));

        //{1,3,8,11},{2}
        ListNode l31 = ListNode.createInstance(new int[]{1,3,8,11});
        ListNode l32 = ListNode.createInstance(new int[]{2});
        ListNode expect3 = ListNode.createInstance(new int[]{1,2,3,8,11});
        assertTrue(ListNode.isSame(expect3, instance.mergeTwoLists(l31, l32)));
    }
}
