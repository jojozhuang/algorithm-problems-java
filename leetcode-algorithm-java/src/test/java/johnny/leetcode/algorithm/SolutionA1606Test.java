package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionA1606Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("busiestServers");
        SolutionA1606 instance = new SolutionA1606();

        List<Integer> result1 = ListUtil.buildList(new Integer[]{1});
        assertEquals(result1, instance.busiestServers(3, new int[]{1,2,3,4,5}, new int[]{5,2,3,3,3}));

        List<Integer> result2 = ListUtil.buildList(new Integer[]{0});
        assertEquals(result2, instance.busiestServers(3, new int[]{1,2,3,4}, new int[]{1,2,1,2}));

        List<Integer> result3 = ListUtil.buildList(new Integer[]{0,1,2});
        assertEquals(result3, instance.busiestServers(3, new int[]{1,2,3}, new int[]{10,12,11}));

        List<Integer> result4 = ListUtil.buildList(new Integer[]{1});
        assertEquals(result4, instance.busiestServers(3, new int[]{1,2,3,4,8,9,10}, new int[]{5,2,10,3,1,2,2}));

        List<Integer> result5 = ListUtil.buildList(new Integer[]{0});
        assertEquals(result5, instance.busiestServers(1, new int[]{1}, new int[]{1}));

    }
}
