package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution126;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution126Test extends JunitBase {

    @Test
    public void testFindLadders() {
        System.out.println("findLadders");
        Solution126 instance = new Solution126();

        List<List<String>> expect1 = ListUtil.buildList2(new String[][] {});
        List<List<String>> result = instance.findLadders("", "", null);
        assertEquals(expect1, result);

        List<String> wordList2 = ListUtil.buildList(new String[] {"hot","dot","dog","lot","log"});
        List<List<String>> expect2 = ListUtil.buildList2(new String[][] {});
        assertEquals(expect2, instance.findLadders("hit", "cog", wordList2));

        List<String> wordList3 = ListUtil.buildList(new String[] {"hot","dot","dog","lot","log","cog"});
        List<List<String>> expect3 = ListUtil.buildList2(new String[][] {{"hit","hot","dot","dog","cog"},{"hit","hot","lot","log","cog"}});
        assertEquals(expect3, instance.findLadders("hit", "cog", wordList3));
    }
}
