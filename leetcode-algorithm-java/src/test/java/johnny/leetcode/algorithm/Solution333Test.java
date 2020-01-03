package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution333;
import johnny.algorithm.common.TreeNode;

public class Solution333Test extends JunitBase {

    @Test
    public void testLargestBSTSubtree() {
        System.out.println("largestBSTSubtree");
        Solution333 instance = new Solution333();

        assertEquals(0, instance.largestBSTSubtree(null));

        TreeNode root2 = TreeNode.createInstance("10,5,15,1,8,null,7");
        assertEquals(3, instance.largestBSTSubtree(root2));
        
        TreeNode root3 = TreeNode.createInstance("3,1,2");
        assertEquals(1, instance.largestBSTSubtree(root3));
        
        TreeNode root4 = TreeNode.createInstance("4,1,null,2,null,3,null");
        assertEquals(1, instance.largestBSTSubtree(root4));
        
        TreeNode root5 = TreeNode.createInstance("3,2,4,null,null,1,null");
        assertEquals(2, instance.largestBSTSubtree(root5));
        
        TreeNode root6 = TreeNode.createInstance("3,1,null,null,2");
        assertEquals(3, instance.largestBSTSubtree(root6));
        
        TreeNode root7 = TreeNode.createInstance("2,3,null,1,null");
        assertEquals(2, instance.largestBSTSubtree(root7));
        
        TreeNode root8 = TreeNode.createInstance("4,2,7,2,3,5,null,2,null,null,null,null,null,1,null");
        assertEquals(2, instance.largestBSTSubtree(root8));
    }
}
