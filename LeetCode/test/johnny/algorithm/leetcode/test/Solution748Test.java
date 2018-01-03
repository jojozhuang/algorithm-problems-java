package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution748;

public class Solution748Test {

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
    public void testDominantIndex() {
        System.out.println("dominantIndex");
        
        Solution748 instance = new Solution748();
        assertEquals(-1, instance.dominantIndex(null));
        assertEquals(0, instance.dominantIndex(new int[] {1}));
        assertEquals(-1, instance.dominantIndex(new int[] {2, 3}));
        assertEquals(1, instance.dominantIndex(new int[] {0, 4}));
        assertEquals(1, instance.dominantIndex(new int[] {3, 6, 1, 0}));
        assertEquals(-1, instance.dominantIndex(new int[] {1, 2, 3, 4}));
    }

}
