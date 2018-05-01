package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution320;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution320Test extends JunitBase {

    @Test
    public void testGenerateAbbreviations() {
        System.out.println("generateAbbreviations");
        Solution320 instance = new Solution320();

        List<String> expect1 = ListUtil.buildList(new String[]{""});
        List<String> result1 = instance.generateAbbreviations("");
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, result1));

        List<String> expect2 = ListUtil.buildList(new String[]{"word","1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"});
        List<String> result2 = instance.generateAbbreviations("word");
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));
    }
}
