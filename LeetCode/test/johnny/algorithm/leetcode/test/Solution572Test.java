package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution572;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution572Test extends JunitBase {

    @Test
    public void testIsSubtree() {
        System.out.println("isSubtree");
        Solution572 instance = new Solution572();

        TreeNode s1 = TreeNode.createInstance(new String[] {"1"});
        TreeNode t1 = TreeNode.createInstance(new String[] {"1"});
        assertEquals(true, instance.isSubtree(s1, t1));

        TreeNode s2 = TreeNode.createInstance(new String[] {"1","2","#"});
        TreeNode t2 = TreeNode.createInstance(new String[] {"1"});
        assertEquals(false, instance.isSubtree(s2, t2));

        TreeNode s3 = TreeNode.createInstance(new String[] {"1","2","#"});
        TreeNode t3 = TreeNode.createInstance(new String[] {"2"});
        assertEquals(true, instance.isSubtree(s3, t3));

        TreeNode s4 = TreeNode.createInstance(new String[] {"1","2","#"});
        TreeNode t4 = TreeNode.createInstance(new String[] {"3"});
        assertEquals(false, instance.isSubtree(s4, t4));

        TreeNode s5 = TreeNode.createInstance(new String[] {"3","4","5","1","2","#","#"});
        TreeNode t5 = TreeNode.createInstance(new String[] {"4","1","2"});
        assertEquals(true, instance.isSubtree(s5, t5));

        TreeNode s6 = TreeNode.createInstance(new String[] {"3","4","5","1","2","#","#","#","#","0","#"});
        TreeNode t6 = TreeNode.createInstance(new String[] {"4","1","2"});
        assertEquals(false, instance.isSubtree(s6, t6));
        
        TreeNode s7 = TreeNode.createInstance("1,1,#");
        TreeNode t7 = TreeNode.createInstance(new String[] {"1"});
        assertEquals(true, instance.isSubtree(s7, t7));
    }
}
