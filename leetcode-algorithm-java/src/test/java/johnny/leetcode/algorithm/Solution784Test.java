package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution784;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution784Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("letterCasePermutation");
        Solution784 instance = new Solution784();

        List<String> expect1 = ListUtil.buildList(new String[] {"a1b2", "a1B2", "A1b2", "A1B2"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, instance.letterCasePermutation("a1b2")));

        List<String> expect2 = ListUtil.buildList(new String[] {"3z4", "3Z4"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, instance.letterCasePermutation("3z4")));

        List<String> expect3 = ListUtil.buildList(new String[] {"12345"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, instance.letterCasePermutation("12345")));
    }
}
