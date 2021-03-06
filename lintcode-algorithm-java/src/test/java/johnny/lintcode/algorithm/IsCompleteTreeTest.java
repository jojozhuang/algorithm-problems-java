package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class IsCompleteTreeTest extends JunitBase {

    /**
     * Test of isSubtree method, of class Subtree.
     */
    @Test
    public void testIsCompleteTree() {
        System.out.println("isComplete");
        IsCompleteTree instance = new IsCompleteTree();
        assertEquals(true, instance.isComplete(null));
        
        /*TreeNode root2 = TreeNode.createInstance("1");
        assertEquals(true, instance.isComplete(root2));

        TreeNode root3 = TreeNode.createInstance("1,2,3,4,#,#,#");
        assertEquals(true, instance.isComplete(root3));

        TreeNode root4 = TreeNode.createInstance("1,2,3,#,4,#,#");
        assertEquals(false, instance.isComplete(root4));
*/
        TreeNode root5 = TreeNode.createInstance("1,2,3,4,#,9,8,10,11");
        //assertEquals(false, instance.isComplete(root5));
    }
}
