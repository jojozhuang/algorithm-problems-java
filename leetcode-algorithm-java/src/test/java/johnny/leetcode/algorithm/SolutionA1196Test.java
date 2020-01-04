package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionA1196Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maximumSum");
        SolutionA1196 instance = new SolutionA1196();

        List<List<Integer>> result1 = ListUtil.buildList2(new Integer[][]{{1,2},{2,3},{3,4}});
        assertEquals(result1, instance.minimumAbsDifference(new int[]{4,2,1,3}));

        List<List<Integer>> result2 = ListUtil.buildList2(new Integer[][]{{1,3}});
        assertEquals(result2, instance.minimumAbsDifference(new int[]{1,3,6,10,15}));

        List<List<Integer>> result3 = ListUtil.buildList2(new Integer[][]{{-14,-10},{19,23},{23,27}});
        assertEquals(result3, instance.minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27}));

    }
}
