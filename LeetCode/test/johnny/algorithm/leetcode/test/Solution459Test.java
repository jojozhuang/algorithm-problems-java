package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution459;

public class Solution459Test {

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
        System.out.println("repeatedSubstringPattern");
        Solution459 instance = new Solution459();

        assertEquals(true, instance.repeatedSubstringPattern("abab"));
        assertEquals(false, instance.repeatedSubstringPattern("aba"));
        assertEquals(true, instance.repeatedSubstringPattern("abcabcabcabc"));
    }
}
