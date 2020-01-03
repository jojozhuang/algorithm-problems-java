package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution017;
import johnny.algorithm.common.ListUtil;

public class Solution017Test extends JunitBase {

    @Test
    public void testLetterCombinations() {
        System.out.println("letterCombinations");
        Solution017 instance = new Solution017();

        List<String> expect1 = ListUtil.buildList(new String[] {});
        assertEquals(expect1, instance.letterCombinations(""));

        List<String> expect2 = ListUtil.buildList(new String[] {});
        assertEquals(expect2, instance.letterCombinations("1"));

        List<String> expect3 = ListUtil.buildList(new String[] {"a","b","c"});
        assertEquals(expect3, instance.letterCombinations("2"));

        List<String> expect4 = ListUtil.buildList(new String[] {"ad","ae","af","bd","be","bf","cd","ce","cf"});
        assertEquals(expect4, instance.letterCombinations("23"));
    }
}
