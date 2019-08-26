package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution199;
import johnny.leetcode.algorithm.common.ListUtil;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution199Test extends JunitBase {

    @Test
    public void testRightSideView() {
        System.out.println("rightSideView");
        Solution199 instance = new Solution199();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect1, instance.rightSideView(null));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1"});
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1});
        assertEquals(expect2, instance.rightSideView(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","#"});
        List<Integer> expect3 = ListUtil.buildList(new Integer[] {1,2});
        assertEquals(expect3, instance.rightSideView(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","3"});
        List<Integer> expect4 = ListUtil.buildList(new Integer[] {1,3});
        assertEquals(expect4, instance.rightSideView(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","3","#","5","#","4"});
        List<Integer> expect5 = ListUtil.buildList(new Integer[] {1,3,4});
        assertEquals(expect5, instance.rightSideView(root5));
    }
}
