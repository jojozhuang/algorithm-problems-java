package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution127;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution127Test extends JunitBase {

    @Test
    public void testLadderLength() {
        System.out.println("ladderLength");
        Solution127 instance = new Solution127();

        assertEquals(0, instance.ladderLength("", "", null));

        List<String> wordList2 = ListUtil.buildList(new String[]{"hot", "dot", "dog", "lot","log"});
        assertEquals(0, instance.ladderLength("hit", "pet", wordList2));

        List<String> wordList3 = ListUtil.buildList(new String[]{"hot", "dot", "dog", "lot","log"});
        assertEquals(0, instance.ladderLength("hit", "cog", wordList3));

        List<String> wordList4 = ListUtil.buildList(new String[]{"hot","dot","dog","lot","log","cog"});
        assertEquals(5, instance.ladderLength("hit", "cog", wordList4));
    }
}
