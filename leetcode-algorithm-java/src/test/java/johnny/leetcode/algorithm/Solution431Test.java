package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution431;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution431Test extends JunitBase {

    @Test
    public void testEncodeTree() {
        System.out.println("encodeTree");
        Solution431 instance = new Solution431();
        
        assertEquals(null, instance.encode(null));

        Solution431.Node root2 = instance.deserialize("1,0");
        TreeNode tree2 = TreeNode.createInstance(new String[] {"1"});
        assertTrue(TreeNode.isSame(tree2, instance.encode(root2)));
        Solution431.Node decodedRoot2 = instance.decode(tree2);
        assertEquals("1,0", instance.serialize(decodedRoot2));

        Solution431.Node root3 = instance.deserialize("1,1,4,0");
        TreeNode tree3 = TreeNode.createInstance(new String[] {"1","4","#"});
        assertTrue(TreeNode.isSame(tree3, instance.encode(root3)));
        Solution431.Node decodedRoot3 = instance.decode(tree3);
        assertEquals("1,1,4,0", instance.serialize(decodedRoot3));
        
        Solution431.Node root4 = instance.deserialize("1,2,2,0,3,0");
        TreeNode tree4 = TreeNode.createInstance(new String[] {"1","2","#","#","3"});
        assertTrue(TreeNode.isSame(tree4, instance.encode(root4)));
        Solution431.Node decodedRoot4 = instance.decode(tree4);
        assertEquals("1,2,2,0,3,0", instance.serialize(decodedRoot4));

        Solution431.Node root5 = instance.deserialize("1,3,3,2,5,0,6,0,2,0,4,0");
        TreeNode tree5 = TreeNode.createInstance(new String[] {"1","3","#","5","2","#","6","#","4"});
        assertTrue(TreeNode.isSame(tree5, instance.encode(root5)));
        Solution431.Node decodedRoot5 = instance.decode(tree5);
        assertEquals("1,3,3,2,5,0,6,0,2,0,4,0", instance.serialize(decodedRoot5));
    }
}
