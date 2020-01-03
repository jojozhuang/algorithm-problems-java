package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution472;
import johnny.algorithm.common.ListUtil;

public class Solution472Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findAllConcatenatedWordsInADict");
        Solution472 instance = new Solution472();

        List<String> result1 = instance.findAllConcatenatedWordsInADict(new String[] {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"});
        List<String> expect1 = ListUtil.buildList(new String[] {"catsdogcats","dogcatsdog","ratcatdogcat"});
        assertTrue(ListUtil.equalsIgnoreOrder(result1, expect1));
    }
}
