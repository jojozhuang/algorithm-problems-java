package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution173Test extends JunitBase {

    @Test
    public void testTreeIterator() {
        System.out.println("treeIterator");
        TreeNode root = new TreeNode(1);
        Solution173 instance = new Solution173(root);
        assertEquals(1, instance.next());

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","#","2","#","3"});
        Solution173 instance1 = new Solution173(root1);
        assertEquals(true, instance1.hasNext());
        assertEquals(1, instance1.next());
        assertEquals(2, instance1.next());
        assertEquals(true, instance1.hasNext());
        assertEquals(3, instance1.next());
        assertEquals(false, instance1.hasNext());

        TreeNode root2 = TreeNode.createInstance(new String[] {"4","2","#","1","3"});
        Solution173 instance2 = new Solution173(root2);
        assertEquals(1, instance2.next());
        assertEquals(2, instance2.next());
        assertEquals(3, instance2.next());
        assertEquals(true, instance2.hasNext());
        assertEquals(4, instance2.next());
        assertEquals(false, instance1.hasNext());

        TreeNode root3 = TreeNode.createInstance("10,1,11,#,6,#,12");
        Solution173 instance3 = new Solution173(root3);
        assertEquals(1, instance3.next());
        assertEquals(6, instance3.next());
        assertEquals(10, instance3.next());
        assertEquals(true, instance3.hasNext());
        assertEquals(11, instance3.next());
        assertEquals(true, instance3.hasNext());
        assertEquals(12, instance3.next());
        assertEquals(false, instance3.hasNext());
    }
}
