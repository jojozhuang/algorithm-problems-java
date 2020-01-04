package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution131Test extends JunitBase {

    @Test
    public void testPartition() {
        System.out.println("partition");
        Solution131 instance = new Solution131();

        List<List<String>> expect1 = ListUtil.buildList2(new String[][] {});
        assertEquals(expect1, instance.partition(""));

        List<List<String>> expect2 = ListUtil.buildList2(new String[][] {{"a"}});
        assertEquals(expect2, instance.partition("a"));

        List<List<String>> expect3 = ListUtil.buildList2(new String[][] {{"a","b"}});
        assertEquals(expect3, instance.partition("ab"));

        List<List<String>> expect4 = ListUtil.buildList2(new String[][] {{"a","a","b"},{"aa","b"}});
        assertEquals(expect4, instance.partition("aab"));
    }
}
