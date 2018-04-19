package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution768;

public class Solution768Test {

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
        Solution768 instance = new Solution768();

        assertEquals(1, instance.maxChunksToSorted(new int[] {5,4,3,2,1}));
        assertEquals(4, instance.maxChunksToSorted(new int[] {2,1,3,4,4}));
    }

}
