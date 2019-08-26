package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution662;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution662Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("widthOfBinaryTree");
        Solution662 instance = new Solution662();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","3","2","5","3","#","9"});
        assertEquals(4, instance.widthOfBinaryTree(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","3","#","5","3"});
        assertEquals(2, instance.widthOfBinaryTree(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","3","2","5","#","#","#"});
        assertEquals(2, instance.widthOfBinaryTree(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","3","2","5","#","#","9","6","#","#","7"});
        assertEquals(8, instance.widthOfBinaryTree(root4));
    }
}
