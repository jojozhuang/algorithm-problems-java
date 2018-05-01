package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.algorithm.leetcode.Solution347;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution347Test extends JunitBase {

    @Test
    public void testTopKFrequent() {
        System.out.println("topKFrequent");
        Solution347 instance = new Solution347();

        List<Integer> expect1 = new ArrayList<Integer>();
        assertEquals(expect1, instance.topKFrequent(null, 0));

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1,2});
        assertEquals(expect2, instance.topKFrequent(new int[]{1,1,1,2,2,3}, 2));

        List<Integer> expect3 = ListUtil.buildList(new Integer[] {1,2,3});
        assertEquals(expect3, instance.topKFrequent(new int[]{1,1,1,2,2,3}, 3));
    }
}
