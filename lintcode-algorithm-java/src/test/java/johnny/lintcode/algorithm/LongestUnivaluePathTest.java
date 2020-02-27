package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class LongestUnivaluePathTest extends JunitBase {

    /**
     * Test of longestUnivaluePath method, of class LongestUnivaluePath.
     */
    @Test
    public void testLongestUnivaluePath() {
        System.out.println("longestUnivaluePath");
        LongestUnivaluePath instance = new LongestUnivaluePath();

        TreeNode root3 = TreeNode.createInstance("5,#,5,#,5");
        assertEquals(2, instance.longestUnivaluePath(root3));

        TreeNode root1 = TreeNode.createInstance("5,4,5,1,1,#,5");
        assertEquals(2, instance.longestUnivaluePath(root1));

        TreeNode root2 = TreeNode.createInstance("1,4,5,4,4,#,5");
        assertEquals(2, instance.longestUnivaluePath(root2));
    }
}
