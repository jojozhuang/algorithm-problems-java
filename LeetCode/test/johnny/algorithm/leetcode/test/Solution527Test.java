package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution527;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution527Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println("wordsAbbreviation");
        Solution527 instance = new Solution527();

        List<String> dict1 = ListUtil.buildList(new String[] {"like", "god", "internal", "me", "internet", "interval", "intension", "face", "intrusion"});
        List<String> expect1 = ListUtil.buildList(new String[] {"l2e","god","internal","me","i6t","interval","inte4n","f2e","intr4n"});
        assertEquals(expect1, instance.wordsAbbreviation(dict1));
    }

}
