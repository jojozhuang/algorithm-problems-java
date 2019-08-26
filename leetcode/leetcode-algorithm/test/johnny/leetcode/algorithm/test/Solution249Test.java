package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution249;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution249Test extends JunitBase {

    @Test
    public void testGroupStrings() {
        System.out.println("groupStrings");
        Solution249 instance = new Solution249();

        List<List<String>> expect1 = ListUtil.buildList2(new String[][] {});
        assertEquals(expect1, instance.groupStrings(null));

        List<List<String>> expect2 = ListUtil.buildList2(new String[][] {
            {"abc","bcd","xyz"},
            {"az","ba"},
            {"acef"},
            {"a","z"}
          });
        List<List<String>> result2 = instance.groupStrings(new String[]{"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2,  result2));
    }
}
