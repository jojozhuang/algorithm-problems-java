package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution663;
import johnny.algorithm.common.TreeNode;

public class Solution663Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("checkEqualTree");
        Solution663 instance = new Solution663();

        TreeNode root1 = TreeNode.createInstance("5,10,10,#,#,2,3");
        assertEquals(true, instance.checkEqualTree(root1));

        TreeNode root2 = TreeNode.createInstance("1,2,10,#,#,2,20");
        assertEquals(false, instance.checkEqualTree(root2));
        
        TreeNode root3 = TreeNode.createInstance("0,-1,1");
        assertEquals(false, instance.checkEqualTree(root3));
        
        TreeNode root4 = TreeNode.createInstance("-9,-3,2,null,4,4,0,-6,null,-5,null");
        assertEquals(false, instance.checkEqualTree(root4));
    }
}
