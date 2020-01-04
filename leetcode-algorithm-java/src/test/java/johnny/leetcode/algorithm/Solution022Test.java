package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution022Test extends JunitBase {

    @Test
    public void testGenerateParenthesis() {
        System.out.println("generateParenthesis");
        Solution022 instance = new Solution022();

        List<String> expect1 = new ArrayList<String>();
        assertEquals(expect1, instance.generateParenthesis(0));

        List<String> expect2 = ListUtil.buildList(new String[] {"()"});
        assertEquals(expect2, instance.generateParenthesis(1));

        List<String> expect3 = ListUtil.buildList(new String[] {"()()","(())"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, instance.generateParenthesis(2)));

        List<String> expect4 = ListUtil.buildList(new String[] {"((()))","(()())","(())()","()(())","()()()"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, instance.generateParenthesis(3)));
    }
}
