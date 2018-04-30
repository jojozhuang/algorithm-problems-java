package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution493;

public class Solution493Test {

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
        System.out.println("reversePairs");
        Solution493 instance = new Solution493();

        assertEquals(2, instance.reversePairs(new int[] {1,3,2,3,1}));
        assertEquals(3, instance.reversePairs(new int[] {2,4,3,5,1}));
    }
}
