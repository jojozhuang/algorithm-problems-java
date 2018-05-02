package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution030;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution030Test extends JunitBase {

    @Test
    public void testFindSubstring() {
        System.out.println("findSubstring");
        Solution030 instance = new Solution030();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect1, instance.findSubstring("", null));

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {0,9});
        assertEquals(expect2, instance.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));

        List<Integer> expect3 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect3, instance.findSubstring("wordgoodstudentgoodword", new String[]{"word", "student"}));
    }
}
