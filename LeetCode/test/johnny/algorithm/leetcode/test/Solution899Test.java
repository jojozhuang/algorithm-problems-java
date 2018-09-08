package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution890;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution899Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSimilarGroups");
        Solution890 instance = new Solution890();

        String[] words1 = new String[] {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern1 = "abb";
        List<String> result1 = instance.findAndReplacePattern(words1, pattern1);
        List<String> expected1 = ListUtil.buildList(new String[] {"mee","aqq"});
        assertTrue(ListUtil.equalsIgnoreOrder(result1, expected1));

    }
}