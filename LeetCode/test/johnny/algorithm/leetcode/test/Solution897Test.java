package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution897;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution897Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("increasingBST");
        Solution897 instance = new Solution897();

        TreeNode root1 = TreeNode.createInstance("1,2,3");
        TreeNode expect1 = TreeNode.createInstance("2,#,1,#,3");
        TreeNode result1 = instance.increasingBST(root1);
        assertTrue(TreeNode.isSame(expect1, result1));
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"5","3","6","2","4","#","8","1","#","#","#","7","9"});
        TreeNode expect2 = TreeNode.createInstance(new String[] {"1","#","2","#","3","#","4","#","5","#","6","#","7","#","8","#","9","#","#"});
        TreeNode result2 = instance.increasingBST(root2);
        assertTrue(TreeNode.isSame(expect2, result2));
    }
}
