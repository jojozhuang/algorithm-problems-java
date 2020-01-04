package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution105Test extends JunitBase {

    @Test
    public void testBuildTree() {
        System.out.println("buildTree");
        Solution105 instance = new Solution105();

        assertEquals(null, instance.buildTree(null, null));

        TreeNode result1 = instance.buildTree(new int[]{1}, new int[]{1});
        TreeNode expect1 = TreeNode.createInstance(new String[]{"1"});
        assertTrue(TreeNode.isSame(result1, expect1));

        TreeNode result2 = instance.buildTree(new int[]{1,2}, new int[]{2,1});
        TreeNode expect2 = TreeNode.createInstance(new String[]{"1","2","#"});
        assertTrue(TreeNode.isSame(result2, expect2));

        TreeNode result3 = instance.buildTree(new int[]{2,1,4,3}, new int[]{1,2,3,4});
        TreeNode expect3 = TreeNode.createInstance(new String[]{"2","1","4","#","#","3","#"});
        assertTrue(TreeNode.isSame(result3, expect3));

        TreeNode result4 = instance.buildTree(new int[] {1,2,4,5,3,6,7}, new int[] {4,2,5,1,6,3,7});
        TreeNode expect4 = TreeNode.createInstance(new String[]{"1","2","3","4","5","6","7"});
        assertTrue(TreeNode.isSame(result4, expect4));

        TreeNode result5 = instance.buildTree(new int[] {1, 2, 3}, new int[] {3, 2, 1});
        TreeNode expect5 = TreeNode.createInstance(new String[]{"1","2","#","3","#"});
        assertTrue(TreeNode.isSame(result5, expect5));
    }
}
