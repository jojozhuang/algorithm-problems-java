package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution766;

public class Solution766Test {

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
        System.out.println("isToeplitzMatrix");
        
        Solution766 instance = new Solution766();
        assertEquals(false, instance.isToeplitzMatrix(null));
        assertEquals(true, instance.isToeplitzMatrix(new int[][] {{}}));
        assertEquals(true, instance.isToeplitzMatrix(new int[][] {{1}}));
        assertEquals(true, instance.isToeplitzMatrix(new int[][] {{1,2,3,4}}));
        assertEquals(false, instance.isToeplitzMatrix(new int[][] {{1,2},{2,2}}));
        assertEquals(true, instance.isToeplitzMatrix(new int[][] {{1,2,3,4},{5,1,2,3},{9,5,1,2}}));
    }

}
