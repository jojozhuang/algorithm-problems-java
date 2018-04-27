package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution443;

public class Solution443Test {

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
        System.out.println("compress");
        Solution443 instance = new Solution443();

        assertEquals(6, instance.compress(new char[] {'a','a','b','b','c','c','c'}));
        assertEquals(1, instance.compress(new char[] {'a'}));
        assertEquals(4, instance.compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }

}
