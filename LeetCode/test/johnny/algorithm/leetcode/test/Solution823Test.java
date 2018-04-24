package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution823;

public class Solution823Test {

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
        System.out.println("numFactoredBinaryTrees");
        Solution823 instance = new Solution823();
        
        assertEquals(3, instance.numFactoredBinaryTrees(new int[] {2, 4}));
        assertEquals(7, instance.numFactoredBinaryTrees(new int[] {2, 4, 5, 10}));
    }

}
