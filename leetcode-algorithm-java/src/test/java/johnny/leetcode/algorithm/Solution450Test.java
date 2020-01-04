package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

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
