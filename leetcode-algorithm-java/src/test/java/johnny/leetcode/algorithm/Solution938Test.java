package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution938;
import johnny.algorithm.common.TreeNode;

public class Solution938Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validMountainArray");
        Solution938 instance = new Solution938();

        TreeNode root1 = TreeNode.createInstance("10,5,15,3,7,null,18");
        assertEquals(32, instance.rangeSumBST(root1, 7, 15));

        TreeNode root2 = TreeNode.createInstance("10,5,15,3,7,13,18,1,null,6,null");
        assertEquals(23, instance.rangeSumBST(root2, 6, 10));
    }
}
