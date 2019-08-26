package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.leetcode.algorithm.Solution336;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution336Test extends JunitBase {

    @Test
    public void testPalindromePairs() {
        System.out.println("palindromePairs");
        Solution336 instance = new Solution336();

        List<List<Integer>> expect1 = new ArrayList<List<Integer>>();
        assertEquals(expect1, instance.palindromePairs(null));

        List<List<Integer>> result2 = instance.palindromePairs(new String[]{"bat", "tab", "cat"});
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{0,1},{1,0}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));

        List<List<Integer>> result3 = instance.palindromePairs(new String[]{"abcd", "dcba", "lls", "s", "sssll"});
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{0,1},{1,0},{3,2},{2,4}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));
        
        List<List<Integer>> result4 = instance.palindromePairs(new String[]{"aba", "", "lls"});
        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{0,1},{1,0}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, result4));

        List<List<Integer>> result5 = instance.palindromePairs(new String[]{"a","b","c","ab","ac","aa"});
        List<List<Integer>> expect5 = ListUtil.buildList2(new Integer[][] {{3,0},{1,3},{4,0},{2,4},{5,0},{0,5}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect5, result5));
    }
}
