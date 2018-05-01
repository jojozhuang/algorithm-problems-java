package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Set;

import johnny.algorithm.leetcode.Solution139;
import johnny.algorithm.leetcode.common.SetUtil;

public class Solution139Test extends JunitBase {

    @Test
    public void testWordBreak() {
        System.out.println("wordBreak");
        Solution139 instance = new Solution139();

        assertEquals(false, instance.wordBreak("", null));

        Set<String> dict2 = SetUtil.buildList(new String[] {"a"});
        assertEquals(true, instance.wordBreak("a", dict2));

        Set<String> dict3 = SetUtil.buildList(new String[] {"b"});
        assertEquals(false, instance.wordBreak("a", dict3));

        Set<String> dict4 = SetUtil.buildList(new String[] {"cd","ap"});
        assertEquals(false, instance.wordBreak("abcd", dict4));

        Set<String> dict5 = SetUtil.buildList(new String[] {"cd","ap"});
        assertEquals(true, instance.wordBreak("cdap", dict5));

        Set<String> dict6 = SetUtil.buildList(new String[] {"leet","code"});
        assertEquals(true, instance.wordBreak("leetcode", dict6));
    }
}
