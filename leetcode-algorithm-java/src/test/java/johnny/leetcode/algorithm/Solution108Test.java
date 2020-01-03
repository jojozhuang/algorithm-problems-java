package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution108;
import johnny.algorithm.common.TreeNode;

public class Solution108Test extends JunitBase {

    @Test
    public void testSortedArrayToBST() {
        System.out.println("sortedArrayToBST");
        Solution108 instance = new Solution108();

        assertEquals(null, instance.sortedArrayToBST(null));

        TreeNode result1 = instance.sortedArrayToBST(new int[] {1,2,3});
        TreeNode expect1 = TreeNode.createInstance(new String[] {"2","1","3"});
        assertTrue(TreeNode.isSame(expect1, result1));

        TreeNode result2 = instance.sortedArrayToBST(new int[] {1,2,3,4,5,6,7,8,9});
        TreeNode expect2 = TreeNode.createInstance(new String[] {"5","2","7","1","3","6","8","#","#","#","4","#","#","#","9"});
        assertTrue(TreeNode.isSame(expect2, result2));
        
        /*
        TreeNode result2 = instance.sortedArrayToBST(new int[] {1,2,3,4,5,6,7,8,9});
        TreeNode expect2 = TreeNode.createInstance(new String[] {"5","3","8","2","4","7","9","1","#","#","#","6","#"});
        assertTrue(TreeNode.isSame(expect2, result2));
        */

    }
}
