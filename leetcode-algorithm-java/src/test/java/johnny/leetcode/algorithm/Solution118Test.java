package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution118;
import johnny.algorithm.common.ListUtil;

public class Solution118Test extends JunitBase {

    @Test
    public void testGenerate() {
        System.out.println("generate");
        Solution118 instance = new Solution118();

        List<List<Integer>> expect = ListUtil.buildList2(new Integer[][]{});
        assertEquals(expect, instance.generate(0));

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][]{{1}});
        assertEquals(expect1,  instance.generate(1));

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][]{{1},{1,1}});
        assertEquals(expect2,  instance.generate(2));

        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][]{{1},{1,1},{1,2,1}});
        assertEquals(expect3,  instance.generate(3));

        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][]{{1},{1,1},{1,2,1},{1,3,3,1}});
        assertEquals(expect4,  instance.generate(4));
    }
}
