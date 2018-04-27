package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution798;

public class Solution798Test {

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
        System.out.println("bestRotation");
        Solution798 instance = new Solution798();

        assertEquals(3, instance.bestRotation(new int[]{2, 3, 1, 4, 0}));
        assertEquals(0, instance.bestRotation(new int[]{1, 3, 0, 2, 4}));
    }

}
