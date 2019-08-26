package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution802;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution802Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("eventualSafeNodes");
        Solution802 instance = new Solution802();

        int[][] graph1 = new int[][] {{1,2},{2,3},{5},{0},{5},{},{}};
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {2,4,5,6});
        assertEquals(expect1, instance.eventualSafeNodes(graph1));
    }
}
