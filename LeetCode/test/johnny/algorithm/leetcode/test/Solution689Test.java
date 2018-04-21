package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution689;

public class Solution689Test {

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
        System.out.println("maxSumOfThreeSubarrays");
        Solution689 instance = new Solution689();

        assertArrayEquals(new int[] {0, 3, 5}, instance.maxSumOfThreeSubarrays(new int[] {1,2,1,2,6,7,5,1}, 2));
    }

}
