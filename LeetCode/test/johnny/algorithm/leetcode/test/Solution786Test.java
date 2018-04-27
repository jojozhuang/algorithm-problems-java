package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution786;

public class Solution786Test {

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
        System.out.println("kthSmallestPrimeFraction");
        Solution786 instance = new Solution786();

        assertArrayEquals(new int[] {2, 5}, instance.kthSmallestPrimeFraction(new int[] {1, 2, 3, 5}, 3));
        assertArrayEquals(new int[] {1, 7}, instance.kthSmallestPrimeFraction(new int[] {1, 7}, 1));
    }

}
