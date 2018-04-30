package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution471;

public class Solution471Test {

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
        System.out.println("encode");
        Solution471 instance = new Solution471();

        assertEquals("aaa", instance.encode("aaa"));
        assertEquals("5[a]", instance.encode("aaaaa"));
        assertEquals("a9[a]", instance.encode("aaaaaaaaaa"));
        assertEquals("2[aabc]d", instance.encode("aabcaabcd"));
        assertEquals("2[2[abbb]c]", instance.encode("abbbabbbcabbbabbbc"));
    }
}
