package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution654;
import johnny.algorithm.common.TreeNode;

public class Solution654Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("constructMaximumBinaryTree");
        Solution654 instance = new Solution654();

        TreeNode result1 = TreeNode.createInstance(new String[] {"6","3","5","#","2","0","#","#","1","#","#"});
        assertTrue(TreeNode.isSame(result1, instance.constructMaximumBinaryTree(new int[] {3,2,1,6,0,5})));

        TreeNode result2 = TreeNode.createInstance("5,2,4,#,1,3,#");
        assertTrue(TreeNode.isSame(result2, instance.constructMaximumBinaryTree(new int[] {2,1,5,3,4})));
        TreeNode result3 = TreeNode.createInstance("5,2,4,#,1,#,3");
        assertTrue(TreeNode.isSame(result3, instance.constructMaximumBinaryTree(new int[] {2,1,5,4,3})));
    }
}
