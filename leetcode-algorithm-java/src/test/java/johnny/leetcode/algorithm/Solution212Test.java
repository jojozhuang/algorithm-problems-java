package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution212;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution212Test extends JunitBase {

    @Test
    public void testFindWords() {
        System.out.println("findWords");
        Solution212 instance = new Solution212();

        List<String> expect1 = ListUtil.buildList(new String[] {});
        assertEquals(expect1, instance.findWords(null, null));

        char[][] board2 = new char[][] {
            {'o','a','a','n'},
            {'e','t','a','e'},
            {'i','h','k','r'},
            {'i','f','l','v'}
        };
        List<String> expect2 = ListUtil.buildList(new String[] {"eat","oath"});
        List<String> result2 = instance.findWords(board2, new String[]{"oath","pea","eat","rain"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));

        char[][] board3 = new char[][] {
            {'a','a'}
        };
        List<String> expect3 = ListUtil.buildList(new String[] {"a"});
        List<String> result3 = instance.findWords(board3, new String[]{"a"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));

        char[][] board4 = new char[][] {
            {'a'}
        };
        List<String> expect4 = ListUtil.buildList(new String[] {"a"});
        List<String> result4 = instance.findWords(board4, new String[]{"a", "a"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, result4));
    }
}
