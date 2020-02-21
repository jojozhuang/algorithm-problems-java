package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class RangeSumBSTTest extends JunitBase {

    @Test
    public void testRangeSumBST() {
        System.out.println("rangeSumBST");
        RangeSumBST instance = new RangeSumBST();

        TreeNode root1 = TreeNode.createInstance("10,5,15,3,7,#,18");
        assertEquals(32, instance.rangeSumBST(root1, 7, 15));

        TreeNode root2 = TreeNode.createInstance("10,5,15,3,7,13,18,1,#,6,#");
        assertEquals(23, instance.rangeSumBST(root2, 6, 10));

    }
}
