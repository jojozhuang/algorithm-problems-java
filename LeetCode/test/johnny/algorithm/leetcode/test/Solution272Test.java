package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.algorithm.leetcode.Solution272;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution272Test extends JunitBase {

    @Test
    public void testClosestKValues() {
        System.out.println("closestKValues");
        Solution272 instance = new Solution272();

        List<Integer> expect1 = new ArrayList<Integer>();
        List<Integer> result1 = instance.closestKValues(null, 0.0, 0);
        assertEquals(expect1, result1);

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {4});
        TreeNode root2 = TreeNode.createInstance(new String[] {"4"});
        List<Integer> result2 = instance.closestKValues(root2, 4, 1);
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));

        List<Integer> expect3 = ListUtil.buildList(new Integer[] {7});
        TreeNode root3 = TreeNode.createInstance(new String[] {"4","1","7"});
        List<Integer> result3 = instance.closestKValues(root3, 6, 1);
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));

        List<Integer> expect4 = ListUtil.buildList(new Integer[] {1});
        TreeNode root4 = TreeNode.createInstance(new String[] {"4","1","7"});
        List<Integer> result4 = instance.closestKValues(root4, 2, 1);
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, result4));

        List<Integer> expect5 = ListUtil.buildList(new Integer[] {4});
        TreeNode root5 = TreeNode.createInstance(new String[] {"4","1","7"});
        List<Integer> result5 = instance.closestKValues(root5, 3, 1);
        assertTrue(ListUtil.equalsIgnoreOrder(expect5, result5));

        List<Integer> expect6 = ListUtil.buildList(new Integer[] {4, 7});
        TreeNode root6 = TreeNode.createInstance(new String[] {"4","1","7"});
        List<Integer> result6 = instance.closestKValues(root6, 6, 2);
        assertTrue(ListUtil.equalsIgnoreOrder(expect6, result6));

        List<Integer> expect7 = ListUtil.buildList(new Integer[] {1, 4});
        TreeNode root7 = TreeNode.createInstance(new String[] {"4","1","7"});
        List<Integer> result7 = instance.closestKValues(root7, 2, 2);
        assertTrue(ListUtil.equalsIgnoreOrder(expect7, result7));

        List<Integer> expect8 = ListUtil.buildList(new Integer[] {1, 4});
        TreeNode root8 = TreeNode.createInstance(new String[] {"4","1","7"});
        List<Integer> result8 = instance.closestKValues(root8, 3, 2);
        assertTrue(ListUtil.equalsIgnoreOrder(expect8, result8));

        List<Integer> expect9 = ListUtil.buildList(new Integer[] {1, 4, 7});
        TreeNode root9 = TreeNode.createInstance(new String[] {"4","1","7"});
        List<Integer> result9 = instance.closestKValues(root9, 3, 3);
        assertTrue(ListUtil.equalsIgnoreOrder(expect9, result9));
    }
}
