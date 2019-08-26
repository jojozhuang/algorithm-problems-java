package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import johnny.leetcode.algorithm.Solution916;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution916Test extends JunitBase {

    @Test
    public void testWordBreak() {
        System.out.println("wordBreak");
        Solution916 instance = new Solution916();

        List<String> expect1 = new LinkedList<String>();
        assertEquals(expect1, instance.wordSubsets(new String[] {}, new String[] {}));

        List<String> expect2 = ListUtil.buildList(new String[] {"facebook","google","leetcode"});
        List<String> result2 = instance.wordSubsets(new String[] {"amazon","apple","facebook","google","leetcode"}, new String[] {"e","o"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));
        
        List<String> expect3 = ListUtil.buildList(new String[] {"apple","google","leetcode"});
        List<String> result3 = instance.wordSubsets(new String[] {"amazon","apple","facebook","google","leetcode"}, new String[] {"l","e"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));

        List<String> expect4 = ListUtil.buildList(new String[] {"facebook","google"});
        List<String> result4 = instance.wordSubsets(new String[] {"amazon","apple","facebook","google","leetcode"}, new String[] {"e","oo"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, result4));

        List<String> expect5 = ListUtil.buildList(new String[] {"google","leetcode"});
        List<String> result5 = instance.wordSubsets(new String[] {"amazon","apple","facebook","google","leetcode"}, new String[] {"lo","eo"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect5, result5));

        List<String> expect6 = ListUtil.buildList(new String[] {"facebook","leetcode"});
        List<String> result6 = instance.wordSubsets(new String[] {"amazon","apple","facebook","google","leetcode"}, new String[] {"ec","oc","ceo"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect6, result6));
}
}
