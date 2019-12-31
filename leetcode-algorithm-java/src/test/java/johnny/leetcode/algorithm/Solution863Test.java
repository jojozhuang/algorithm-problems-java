package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution863;
import johnny.leetcode.algorithm.common.ListUtil;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution863Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("distanceK");
        Solution863 instance = new Solution863();

        TreeNode root1 = TreeNode.createInstance("3,5,1,6,2,0,8,#,#,7,4,#,#,#,#,#,#,#,#");
        TreeNode target1 = root1.left;
        List<Integer> result1 = instance.distanceK(root1, target1, 2);
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {7,4,1});
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, result1));
    }
}
