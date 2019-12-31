package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import johnny.leetcode.algorithm.Solution140;
import johnny.leetcode.algorithm.common.ListUtil;

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
        
        List<String> expect3 = ListUtil.buildList(new String[] {"pine apple pen apple","pineapple pen apple","pine applepen apple"});
        List<String> dict3 = ListUtil.buildList(new String[] {"apple","pen","applepen","pine","pineapple"});
        List<String> result3 = instance.wordBreak("pineapplepenapple", dict3);
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));

        List<String> expect4 = ListUtil.buildList(new String[] {"a"});
        List<String> dict4 = ListUtil.buildList(new String[] {"a"});
        List<String> result4 = instance.wordBreak("a", dict4);
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, result4));
        
        List<String> expect5 = ListUtil.buildList(new String[] {}); // there is a 'b' in the string, no match
        List<String> dict5 = ListUtil.buildList(new String[] {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"});
        List<String> result5 = instance.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", dict5);
        assertTrue(ListUtil.equalsIgnoreOrder(expect5, result5));
    }
}
