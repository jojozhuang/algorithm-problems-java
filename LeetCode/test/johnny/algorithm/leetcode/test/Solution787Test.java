package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution787;

public class Solution787Test {

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
        System.out.println("maxIncreaseKeepingSkyline");
        Solution787 instance = new Solution787();

        assertEquals(200, instance.findCheapestPrice(3, new int[][] {{0,1,100},{1,2,100},{0,2,500}}, 0, 2, 1));
        assertEquals(500, instance.findCheapestPrice(3, new int[][] {{0,1,100},{1,2,100},{0,2,500}}, 0, 2, 0));
    }

}
