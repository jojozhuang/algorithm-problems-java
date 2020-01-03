package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.Solution993;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution993Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("smallestFromLeaf");
        Solution993 instance = new Solution993();

        TreeNode root1 = TreeNode.createInstance("1,2,3,4,null,null,null");
        assertEquals(false, instance.isCousins(root1, 4,3));
        
        TreeNode root2 = TreeNode.createInstance("1,2,3,null,4,null,5");
        assertEquals(true, instance.isCousins(root2,5,4));
        
        TreeNode root3 = TreeNode.createInstance("1,2,3,null,4,null,null");
        assertEquals(false, instance.isCousins(root3,2,3));
    }
}
