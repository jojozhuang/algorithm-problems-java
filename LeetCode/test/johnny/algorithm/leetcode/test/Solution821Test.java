package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution821;

public class Solution821Test {

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
        System.out.println("shortestToChar");
        
        Solution821 instance = new Solution821();
        assertArrayEquals(new int[] {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}, instance.shortestToChar("loveleetcode", 'e'));
    }

}
