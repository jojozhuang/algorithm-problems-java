package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution099;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution099Test extends JunitBase {

    @Test
    public void testRecoverTree() {
        System.out.println("recoverTree");
        TreeNode root = null;
        Solution099 instance = new Solution099();
        instance.recoverTree(root);
        assertEquals(null, root);

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","3","#","#","2"});
        TreeNode expect2 = TreeNode.createInstance(new String[] {"3","1","#","#","2"});
        instance.recoverTree(root2);
        assertTrue(TreeNode.isSame(expect2, root2));

        Solution099 instance2 = new Solution099();
        TreeNode root3 = TreeNode.createInstance(new String[] {"3","1","4","#","#","2","#"});
        TreeNode expect3 = TreeNode.createInstance(new String[] {"2","1","4","#","#","3","#"});
        instance2.recoverTree(root3);
        assertTrue(TreeNode.isSame(expect3, root3));
    }
}
