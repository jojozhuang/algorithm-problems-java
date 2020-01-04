package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution100Test extends JunitBase {

    @Test
    public void testIsSameTree() {
        System.out.println("isSameTree");
        Solution100 instance = new Solution100();

        assertEquals(true, instance.isSameTree(null, null));

        TreeNode p2 = new TreeNode(1);
        TreeNode q2 = null;
        assertEquals(false, instance.isSameTree(p2, q2));

        TreeNode p3 = new TreeNode(1);
        TreeNode q3 = new TreeNode(1);
        assertEquals(true, instance.isSameTree(p3, q3));

        TreeNode p4 = TreeNode.createInstance(new String[] {"1","2","#"});
        TreeNode q4 = new TreeNode(1);
        assertEquals(false, instance.isSameTree(p4, q4));

        TreeNode p5 = TreeNode.createInstance(new String[] {"1","2","#"});
        TreeNode q5 = TreeNode.createInstance(new String[] {"1","#","2"});
        assertEquals(false, instance.isSameTree(p5, q5));

        TreeNode p6 = TreeNode.createInstance(new String[] {"1","2","3"});
        TreeNode q6 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(true, instance.isSameTree(p6, q6));
    }
}
