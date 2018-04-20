package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution739;

public class Solution739Test {

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
        System.out.println("dailyTemperatures");
        Solution739 instance = new Solution739();

        assertArrayEquals(new int[] {1, 1, 4, 2, 1, 1, 0, 0}, instance.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73}));
    }

}
