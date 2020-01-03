package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution527;
import johnny.algorithm.common.ListUtil;

public class Solution527Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("wordsAbbreviation");
        Solution527 instance = new Solution527();

        List<String> dict1 = ListUtil.buildList(new String[] {"like", "god", "internal", "me", "internet", "interval", "intension", "face", "intrusion"});
        List<String> expect1 = ListUtil.buildList(new String[] {"l2e","god","internal","me","i6t","interval","inte4n","f2e","intr4n"});
        assertEquals(expect1, instance.wordsAbbreviation(dict1));
    }
}
