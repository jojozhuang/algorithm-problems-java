package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Solution701Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("insertIntoBST");
        Solution701 instance = new Solution701();

        TreeNode root1 = TreeNode.createInstance("4,2,7,1,3,null,null");
        TreeNode expect1 = TreeNode.createInstance("4,2,7,1,3,5,null");
        TreeNode result1 = instance.insertIntoBST(root1, 5);
        assertTrue(TreeNode.isSame(expect1, result1));

        TreeNode root2 = TreeNode.createInstance("40,20,60,10,30,50,70");
        TreeNode expect2 = TreeNode.createInstance("40,20,60,10,30,50,70,null,null,25,null,null,null,null,null");
        TreeNode result2 = instance.insertIntoBST(root2, 25);
        assertTrue(TreeNode.isSame(expect2, result2));

        TreeNode root3 = TreeNode.createInstance("4,2,7,1,3,null,null,null,null,null,null");
        TreeNode expect3 = TreeNode.createInstance("4,2,7,1,3,5,#");
        TreeNode result3 = instance.insertIntoBST(root3, 5);
        assertTrue(TreeNode.isSame(expect3, result3));
    }
}
