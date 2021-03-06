package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution958Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isCompleteTree");
        Solution958 instance = new Solution958();

        TreeNode root1 = TreeNode.createInstance("1,2,3,4,5,6,#");
        assertEquals(true, instance.isCompleteTree(root1));

        TreeNode root2 = TreeNode.createInstance("1,2,3,4,5,#,7");
        assertEquals(false, instance.isCompleteTree(root2));
        
        TreeNode root3 = TreeNode.createInstance("1,2,3,4,5,6,7,8,9,10,11,12,13,null,null,15,null");
        assertEquals(false, instance.isCompleteTree(root3));
        
    }
}
