package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution523;

public class Solution523Test {

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
        System.out.println("checkSubarraySum");
        Solution523 instance = new Solution523();

        assertEquals(true, instance.checkSubarraySum(new int[] {23, 2, 4, 6, 7}, 6));
        assertEquals(true, instance.checkSubarraySum(new int[] {23, 2, 6, 4, 7}, 6));
    }

}
