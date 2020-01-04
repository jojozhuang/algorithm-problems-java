package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution144Test extends JunitBase {

    @Test
    public void testPreorderTraversal() {
        System.out.println("preorderTraversal");
        TreeNode root = null;
        Solution144 instance = new Solution144();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.preorderTraversal(root);
        assertEquals(expResult, result);

        TreeNode root1 = new TreeNode(1);
        List<Integer> expect1 = ListUtil.buildList(new Integer[]{1});
        List<Integer> result1 = instance.preorderTraversal(root1);
        assertEquals(expect1, result1);

        TreeNode root2 = TreeNode.createInstance(new String[]{"1","2","3"});
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{1,2,3});
        List<Integer> result2 = instance.preorderTraversal(root2);
        assertEquals(expect2, result2);

        TreeNode root3 = TreeNode.createInstance(new String[]{"1","#","2","3","#"});
        List<Integer> expect3 = ListUtil.buildList(new Integer[]{1,2,3});
        List<Integer> result3 = instance.preorderTraversal(root3);
        assertEquals(expect3, result3);
    }
}
