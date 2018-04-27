package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution748;

public class Solution748Test {

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
        System.out.println("shortestCompletingWord");
        Solution748 instance = new Solution748();

        assertEquals("steps", instance.shortestCompletingWord("1s3 PSt", new String[] {"step", "steps", "stripe", "stepple"}));
        assertEquals("pest", instance.shortestCompletingWord("1s3 456", new String[] {"looks", "pest", "stew", "show"}));
    }

}
