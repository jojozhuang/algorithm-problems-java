package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA5001Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestMultipleOfThree");
        SolutionA5001 instance = new SolutionA5001();

        ListNode head1 = ListNode.createInstance(new int[]{4,2,8});
        TreeNode root1 = TreeNode.createInstance("1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3");
        assertEquals(true, instance.isSubPath(head1, root1));

        ListNode head2 = ListNode.createInstance(new int[]{1,4,2,6});
        TreeNode root2 = TreeNode.createInstance("1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3");
        assertEquals(true, instance.isSubPath(head2, root2));
    }
}
