package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution467;

public class Solution467Test {

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
        System.out.println("findSubstringInWraproundString");
        Solution467 instance = new Solution467();

        assertEquals(1, instance.findSubstringInWraproundString("a"));
        assertEquals(2, instance.findSubstringInWraproundString("cac"));
        assertEquals(6, instance.findSubstringInWraproundString("zab"));
    }

}
