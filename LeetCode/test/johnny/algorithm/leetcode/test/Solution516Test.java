package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution516;

public class Solution516Test {

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
        System.out.println("longestPalindromeSubseq");
        Solution516 instance = new Solution516();

        assertEquals(4, instance.longestPalindromeSubseq("bbbab"));
        assertEquals(2, instance.longestPalindromeSubseq("cbbd"));
    }

}
