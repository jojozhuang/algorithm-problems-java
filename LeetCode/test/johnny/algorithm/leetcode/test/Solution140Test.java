package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import johnny.algorithm.leetcode.Solution140;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution140Test extends JunitBase {

    @Test
    public void testWordBreak() {
        System.out.println("wordBreak");
        Solution140 instance = new Solution140();

        List<String> expect1 = new LinkedList<String>();
        assertEquals(expect1, instance.wordBreak("", null));

        List<String> expect2 = ListUtil.buildList(new String[] {"cats and dog","cat sand dog"});
        List<String> dict2 = ListUtil.buildList(new String[] {"cat","cats","and","sand","dog"});
        List<String> result2 = instance.wordBreak("catsanddog", dict2);
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));
    }
}
