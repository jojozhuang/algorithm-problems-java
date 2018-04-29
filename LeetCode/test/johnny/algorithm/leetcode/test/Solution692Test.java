package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution692;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution692Test {

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
        System.out.println("topKFrequent");
        Solution692 instance = new Solution692();

        List<String> result1 = ListUtil.buildList(new String[] {"i", "love"});
        assertEquals(result1, instance.topKFrequent(new String[] {"i", "love", "leetcode", "i", "love", "coding"}, 2));

        List<String> result2 = ListUtil.buildList(new String[] {"the", "is", "sunny", "day"});
        assertEquals(result2, instance.topKFrequent(new String[] {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));
    }

}
