package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution119;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution119Test extends JunitBase {

    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Solution119 instance = new Solution119();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect1, instance.getRow(-1));

        List<Integer> expect2 = ListUtil.buildList(new Integer[]{1});
        assertEquals(expect2,  instance.getRow(0));

        List<Integer> expect3 = ListUtil.buildList(new Integer[]{1,1});
        assertEquals(expect3,  instance.getRow(1));

        List<Integer> expect4 = ListUtil.buildList(new Integer[]{1,2,1});
        assertEquals(expect4,  instance.getRow(2));

        List<Integer> expect5 = ListUtil.buildList(new Integer[]{1,3,3,1});
        assertEquals(expect5,  instance.getRow(3));
    }
}
