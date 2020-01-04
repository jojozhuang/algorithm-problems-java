package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution270Test extends JunitBase {

    @Test
    public void testClosestValue() {
        System.out.println("closestValue");
        Solution270 instance = new Solution270();

        assertEquals(Integer.MAX_VALUE, instance.closestValue(null, 0.0));

        TreeNode root2 = TreeNode.createInstance(new String[] {"4"});
        assertEquals(4, instance.closestValue(root2, 3));
        assertEquals(4, instance.closestValue(root2, 5));

        TreeNode root3 = TreeNode.createInstance(new String[] {"4","1","7"});
        assertEquals(7, instance.closestValue(root3, 6));
        assertEquals(1, instance.closestValue(root3, 2));
        assertEquals(4, instance.closestValue(root3, 3));
        
        TreeNode root4 = TreeNode.createInstance(new String[] {"4","2","5","1","3","#","#"});
        assertEquals(4, instance.closestValue(root4, 4.3));
        assertEquals(5, instance.closestValue(root4, 4.6));
        assertEquals(5, instance.closestValue(root4, 5.6));
        assertEquals(2, instance.closestValue(root4, 2.5));
        assertEquals(3, instance.closestValue(root4, 2.6));
        assertEquals(1, instance.closestValue(root4, 1.2));

        TreeNode root5 = TreeNode.createInstance(new String[] {"5","2","6","#","3","#","7"});
        assertEquals(5, instance.closestValue(root5, 4.6));
        assertEquals(6, instance.closestValue(root5, 5.6));
    }
}
