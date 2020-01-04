package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
