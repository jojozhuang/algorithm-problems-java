package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class InsertNodeinaBinarySearchTreeTest extends JunitBase {

    /**
     * Test of insertNode method, of class InsertNodeinaBinarySearchTree.
     */
    @Test
    public void testInsertNode() {
        System.out.println("insertNode");
        TreeNode root = null;
        TreeNode node = null;
        InsertNodeinaBinarySearchTree instance = new InsertNodeinaBinarySearchTree();
        TreeNode expResult = null;
        TreeNode result = instance.insertNode(root, node);
        assertEquals(expResult, result);
        
        TreeNode root1 = null;
        TreeNode node1 = TreeNode.createInstance(new String[] {"1"});
        TreeNode result1 = instance.insertNode(root1, node1);
        assertEquals(1, result1.val);
        assertEquals(null, result1.left);
        assertEquals(null, result1.right);
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"2","1", "#"});
        TreeNode node2 = TreeNode.createInstance(new String[] {"3"});
        TreeNode result2 = instance.insertNode(root2, node2);
        assertEquals(2, result2.val);
        assertEquals(1, result2.left.val);
        assertEquals(3, result2.right.val);
        
        TreeNode root3 = TreeNode.createInstance(new String[] {"4","2","#"});
        TreeNode node3 = TreeNode.createInstance(new String[] {"3"});
        TreeNode result3 = instance.insertNode(root3, node3);
        assertEquals(4, result3.val);
        assertEquals(2, result3.left.val);
        assertEquals(3, result3.left.right.val);

        TreeNode root4 = TreeNode.createInstance(new String[] {"2","1","4","#","#","3","#"});
        TreeNode node4 = TreeNode.createInstance(new String[] {"6"});
        TreeNode result4 = instance.insertNode(root4, node4);
        assertEquals(2, result4.val);
        assertEquals(1, result4.left.val);
        assertEquals(4, result4.right.val);
        assertEquals(3, result4.right.left.val);
        assertEquals(6, result4.right.right.val);
    }

    /**
     * Test of insertNode2 method, of class InsertNodeinaBinarySearchTree.
     */
    @Test
    public void testInsertNode2() {
        System.out.println("insertNode2");
        TreeNode root = null;
        TreeNode node = null;
        InsertNodeinaBinarySearchTree instance = new InsertNodeinaBinarySearchTree();
        TreeNode expResult = null;
        TreeNode result = instance.insertNode2(root, node);
        assertEquals(expResult, result);
        
        TreeNode root1 = null;
        TreeNode node1 = TreeNode.createInstance(new String[] {"1"});
        TreeNode result1 = instance.insertNode2(root1, node1);
        assertEquals(1, result1.val);
        assertEquals(null, result1.left);
        assertEquals(null, result1.right);
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"2","1", "#"});
        TreeNode node2 = TreeNode.createInstance(new String[] {"3"});
        TreeNode result2 = instance.insertNode2(root2, node2);
        assertEquals(2, result2.val);
        assertEquals(1, result2.left.val);
        assertEquals(3, result2.right.val);
        
        TreeNode root3 = TreeNode.createInstance(new String[] {"4","2","#"});
        TreeNode node3 = TreeNode.createInstance(new String[] {"3"});
        TreeNode result3 = instance.insertNode2(root3, node3);
        assertEquals(4, result3.val);
        assertEquals(2, result3.left.val);
        assertEquals(3, result3.left.right.val);

        TreeNode root4 = TreeNode.createInstance(new String[] {"2","1","4","#","#","3","#"});
        TreeNode node4 = TreeNode.createInstance(new String[] {"6"});
        TreeNode result4 = instance.insertNode2(root4, node4);
        assertEquals(2, result4.val);
        assertEquals(1, result4.left.val);
        assertEquals(4, result4.right.val);
        assertEquals(3, result4.right.left.val);
        assertEquals(6, result4.right.right.val);
    }
}
