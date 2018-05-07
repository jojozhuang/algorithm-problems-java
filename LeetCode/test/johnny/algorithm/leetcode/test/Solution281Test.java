package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.algorithm.leetcode.Solution281;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution281Test extends JunitBase {

    @Test
    public void testNext() {
        System.out.println("ZigzagIterator");

        List<Integer> v11 = ListUtil.buildList(new Integer[] {1,2});
        List<Integer> v12 = ListUtil.buildList(new Integer[] {3, 4, 5, 6});
        Solution281 instance = new Solution281(v11, v12);

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1, 3, 2, 4, 5, 6});
        List<Integer> result1 = ListUtil.buildList(new Integer[] {});
        while (instance.hasNext()) {
            result1.add(instance.next());
        }
        assertEquals(expect1, result1);
    }
    
    @Test
    public void testKList() {
        System.out.println("ZigzagIterator-KList");

        Solution281 instance = new Solution281(new ArrayList<Integer>(), new ArrayList<Integer>());
        
        List<List<Integer>> klist1 = ListUtil.buildList2(new Integer[][] {{1,2,3},{4,5,6,7},{8,9}});
        Solution281.KList instance2 = instance.new KList(klist1);

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1,4,8,2,5,9,3,6,7});
        List<Integer> result2 = ListUtil.buildList(new Integer[] {});
        while (instance2.hasNext()) {
            result2.add(instance2.next());
        }
        assertEquals(expect2, result2);
    }
}
