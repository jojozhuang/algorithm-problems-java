package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution742;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution742Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findClosestLeaf");
        Solution742 instance = new Solution742();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","3","2"});
        assertEquals(3, instance.findClosestLeaf(root1, 1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","#","#"});
        assertEquals(1, instance.findClosestLeaf(root2, 1));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","3","4","#","#","#","5","#","6","#"});
        assertEquals(3, instance.findClosestLeaf(root3, 2));
    }
}
