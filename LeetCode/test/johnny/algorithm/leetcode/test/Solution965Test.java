package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution965;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution965Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isUnivalTree");
        Solution965 instance = new Solution965();

        TreeNode root1 = TreeNode.createInstance("1,1,1,1,1,null,1");
        assertEquals(true, instance.isUnivalTree(root1));
        
        TreeNode root2 = TreeNode.createInstance("2,2,2,5,2");
        assertEquals(false, instance.isUnivalTree(root2));
    }
}
