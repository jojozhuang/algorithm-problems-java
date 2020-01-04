package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution156Test extends JunitBase {

    @Test
    public void testUpsideDownBinaryTree() {
        System.out.println("upsideDownBinaryTree");
        Solution156 instance = new Solution156();

        assertEquals(null, instance.upsideDownBinaryTree(null));
        TreeNode expect2 = TreeNode.createInstance(new String[] {"4","5","2","#","#","3","1"});
        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","3","4","5"});
        assertTrue(TreeNode.isSame(expect2, instance.upsideDownBinaryTree(root2)));
    }
}
