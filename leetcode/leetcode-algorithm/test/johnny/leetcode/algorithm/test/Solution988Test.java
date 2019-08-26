package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution988;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution988Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("smallestFromLeaf");
        Solution988 instance = new Solution988();

        TreeNode root1 = TreeNode.createInstance("0,1,2,3,4,3,4");
        assertEquals("dba", instance.smallestFromLeaf(root1));
        
        TreeNode root2 = TreeNode.createInstance("25,1,3,1,3,0,2");
        assertEquals("adz", instance.smallestFromLeaf(root2));
        
        TreeNode root3 = TreeNode.createInstance("2,2,1,null,1,0,null,0,null,null,null");
        assertEquals("abc", instance.smallestFromLeaf(root3));
    }
}
