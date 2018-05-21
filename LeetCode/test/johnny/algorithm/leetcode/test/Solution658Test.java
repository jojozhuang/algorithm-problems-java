package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.algorithm.leetcode.Solution658;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution658Test extends JunitBase {

    @Test
    public void testFindClosestElements() {
        System.out.println("findClosestElements");
        Solution658 instance = new Solution658();

        List<Integer> expect1 = new ArrayList<Integer>();
        List<Integer> result1 = instance.findClosestElements(null, 0, 0);
        assertEquals(expect1, result1);

        List<Integer> expect2 = ListUtil.buildList(new Integer[]{1,2,3,4});
        assertEquals(expect2, instance.findClosestElements(new int[]{1,2,3,4,5}, 4, 3));

        List<Integer> expect3 = ListUtil.buildList(new Integer[]{1,2,3,4});
        assertEquals(expect3, instance.findClosestElements(new int[]{1,2,3,4,5}, 4, -1));

        List<Integer> expect4 = ListUtil.buildList(new Integer[]{2,3,4,5});
        assertEquals(expect4, instance.findClosestElements(new int[]{1,2,3,4,5}, 4, 6));

        List<Integer> expect5 = ListUtil.buildList(new Integer[]{0,1,1,1,2,3,6,7,8});
        assertEquals(expect5, instance.findClosestElements(new int[]{0,1,1,1,2,3,6,7,8,9}, 9, 4));

        List<Integer> expect6 = ListUtil.buildList(new Integer[]{3,3,4});
        assertEquals(expect6, instance.findClosestElements(new int[]{0,0,1,2,3,3,4,7,7,8}, 3, 5));

        List<Integer> expect7 = ListUtil.buildList(new Integer[]{1,3});
        assertEquals(expect7, instance.findClosestElements(new int[]{0,0,0,1,3,5,6,7,8,8}, 2, 2));
    }
}
