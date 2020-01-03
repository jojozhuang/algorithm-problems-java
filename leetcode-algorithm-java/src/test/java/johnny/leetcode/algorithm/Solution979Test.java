package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution979;
import johnny.algorithm.common.TreeNode;

public class Solution979Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("distributeCoins");
        Solution979 instance = new Solution979();

        TreeNode root1 = TreeNode.createInstance("3,0,0");
        assertEquals(2, instance.distributeCoins(root1));

        TreeNode root2 = TreeNode.createInstance("0,3,0");
        assertEquals(3, instance.distributeCoins(root2));
        
        TreeNode root3 = TreeNode.createInstance("1,0,2");
        assertEquals(2, instance.distributeCoins(root3));
        
        TreeNode root4 = TreeNode.createInstance("1,0,0,#,3");
        assertEquals(4, instance.distributeCoins(root4));
    }
}
