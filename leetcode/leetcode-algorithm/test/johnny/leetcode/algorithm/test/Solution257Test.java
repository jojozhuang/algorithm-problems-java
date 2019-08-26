package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.leetcode.algorithm.Solution257;
import johnny.leetcode.algorithm.common.ListUtil;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution257Test extends JunitBase {

    @Test
    public void testBinaryTreePaths() {
        System.out.println("binaryTreePaths");
        Solution257 instance = new Solution257();

        List<String> expect1 = new ArrayList<String>();
        assertEquals(expect1, instance.binaryTreePaths(null));

        List<String> expect2 = ListUtil.buildList(new String[] {"1"});
        TreeNode root2 = new TreeNode(1);
        assertEquals(expect2, instance.binaryTreePaths(root2));

        List<String> expect3 = ListUtil.buildList(new String[] {"1->2"});
        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(expect3, instance.binaryTreePaths(root3));

        List<String> expect4 = ListUtil.buildList(new String[] {"1->2","1->3"});
        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(expect4, instance.binaryTreePaths(root4));

        List<String> expect5 = ListUtil.buildList(new String[] {"1->2->5","1->3"});
        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","3","#","5","#","#"});
        assertEquals(expect5, instance.binaryTreePaths(root5));
    }
}
