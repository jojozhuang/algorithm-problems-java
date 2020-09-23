package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class Solution890Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findAndReplacePattern");
        Solution890 instance = new Solution890();

        String[] words1 = new String[] {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern1 = "abb";
        List<String> result1 = instance.findAndReplacePattern(words1, pattern1);
        List<String> expected1 = ListUtil.buildList(new String[] {"mee","aqq"});
        assertTrue(ListUtil.equalsIgnoreOrder(expected1, result1));

    }
}
