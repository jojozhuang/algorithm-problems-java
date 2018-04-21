package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution697;

public class Solution697Test {

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
        System.out.println("findShortestSubArray");
        Solution697 instance = new Solution697();

        assertEquals(2, instance.findShortestSubArray(new int[] {1, 2, 2, 3, 1}));
        assertEquals(6, instance.findShortestSubArray(new int[] {1,2,2,3,1,4,2}));
        
    }

}
