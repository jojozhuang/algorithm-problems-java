package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution139Test extends JunitBase {

    @Test
    public void testWordBreak() {
        System.out.println("wordBreak");
        Solution139 instance = new Solution139();

        assertEquals(false, instance.wordBreak("", null));

        List<String> dict2 = ListUtil.buildList(new String[] {"a"});
        assertEquals(true, instance.wordBreak("a", dict2));

        List<String> dict3 = ListUtil.buildList(new String[] {"b"});
        assertEquals(false, instance.wordBreak("a", dict3));

        List<String> dict4 = ListUtil.buildList(new String[] {"cd","ap"});
        assertEquals(false, instance.wordBreak("abcd", dict4));

        List<String> dict5 = ListUtil.buildList(new String[] {"cd","ap"});
        assertEquals(true, instance.wordBreak("cdap", dict5));

        List<String> dict6 = ListUtil.buildList(new String[] {"leet","code"});
        assertEquals(true, instance.wordBreak("leetcode", dict6));

        List<String> dict7 = ListUtil.buildList(new String[] {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"});
        assertEquals(true, instance.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", dict7));

        List<String> dict8 = ListUtil.buildList(new String[] {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"});
        assertEquals(true, instance.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", dict8));
    }
}
