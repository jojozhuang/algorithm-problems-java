package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution301Test extends JunitBase {

    @Test
    public void testRemoveInvalidParentheses() {
        System.out.println("removeInvalidParentheses");
        Solution301 instance = new Solution301();

        List<String> expect1 = ListUtil.buildList(new String[] {""});
        List<String> result1 = instance.removeInvalidParentheses("");
        assertEquals(expect1, result1);

        List<String> result2 = instance.removeInvalidParentheses("()())()");
        List<String> expect2 = ListUtil.buildList(new String[] {"()()()","(())()"});
        assertTrue(ListUtil.equalsIgnoreOrder(result2, expect2));

        List<String> result3 = instance.removeInvalidParentheses("(a)())()");
        List<String> expect3 = ListUtil.buildList(new String[] {"(a)()()","(a())()"});
        assertTrue(ListUtil.equalsIgnoreOrder(result3, expect3));

        List<String> result4 = instance.removeInvalidParentheses(")(");
        assertEquals(1, result4.size());
        assertEquals("", result4.get(0));
    }
}
