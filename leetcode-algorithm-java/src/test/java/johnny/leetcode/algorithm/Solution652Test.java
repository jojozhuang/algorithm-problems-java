package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.leetcode.algorithm.Solution652;
import johnny.algorithm.common.TreeNode;

public class Solution652Test extends JunitBase {

    @Test
    public void testFindDuplicateSubtrees() {
        System.out.println("findDuplicateSubtrees");
        TreeNode root = null;
        Solution652 instance = new Solution652();
        List<TreeNode> expResult = new ArrayList<TreeNode>();
        List<TreeNode> result = instance.findDuplicateSubtrees(root);
        assertEquals(expResult, result);

        TreeNode root2 = TreeNode.createInstance(new String[]{"2","1","1"});
        List<TreeNode> expect2 = new ArrayList<TreeNode>();
        expect2.add(new TreeNode(1));
        assertTrue(TreeNode.isSame(expect2.get(0), instance.findDuplicateSubtrees(root2).get(0)));

        TreeNode root3 = TreeNode.createInstance(new String[]{"0","0","0","0","#","#","0","#","#","0","0"});
        List<TreeNode> expect3 = new ArrayList<TreeNode>();
        expect3.add(new TreeNode(0));
        List<TreeNode> result3 = instance.findDuplicateSubtrees(root3);
        assertEquals(expect3.size(), result3.size());
        assertTrue(TreeNode.isSame(expect3.get(0), result3.get(0)));

        TreeNode root4 = TreeNode.createInstance(new String[]{"2","2","2","3","#","3","#"});
        List<TreeNode> expect4 = new ArrayList<TreeNode>();
        TreeNode expect41 = TreeNode.createInstance(new String[]{"2","3","#"});
        TreeNode expect42 = TreeNode.createInstance(new String[]{"3"});
        expect4.add(expect41);
        expect4.add(expect42);
        List<TreeNode> result4 = instance.findDuplicateSubtrees(root4);
        assertEquals(expect4.size(), result4.size());
        assertTrue(TreeNode.isSame(expect4.get(0), result4.get(1)));
        assertTrue(TreeNode.isSame(expect4.get(1), result4.get(0)));
    }
}
