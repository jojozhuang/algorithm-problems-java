package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution659;

public class Solution659Test {

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
        System.out.println("isPossible");
        Solution659 instance = new Solution659();

        assertEquals(true, instance.isPossible(new int[] {1,2,3,3,4,5}));
        assertEquals(true, instance.isPossible(new int[] {1,2,3,3,4,4,5,5}));
        assertEquals(false, instance.isPossible(new int[] {1,2,3,4,4,5}));
    }

}
