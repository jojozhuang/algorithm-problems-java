package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution797;
import johnny.algorithm.common.ListUtil;

public class Solution797Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("allPathsSourceTarget");
        Solution797 instance = new Solution797();

        int[][] graph1 = new int[][] {{1,2}, {3}, {3}, {}};
        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {{0,1,3},{0,2,3}});
        assertEquals(expect1, instance.allPathsSourceTarget(graph1));
    }
}
