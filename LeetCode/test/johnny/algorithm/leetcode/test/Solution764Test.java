package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution764;

public class Solution764Test {

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
        System.out.println("orderOfLargestPlusSign");
        Solution764 instance = new Solution764();

        int[][] mines1 = new int[][] {{4, 2}};
        assertEquals(2, instance.orderOfLargestPlusSign(5, mines1));

        int[][] mines2 = new int[][] {{}};
        //assertEquals(1, instance.orderOfLargestPlusSign(2, mines2));

        int[][] mines3 = new int[][] {{0, 0}};
        assertEquals(0, instance.orderOfLargestPlusSign(1, mines3));
    }

}
