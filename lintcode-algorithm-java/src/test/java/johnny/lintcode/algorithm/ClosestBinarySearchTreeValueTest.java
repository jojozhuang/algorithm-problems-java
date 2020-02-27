package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListUtil;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class ClosestBinarySearchTreeValueTest extends JunitBase {

    /**
     * Test of insertNode method, of class InsertNodeinaBinarySearchTree.
     */
    @Test
    public void testInsertNode() {
        System.out.println("insertNode");
        ClosestBinarySearchTreeValue instance = new ClosestBinarySearchTreeValue();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1"});
        List<Integer> result1 = instance.closestKValues(root1, 0.000000, 1);
        List<Integer> expect1 = ListUtil.buildList(new Integer[]{1});
        assertEquals(expect1, result1);


        TreeNode root2 = TreeNode.createInstance(new String("3,1,4,#,2,#,#"));
        List<Integer> result2 = instance.closestKValues(root2, 0.275000, 2);
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{1,2});
        assertEquals(expect2, result2);

        TreeNode root3 = TreeNode.createInstance(new String("2,1,3"));
        List<Integer> result3 = instance.closestKValues(root3, 5.571429, 2);
        List<Integer> expect3 = ListUtil.buildList(new Integer[]{2,3});
        assertEquals(expect3, result3);

    }
}
