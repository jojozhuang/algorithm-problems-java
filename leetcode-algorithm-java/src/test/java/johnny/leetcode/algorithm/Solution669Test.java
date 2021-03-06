package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Solution669Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("trimBST");
        Solution669 instance = new Solution669();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","0","2"});
        TreeNode result1 = TreeNode.createInstance(new String[] {"1","#","2"});
        assertTrue(TreeNode.isSame(result1, instance.trimBST(root1, 1, 2)));

        TreeNode root2 = TreeNode.createInstance(new String[] {"3","0","4","#","2","#","#","1","#"});
        TreeNode result2 = TreeNode.createInstance(new String[] {"3","2","#","1","#"});
        assertTrue(TreeNode.isSame(result2, instance.trimBST(root2, 1, 3)));
    }
}
