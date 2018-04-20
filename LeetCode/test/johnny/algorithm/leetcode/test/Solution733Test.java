package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution733;

public class Solution733Test {

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
        System.out.println("floodFill");
        Solution733 instance = new Solution733();

        int[][] image1 = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] result1 = {{2,2,2},{2,2,0},{2,0,1}};
        assertArrayEquals(result1, instance.floodFill(image1,1,1,2));
    }

}
