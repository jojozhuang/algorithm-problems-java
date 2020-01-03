package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution450;
import johnny.algorithm.common.TreeNode;

public class Solution450Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("deleteNode");
        Solution450 instance = new Solution450();

        TreeNode root1 = TreeNode.createInstance(new String[] {"5","3","6","2","4","#","7"});
        TreeNode expect1 = TreeNode.createInstance(new String[] {"5","4","6","2","#","#","7"});
        assertTrue(TreeNode.isSame(expect1, instance.deleteNode(root1, 3)));
    }
}
