package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionA1610Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("visiblePoints");
        SolutionA1610 instance = new SolutionA1610();

        List<List<Integer>> points1 = ListUtil.buildList2(new Integer[][]{{2,1},{2,2},{3,3}});
        List<Integer> location1 = ListUtil.buildList(new Integer[]{1,1});
        assertEquals(3, instance.visiblePoints(points1, 90, location1));

        List<List<Integer>> points2 = ListUtil.buildList2(new Integer[][]{{2,1},{2,2},{3,4},{1,1}});
        List<Integer> location2 = ListUtil.buildList(new Integer[]{1,1});
        assertEquals(4, instance.visiblePoints(points2, 90, location2));

        List<List<Integer>> points3 = ListUtil.buildList2(new Integer[][]{{1,0},{2,1}});
        List<Integer> location3 = ListUtil.buildList(new Integer[]{1,1});
        assertEquals(1, instance.visiblePoints(points3, 13, location3));

    }
}
