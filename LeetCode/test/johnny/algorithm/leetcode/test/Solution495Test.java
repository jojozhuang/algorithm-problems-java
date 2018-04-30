package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution495;

public class Solution495Test {

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
        System.out.println("findPoisonedDuration");
        Solution495 instance = new Solution495();

        assertEquals(4, instance.findPoisonedDuration(new int[] {1,4}, 2));
        assertEquals(3, instance.findPoisonedDuration(new int[] {1,2}, 2));
    }
}
