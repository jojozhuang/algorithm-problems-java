package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution830;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution830Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sumOfDistancesInTree");
        Solution830 instance = new Solution830();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {{3,6}});
        assertEquals(expect1, instance.largeGroupPositions("abbxxxxzzy"));

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect2, instance.largeGroupPositions("abc"));

        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{3,5},{6,9},{12,14}});
        assertEquals(expect3, instance.largeGroupPositions("abcdddeeeeaabbbcd"));

        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{0,2}});
        assertEquals(expect4, instance.largeGroupPositions("aaa"));
    }
}
