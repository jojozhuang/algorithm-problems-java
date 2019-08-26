package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution109;
import johnny.leetcode.algorithm.common.ListNode;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution109Test extends JunitBase {

    @Test
    public void testSortedListToBST() {
        System.out.println("sortedListToBST");
        Solution109 instance = new Solution109();

        assertEquals(null, instance.sortedListToBST(null));

        ListNode head2 = ListNode.createInstance(new int[]{1,2});
        TreeNode expect2 = TreeNode.createInstance(new String[] {"2","1","#"});
        assertTrue(TreeNode.isSame(expect2, instance.sortedListToBST(head2)));

        ListNode head3 = ListNode.createInstance(new int[]{1,2,3});
        TreeNode expect3 = TreeNode.createInstance(new String[] {"2","1","3"});
        assertTrue(TreeNode.isSame(expect3, instance.sortedListToBST(head3)));

        ListNode head4 = ListNode.createInstance(new int[]{1,2,3,4,5,6,7,8,9});
        TreeNode expect4 = TreeNode.createInstance(new String[] {"5","3","8","2","4","7","9","1","#","#","#","6","#"});
        assertTrue(TreeNode.isSame(expect4, instance.sortedListToBST(head4)));
    }
}
