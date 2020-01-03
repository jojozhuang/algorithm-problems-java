package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution230;
import johnny.algorithm.common.TreeNode;

public class Solution230Test extends JunitBase {

    @Test
    public void testKthSmallest() {
        System.out.println("kthSmallest");
        Solution230 instance = new Solution230();

        assertEquals(Integer.MIN_VALUE, instance.kthSmallest(null, 0));

        TreeNode root2 = TreeNode.createInstance(new String[] {"2","1", "#"});
        assertEquals(1, instance.kthSmallest(root2, 1));
        TreeNode root3 = TreeNode.createInstance(new String[] {"2","1", "#"});
        assertEquals(2, instance.kthSmallest(root3, 2));
        TreeNode root4 = TreeNode.createInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(2, instance.kthSmallest(root4, 1));
        TreeNode root5 = TreeNode.createInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(3, instance.kthSmallest(root5, 2));
        TreeNode root6 = TreeNode.createInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(4, instance.kthSmallest(root6, 3));
        TreeNode root7 = TreeNode.createInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(5, instance.kthSmallest(root7, 4));
        TreeNode root8 = TreeNode.createInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(6, instance.kthSmallest(root8, 5));
        TreeNode root9 = TreeNode.createInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(7, instance.kthSmallest(root9, 6));
    }
}
