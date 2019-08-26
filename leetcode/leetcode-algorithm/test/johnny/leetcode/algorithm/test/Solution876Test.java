package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution876;
import johnny.leetcode.algorithm.common.ListNode;

public class Solution876Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSimilarGroups");
        Solution876 instance = new Solution876();

        ListNode head1 = ListNode.createInstance(new int[] {1,2,3,4,5});
        ListNode result1 = instance.middleNode(head1);
        ListNode expect1 = ListNode.createInstance(new int[] {3,4,5});
        assertTrue(ListNode.isSame(expect1, result1));

        ListNode head2 = ListNode.createInstance(new int[] {1,2,3,4,5,6});
        ListNode result2 = instance.middleNode(head2);
        ListNode expect2 = ListNode.createInstance(new int[] {4,5,6});
        assertTrue(ListNode.isSame(expect2, result2));
    }
}
