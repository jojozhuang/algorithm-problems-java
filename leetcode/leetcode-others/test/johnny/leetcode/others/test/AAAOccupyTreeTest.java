package johnny.leetcode.others.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.others.AAAOccupyTree;
import johnny.leetcode.others.common.TreeNode;

public class AAAOccupyTreeTest extends JunitBase {

    /*
     * 
     *       1
         2       3
       4   5       6
     7           8   9
               10      11
                 12  13
               14      15
     */
    @Test
    public void testOccupyTree() {
        System.out.println("occupyTreeNode");
        AAAOccupyTree tree = new AAAOccupyTree();
        TreeNode root = TreeNode.createInstance("1,2,3,4,5,#,6,7,#,#,#,8,9,#,#,10,#,#,11,#,12,13,#,14,#,#,15");
        TreeNode node = root.right.right.left;
        TreeNode result = tree.occupyTreeNode(root, node);
        System.out.println(result);
        assertNotNull(result);
        assertEquals(6, result.val);
        
        AAAOccupyTree tree2 = new AAAOccupyTree();
        TreeNode root2 = TreeNode.createInstance("1,2,3,4,5,#,6,7,#,#,#,8,9,#,#,10,#,#,11,#,12,13,#,14,#,#,15");
        TreeNode node2 = root.left;
        TreeNode result2 = tree2.occupyTreeNode(root2, node2);
        System.out.println(result2);
        assertNotNull(result2);
        assertEquals(1, result2.val);
        
        AAAOccupyTree tree3 = new AAAOccupyTree();
        TreeNode root3 = TreeNode.createInstance("1,2,3,4,5,#,6,7,#,#,#,8,9,#,#,10,#,#,11,#,12,13,#,14,#,#,15");
        TreeNode node3 = root.right.right;
        TreeNode result3 = tree3.occupyTreeNode(root3, node3);
        System.out.println(result3);
        assertNull(result3);
    }
}
