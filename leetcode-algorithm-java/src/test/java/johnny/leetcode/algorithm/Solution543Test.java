package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution543;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution543Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("diameterOfBinaryTree");
        Solution543 instance = new Solution543();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","2","3","4","5","#","#"});
        assertEquals(3, instance.diameterOfBinaryTree(root1));
    }
}
