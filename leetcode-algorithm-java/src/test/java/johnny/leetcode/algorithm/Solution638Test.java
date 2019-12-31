package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution638;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution638Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("shoppingOffers");
        Solution638 instance = new Solution638();

        List<Integer> price1 = ListUtil.buildList(new Integer[] {2,5});
        List<List<Integer>> special1 = ListUtil.buildList2(new Integer[][] {{3,0,5},{1,2,10}});
        List<Integer> needs1 = ListUtil.buildList(new Integer[] {3,2});
        assertEquals(14, instance.shoppingOffers(price1, special1, needs1));

        List<Integer> price2 = ListUtil.buildList(new Integer[] {2,3,4});
        List<List<Integer>> special2 = ListUtil.buildList2(new Integer[][] {{1,1,0,4},{2,2,1,9}});
        List<Integer> needs2 = ListUtil.buildList(new Integer[] {1,2,1});
        assertEquals(11, instance.shoppingOffers(price2, special2, needs2));
    }
}
