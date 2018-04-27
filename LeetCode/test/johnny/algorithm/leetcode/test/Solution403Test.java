package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution403;

public class Solution403Test {

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
        System.out.println("canCross");
        Solution403 instance = new Solution403();

        assertEquals(true, instance.canCross(new int[] {0,1,3,5,6,8,12,17}));
        assertEquals(false, instance.canCross(new int[] {0,1,2,3,4,8,9,11}));
    }

}
