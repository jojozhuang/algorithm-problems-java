package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution676;

public class Solution676Test {

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
        System.out.println("maxIncreaseKeepingSkyline");
        Solution676 instance = new Solution676();

        instance.buildDict(new String[] {"hello", "leetcode"});
        assertEquals(false, instance.search("hello"));
        assertEquals(true, instance.search("hhllo"));
        assertEquals(false, instance.search("hell"));
        assertEquals(false, instance.search("leetcoded"));
    }

}
