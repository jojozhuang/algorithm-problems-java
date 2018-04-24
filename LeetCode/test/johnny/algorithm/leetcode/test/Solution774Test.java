package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution774;

public class Solution774Test {

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
        System.out.println("minmaxGasDist");
        Solution774 instance = new Solution774();

        assertEquals(0.500000, instance.minmaxGasDist(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 9),0.001);
    }

}
