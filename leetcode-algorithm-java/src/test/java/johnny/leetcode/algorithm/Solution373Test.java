package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution373;
import johnny.algorithm.common.ListUtil;

public class Solution373Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("kSmallestPairs");
        Solution373 instance = new Solution373();

        List<int[]> result1 = instance.kSmallestPairs(new int[] {1,7,11}, new int[] {2,4,6}, 3);
        List<int[]> expect1 = ListUtil.buildList2(new int[][]{{1,2},{1,4},{1,6}});
        assertArrayEquals(expect1.toArray(), result1.toArray());

        List<int[]> result2 = instance.kSmallestPairs(new int[] {1,1,2}, new int[] {1,2,3}, 2);
        List<int[]> expect2 = ListUtil.buildList2(new int[][]{{1,1},{1,1}});
        assertArrayEquals(expect2.toArray(), result2.toArray());

        List<int[]> result3 = instance.kSmallestPairs(new int[] {1,2}, new int[] {3}, 3);
        List<int[]> expect3 = ListUtil.buildList2(new int[][]{{1,3},{2,3}});
        assertArrayEquals(expect3.toArray(), result3.toArray());
    }
}
