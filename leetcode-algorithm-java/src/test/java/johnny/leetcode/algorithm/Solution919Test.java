package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution919Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("CBTInserter");
        
        TreeNode root1 = TreeNode.createInstance(new String[] {"1","#","#"});
        Solution919 instance1 = new Solution919(root1);
        assertEquals(1, instance1.insert(2));
        TreeNode expect1 = TreeNode.createInstance(new String[] {"1","2","#"});
        TreeNode result1 = instance1.get_root();
        assertTrue(TreeNode.isSame(expect1, result1));
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","3","4","5","6","#"});
        Solution919 instance2 = new Solution919(root2);
        assertEquals(3, instance2.insert(7));
        assertEquals(4, instance2.insert(8));
        TreeNode expect2 = TreeNode.createInstance(new String[] {"1","2","3","4","5","6","7","8","#"});
        TreeNode result2 = instance2.get_root();
        assertTrue(TreeNode.isSame(expect2, result2));
        
        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","#"});
        Solution919 instance3 = new Solution919(root3);
        assertEquals(1, instance3.insert(3));
        assertEquals(2, instance3.insert(4));
        TreeNode expect3 = TreeNode.createInstance(new String[] {"1","2","3","4","#"});
        TreeNode result3 = instance3.get_root();
        assertTrue(TreeNode.isSame(expect3, result3));
        
        TreeNode root4 = TreeNode.createInstance(new String[] {"1","#","#"});
        Solution919 instance4 = new Solution919(root4);
        assertEquals(1, instance4.insert(2));
        assertEquals(1, instance4.insert(3));
        assertEquals(2, instance4.insert(4));
        assertEquals(2, instance4.insert(5));
        assertEquals(3, instance4.insert(6));
        TreeNode expect4 = TreeNode.createInstance(new String[] {"1","2","3","4","5","6","#"});
        TreeNode result4 = instance4.get_root();
        assertTrue(TreeNode.isSame(expect4, result4));
    }
}
