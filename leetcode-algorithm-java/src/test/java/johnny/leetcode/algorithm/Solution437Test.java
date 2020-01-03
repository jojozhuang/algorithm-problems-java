package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution437;
import johnny.algorithm.common.TreeNode;

public class Solution437Test extends JunitBase {

    @Test
    public void testPathSum() {
        System.out.println("pathSum");
        Solution437 instance = new Solution437();

        TreeNode r1 = TreeNode.createInstance(new String[] {"3"});
        assertEquals(0, instance.pathSum(r1, 4));

        TreeNode r2 = TreeNode.createInstance(new String[] {"3", "1","#"});
        assertEquals(1, instance.pathSum(r2, 4));

        TreeNode r3 = TreeNode.createInstance(new String[] {"-1", "#","-2"});
        assertEquals(1, instance.pathSum(r3, -3));

        TreeNode r4 = TreeNode.createInstance(new String[] {"-1", "#","-2"});
        assertEquals(1, instance.pathSum(r4, -2));

        TreeNode r5 = TreeNode.createInstance(new String[] {"8","-3","-2","6","5","4","7"});
        assertEquals(2, instance.pathSum(r5, 10));

        TreeNode r6 = TreeNode.createInstance(new String[] {"10","5","-3","3","2","#","11","3","-2","#","1"});
        assertEquals(3, instance.pathSum(r6, 8));

        TreeNode r7 = TreeNode.createInstance(new String[] {"5","4","8","11","#","13","4","7","2","#","#","5","1"});
        assertEquals(3, instance.pathSum(r7, 22));
    }
}
