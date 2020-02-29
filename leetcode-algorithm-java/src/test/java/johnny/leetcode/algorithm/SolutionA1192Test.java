package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionA1192Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("criticalConnections");
        SolutionA1192 instance = new SolutionA1192();

        List<List<Integer>> connections1 = ListUtil.buildList2(new Integer[][]{{0,1},{1,2},{2,0},{1,3}});
        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][]{{1,3}});
        assertEquals(expect1, instance.criticalConnections(4, connections1));

        List<List<Integer>> connections2 = ListUtil.buildList2(new Integer[][]{{0,1},{1,2},{2,0},{1,3},{3,4},{4,5},{5,3}});
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][]{{1,3}});
        assertEquals(expect2, instance.criticalConnections(6, connections2));
    }
}
