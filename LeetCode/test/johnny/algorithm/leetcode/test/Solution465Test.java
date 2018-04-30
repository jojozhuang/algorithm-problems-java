package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution465;

public class Solution465Test {

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
        System.out.println("minTransfers");
        Solution465 instance = new Solution465();

        int[][] transactions1 = new int[][] {{0,1,10},{2,0,5}};
        assertEquals(2, instance.minTransfers(transactions1));
        
        int[][] transactions2 = new int[][] {{0,1,10},{1,0,1},{1,2,5},{2,0,5}};
        assertEquals(1, instance.minTransfers(transactions2));
    }
}
