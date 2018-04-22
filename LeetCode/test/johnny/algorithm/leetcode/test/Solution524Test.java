package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution524;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution524Test {

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
        System.out.println("findLongestWord");
        Solution524 instance = new Solution524();

        List<String> d1 = ListUtil.buildList(new String[] {"ale","apple","monkey","plea"});
        assertEquals("apple", instance.findLongestWord("abpcplea", d1));

        List<String> d2 = ListUtil.buildList(new String[] {"a","b","c"});
        assertEquals("a", instance.findLongestWord("abpcplea", d2));
    }

}
