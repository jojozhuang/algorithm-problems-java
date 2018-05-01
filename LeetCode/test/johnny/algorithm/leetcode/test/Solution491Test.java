package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution491;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution491Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findSubsequences");
        Solution491 instance = new Solution491();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {{4, 6}, {4, 7}, {4, 6, 7}, {4, 6, 7, 7}, {6, 7}, {6, 7, 7}, {7,7}, {4,7,7}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, instance.findSubsequences(new int[] {4, 6, 7, 7})));
    }
}
