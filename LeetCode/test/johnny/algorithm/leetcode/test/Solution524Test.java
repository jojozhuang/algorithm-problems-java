package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution524;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution524Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLongestWord");
        Solution524 instance = new Solution524();

        List<String> d1 = ListUtil.buildList(new String[] {"ale","apple","monkey","plea"});
        assertEquals("apple", instance.findLongestWord("abpcplea", d1));

        List<String> d2 = ListUtil.buildList(new String[] {"a","b","c"});
        assertEquals("a", instance.findLongestWord("abpcplea", d2));
    }
}
