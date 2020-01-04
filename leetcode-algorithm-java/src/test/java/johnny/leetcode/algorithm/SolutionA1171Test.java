package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionA1171Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("removeZeroSumSublists");
        SolutionA1171 instance = new SolutionA1171();

        ListNode head1 = ListNode.createInstance(new int[] {1,2,-3,3,1});
        ListNode result1 = instance.removeZeroSumSublists(head1);
        ListNode expect1 = ListNode.createInstance(new int[] {3,1});
        assertTrue(ListNode.isSame(expect1, result1));
        
        ListNode head2 = ListNode.createInstance(new int[] {1,2,3,-3,4});
        ListNode result2 = instance.removeZeroSumSublists(head2);
        ListNode expect2 = ListNode.createInstance(new int[] {1,2,4});
        assertTrue(ListNode.isSame(expect2, result2));
        
        ListNode head3 = ListNode.createInstance(new int[] {1,2,3,-3,-2});
        ListNode result3 = instance.removeZeroSumSublists(head3);
        ListNode expect3 = ListNode.createInstance(new int[] {1});
        assertTrue(ListNode.isSame(expect3, result3));
        
        ListNode head4 = ListNode.createInstance(new int[] {0});
        ListNode result4 = instance.removeZeroSumSublists(head4);
        ListNode expect4 = ListNode.createInstance(new int[] {});
        assertTrue(ListNode.isSame(expect4, result4));
    }
}
