package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution648;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution648Test {

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
        System.out.println("replaceWords");
        Solution648 instance = new Solution648();

        List<String> dict1 = ListUtil.buildList(new String[] {"cat", "bat", "rat"});
        assertEquals("the cat was rat by the bat", instance.replaceWords(dict1, "the cattle was rattled by the battery"));
    }
}
