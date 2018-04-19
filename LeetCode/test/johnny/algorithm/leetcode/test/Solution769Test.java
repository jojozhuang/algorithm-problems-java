package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution769;

public class Solution769Test {

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
        System.out.println("maxChunksToSorted");
        Solution769 instance = new Solution769();

        assertEquals(1, instance.maxChunksToSorted(new int[] {4,3,2,1,0}));
        assertEquals(4, instance.maxChunksToSorted(new int[] {1,0,2,3,4}));
    }

}
