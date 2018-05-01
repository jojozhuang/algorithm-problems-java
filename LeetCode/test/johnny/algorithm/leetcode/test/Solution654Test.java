package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution654;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution654Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("constructMaximumBinaryTree");
        Solution654 instance = new Solution654();

        TreeNode result1 = TreeNode.createInstance(new String[] {"6","3","5","#","2","0","#","#","1","#","#"});
        assertTrue(TreeNode.isSame(result1, instance.constructMaximumBinaryTree(new int[] {3,2,1,6,0,5})));
    }
}
