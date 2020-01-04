package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution145Test extends JunitBase {

    @Test
    public void testPostorderTraversal() {
        System.out.println("postorderTraversal");
        Solution145 instance = new Solution145();

        List<Integer> expect1 = new ArrayList<Integer>();
        List<Integer> result1 = instance.postorderTraversal(null);
        assertEquals(expect1, result1);

        TreeNode root2 = new TreeNode(1);
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{1});
        List<Integer> result2 = instance.postorderTraversal(root2);
        assertEquals(expect2, result2);

        TreeNode root3 = TreeNode.createInstance(new String[]{"1","2","3"});
        List<Integer> expect3 = ListUtil.buildList(new Integer[]{2,3,1});
        List<Integer> result3 = instance.postorderTraversal(root3);
        assertEquals(expect3, result3);

        TreeNode root4 = TreeNode.createInstance(new String[]{"1","#","2","3","#"});
        List<Integer> expect4 = ListUtil.buildList(new Integer[]{3,2,1});
        List<Integer> result4 = instance.postorderTraversal(root4);
        assertEquals(expect4, result4);
    }
}
