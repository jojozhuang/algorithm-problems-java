package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.leetcode.algorithm.Solution442;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution442Test extends JunitBase {

    @Test
    public void testFindDuplicates() {
        System.out.println("findDuplicates");
        Solution442 instance = new Solution442();

        List<Integer> expect1 = new ArrayList<Integer>();
        assertEquals(expect1, instance.findDuplicates(null));

        List<Integer> expect2 = ListUtil.buildList(new Integer[]{3,2});
        assertEquals(expect2, instance.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));

        List<Integer> expect3 = ListUtil.buildList(new Integer[]{1});
        assertEquals(expect3, instance.findDuplicates(new int[]{1,1}));

        List<Integer> expect4 = ListUtil.buildList(new Integer[]{2});
        assertEquals(expect4, instance.findDuplicates(new int[]{2,2}));
    }
}
