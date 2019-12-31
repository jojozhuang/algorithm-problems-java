package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution971;
import johnny.leetcode.algorithm.common.ListUtil;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution971Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("flipMatchVoyage");
        Solution971 instance = new Solution971();

        TreeNode root1 = TreeNode.createInstance("1,2,#");
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {-1});
        assertEquals(expect1, instance.flipMatchVoyage(root1, new int[] {2,1}));
        
        TreeNode root2 = TreeNode.createInstance("1,2,3");
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1});
        assertEquals(expect2, instance.flipMatchVoyage(root2, new int[] {1,3,2}));

        TreeNode root3 = TreeNode.createInstance("1,2,3");
        List<Integer> expect3 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect3, instance.flipMatchVoyage(root3, new int[] {1,2,3}));
    }
}
