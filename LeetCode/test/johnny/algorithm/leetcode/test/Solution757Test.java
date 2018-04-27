package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution757;

public class Solution757Test {

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
        System.out.println("intersectionSizeTwo");
        Solution757 instance = new Solution757();

        int[][]intervals1 = {{1, 3}, {1, 4}, {2, 5}, {3, 5}};
        assertEquals(3, instance.intersectionSizeTwo(intervals1));
    
        int[][]intervals2 = {{1, 2}, {2, 3}, {2, 4}, {4, 5}};
        assertEquals(5, instance.intersectionSizeTwo(intervals2));

    }

}
