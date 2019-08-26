package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.leetcode.algorithm.Solution310;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution310Test extends JunitBase {

    @Test
    public void testFindMinHeightTrees() {
        System.out.println("findMinHeightTrees");
        Solution310 instance = new Solution310();

        List<Integer> expect1 = new ArrayList<Integer>();
        assertEquals(expect1, instance.findMinHeightTrees(0, null));

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1});
        assertEquals(expect2, instance.findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}}));

        List<Integer> expect3 = ListUtil.buildList(new Integer[] {3,4});
        assertEquals(expect3, instance.findMinHeightTrees(6, new int[][]{{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}}));
    }
}
