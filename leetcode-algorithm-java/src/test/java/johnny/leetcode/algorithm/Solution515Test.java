package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution515Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestValues");
        Solution515 instance = new Solution515();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","3","2","5","3","#","9"});
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1, 3, 9});
        assertEquals(expect1, instance.largestValues(root1));
    }
}
