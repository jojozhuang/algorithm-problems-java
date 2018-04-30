package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution472;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution472Test {

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
        System.out.println("findAllConcatenatedWordsInADict");
        Solution472 instance = new Solution472();

        List<String> result1 = instance.findAllConcatenatedWordsInADict(new String[] {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"}); 
        List<String> expect1 = ListUtil.buildList(new String[] {"catsdogcats","dogcatsdog","ratcatdogcat"});
        assertTrue(ListUtil.equalsIgnoreOrder(result1, expect1));
    }
}
