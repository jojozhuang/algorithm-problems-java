package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution674;

public class Solution674Test {

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
        System.out.println("findLengthOfLCIS");
        Solution674 instance = new Solution674();

        assertEquals(3, instance.findLengthOfLCIS(new int[] {1,3,5,4,7}));
        assertEquals(1, instance.findLengthOfLCIS(new int[] {2,2,2,2,2}));
    }

}
