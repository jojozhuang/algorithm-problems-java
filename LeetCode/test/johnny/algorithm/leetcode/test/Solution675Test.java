package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution675;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution675Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("cutOffTree");
        Solution675 instance = new Solution675();

        List<List<Integer>> forest1 = ListUtil.buildList2(new Integer[][] {
            {1,2,3},
            {0,0,4},
            {7,6,5}});
        assertEquals(6, instance.cutOffTree(forest1));

        List<List<Integer>> forest2 = ListUtil.buildList2(new Integer[][] {
            {1,2,3},
            {0,0,0},
            {7,6,5}});
        assertEquals(-1, instance.cutOffTree(forest2));

        List<List<Integer>> forest3 = ListUtil.buildList2(new Integer[][] {
            {2,3,4},
            {0,0,5},
            {8,7,6}});
        assertEquals(6, instance.cutOffTree(forest3));
    }
}
